/**
 * @author Arboy magomba
 * @version 1.0
 * Lab 7
 */

import java.util.Arrays;

public class Piles {
	// Instance variables
	private int[] sizes;
	
	
	// Constructors
	public Piles(int... initSizes) {
		
		// Is array reference is null/ the array has zero length
		if (initSizes == null || initSizes.length == 0) {
			throw new IllegalArgumentException();
		}
		
		// If any element of the array is not positive
		for (int i = 0; i < initSizes.length; ++i) {
			if (initSizes[i] <= 0) {
				throw new IllegalArgumentException();
			}
		}
		this.sizes = initSizes.clone();

	}
	
	// Getters, setters and other methods
	public int[] getSizes() {
		return sizes.clone();
	}
	
	public void removeObjects(int[] move) throws IllegalMoveException {
		// If array reference is null
		if (move == null) {
			throw new IllegalMoveException("null move");
		}
		
		// If the array has a length other than 2
		if (move.length != 2) {
			throw new IllegalMoveException("Invalid length: " + move.length);
		}
		
		// If the pile index is out of bounds
		int index = move[0];
        int number = move[1];
		if (index < 0 || index >= sizes.length) {
			throw new IllegalMoveException("Index out of bounds: " + index);
		}
		
		// If the pile has a size of 0
		if (sizes[index] == 0) {
			throw new IllegalMoveException("Pile " + index + " is empty.");
		}
		
		// If the object number is less than or equal to 0
		if (number <= 0) {
			throw new IllegalMoveException("Nonpositive object number: " + number);
		}
		
		// If the object number is greater than the pile size
		if (number > sizes[index]) {
			throw new IllegalMoveException("Object number greater than pile size: " + number + " > " + sizes[index]);
		}
		sizes[index] -= number;
	}
	
	public boolean isEmpty() {
		for (int i = 0; i < sizes.length; ++i) {
			if (sizes[i] != 0) {
				return false;
			}
		}
		return true;
		
		/*
		for (int size : sizes) {
            if (size > 0) {
                return false;
            }
        }
        return true;
        */
	}
}