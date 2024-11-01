/**
 * @author Arboy magomba
 * @version 1.0
 * Lab 7
 */

public class IllegalMoveException extends Exception {
	
	private long serialVersionUID;
	
	public IllegalMoveException(String moveInfo) {
		super(moveInfo);
	}

}
