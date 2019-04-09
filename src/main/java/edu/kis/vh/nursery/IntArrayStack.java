package edu.kis.vh.nursery;

public class IntArrayStack implements IIntRoot{

	private static final int EMPTY = -1;
	private static final int SIZE = 12;
	private static final int FULL = SIZE - 1;

	private int[] numbers = new int[SIZE];

	private int total = EMPTY;

	@Override
	public void countIn(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	@Override
	public boolean callCheck() {
		return total == EMPTY;
	}
		
	public boolean isFull() {
		return total == FULL;
	}
		
	@Override
	public int peekaboo() {
		if (callCheck())
			return EMPTY;
		
		return numbers[total];
	}

	@Override
	public int countOut() {
		if (callCheck())
			return EMPTY;
		return numbers[total--];
	}
	
}
