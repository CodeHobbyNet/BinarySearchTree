package net.codehobby.binarysearchtree;

/**
 * Binary Search Tree Node
 *
 * @author Jeff Crone
 */
public class Node<Key extends Comparable<Key>, Value> 
{
	private Key key;
	private Value value;
	private Node left, right;
	private int N;

	public Node( Key newKey, Value newValue, int newN )
	{
		key = newKey;
		value = newValue;
		N = newN;
	}
}
