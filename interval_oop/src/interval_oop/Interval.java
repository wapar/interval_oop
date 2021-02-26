package interval_oop;

import java.util.Arrays;
import java.util.stream.IntStream;

/** 
 * Each instance of this class represents a sequence of consecutive integers. 
 * 
 * abstract state invariants: (a.k.a. public invariants)
 * 
 * @invar The width is nonnegative
 * 		| getLowerBound() <= getUpperBound()
 * 
 * @immutable
 */
public class Interval {
	
	// getter or inspector methods --- defines the class's abstract state space = set of possible abstract values/states 
	// immutable class -> the abstract value of an instance
	// mutable class -> the current abstract state of an instance
	
	/**
	 *@basic
	 */
	public int getLowerBound() { throw new RuntimeException("Not yet implemented"); }
	/**
	 *@basic
	 */
	public int getUpperBound() { throw new RuntimeException("Not yet implemented"); }
	/**
	 *@post The result equals the upper bound minus the lower bound.
	 *		| result == getUpperBound() - getLowerBound()
	 */
	public int getWidth() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @post The result is not null
	 * 		| getElements() != null
	 * @post The sequence of elements equals the sequence starting at the lower bound (inclusive) and ending at the upper bound (inclusive).
	 * 		| Arrays.equals(getElements(), IntStream.range(getLowerBound(), getUpperBound() + 1).toArray())
	 */
	public int[] getElements() { throw new RuntimeException("Not yet implemented");}
	
	/**
	 * Initialises this object so that it represents the interval 
	 * specified by the lower and upper bound.
	 * 
	 * @pre The given lower bound is not greater then the given upper bound.
	 * 		| lowerBound <= upperBound
	 * @post This interval's lower bound equals the given lower bound.
	 * 		| getLowerBound() == lowerBound
	 * @post This interval's upper bound equals the given upper bound.
	 * 		| getUpperBound() == upperBound
	 */
	public Interval(int lowerBound, int upperBound) { throw new RuntimeException("Not yet implemented"); }
	
	// no mutators --- no methods that change the object's abstract state
	
	
	
	
}
