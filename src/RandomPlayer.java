/**
 * @author Arboy magomba
 * @version 1.0
 * Lab 7
 */

import java.util.Random;

public class RandomPlayer extends Player{
	
	private Random generator;

	public RandomPlayer(String name) {
		super(name);
		this.generator = new Random();
	}

	@Override
	public int[] getMove(int[] pileSizes) {
		int pile;
        do {
            pile = generator.nextInt(pileSizes.length);
        } while (pileSizes[pile] == 0);

        int stones = generator.nextInt(pileSizes[pile]) + 1;

        return new int[]{pile, stones};
	}

}
