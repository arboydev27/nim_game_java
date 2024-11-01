/**
 * @author Arboy magomba
 * @version 1.0
 * Lab 7
 */

public class Nim {

	private Player currentPlayer;
	private Player waitingPlayer;
	private Piles piles;
	private Player winner = null;
	private Player loser = null;

	public Nim(Player p1, Player p2, int[] initSizes) {
		currentPlayer = p1;
		waitingPlayer = p2;
		piles = new Piles(initSizes);
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public Player getWaitingPlayer() {
		return waitingPlayer;
	}

	public int[] getPileSizes() {
		return piles.getSizes();
	}

	public Player getWinner() {
		return winner;
	}

	public Player getLoser() {
		return loser;
	}

	public void takeTurn() {
		// TODO: Implement this method.
		
		while (true) {
	        try {
	            // Get a move from the current player.
	            int[] move = currentPlayer.getMove(piles.getSizes());

	            // Try to remove the specified number of objects from the piles.
	            piles.removeObjects(move);

	            // If the move is successful, notify the waiting player.
	            waitingPlayer.notifyOpponentMove(currentPlayer.getName(), move);

	            // Move was successful, so break the loop.
	            break;
	        } catch (IllegalMoveException e) {
	            // Step 4: If the Piles object throws an IllegalMoveException, catch it and notify the current player.
	            currentPlayer.notifyIllegalMove(e.getMessage());
	        }
	    }
		
		
	}

	public void checkGameOver() {
		if (piles.isEmpty()) {
			winner = waitingPlayer;
			loser = currentPlayer;
		}
	}

	public void swapPlayers() {
		Player temp = currentPlayer;
		currentPlayer = waitingPlayer;
		waitingPlayer = temp;
	}

	public void play() {
		while (winner == null || loser == null) {
			takeTurn();
			checkGameOver();
			swapPlayers();
		}
		winner.notifyWin();
		loser.notifyLose();
	}
}
