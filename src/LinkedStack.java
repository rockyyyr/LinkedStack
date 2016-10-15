import java.util.NoSuchElementException;

/**
 * LinkedStack. A linked list implementation of a stack collection.
 * @author Rocky Robson - A00914509
 * @version Oct 12, 2016
 */
public class LinkedStack<E> {

	private Node first;
	private int size;

	/**
	 * Node. A node contains an item and a link to the next node
	 */
	public class Node {
		private E item;
		private Node next;
	}

	/**
	 * Default constructor
	 */
	public LinkedStack() {
		first = null;
	}

	/**
	 * Returns the amount of items in the collection
	 * @return The size of the collection as an int
	 */
	public int size() {
		return this.size;
	}

	/**
	 * Returns whether or not the collection is empty
	 * @return True if the collection is empty.
	 */
	public boolean isEmpty() {
		return first == null;
	}

	/**
	 * Adds an item to the front of the collection
	 * @param item Item to be added. Must not be null
	 * @throws NullPointerException() is the argument item is null
	 */
	public void push(E item) {
		if (item == null)
			throw new NullPointerException();

		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		size++;
	}

	/**
	 * Removes an item from the collection and returns its value
	 * @return The item to be returned
	 * @throws NoSuchElementException() if the collection is empty
	 */
	public E pop() {
		if (isEmpty())
			throw new NoSuchElementException();

		E item = first.item;
		first = first.next;
		size--;
		return item;
	}

	/**
	 * Returns the next item in the collection without removing it from the
	 * stack
	 * @return The item to be returned
	 */
	public E peek() {
		return first.item;
	}

}
