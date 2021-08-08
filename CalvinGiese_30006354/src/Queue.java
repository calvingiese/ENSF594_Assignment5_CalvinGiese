/**
 * Class Name: Queue
 * 
 * Creates a queue of students and allows for enqueueing, dequeueing, peeking and checking the size.
 * 
 * This class is used to create a queue of students that helps apply the level-order traversal of a BST.
 * 
 * @author Calvin Giese
 * @version version 1.0
 * @since August 8, 2021
 *
 */

public class Queue {

	/**
	 * The size of the queue to be created
	 */
	private int maxSize;
	
	/**
	 * The queue in an array form, to be filled with students
	 */
	private Student[] queueArray;
	
	/**
	 * The first item to be dequeued from the queue
	 */
	private int front;
	
	/**
	 * The last item to be dequeued from the queue
	 */
	private int rear;
	
	/**
	 * The number of items in the queue
	 */
	private int nItems;
	
	/**
	 * Constructs a new queue with all standard starting values
	 * 
	 * @param s is the size of the queue to create
	 */
	public Queue(int s) {
		maxSize = s;
		queueArray = new Student[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	/**
	 * This method adds a student to the back of the queue
	 * 
	 * @param s is the student to be added
	 */
	public void enqueue(Student s) {
		if(rear == maxSize -1) {
			rear = -1;
		}
		queueArray[++rear] = s;
		nItems++;
	}
	
	/**
	 * This method releases a student from the front of the queue
	 * 
	 * @return the student at the front
	 */
	public Student dequeue() {
		Student temp = queueArray[front++];
		if(front == maxSize) {
			front = 0;
		}
		
		nItems--;
		return temp;
	}
	
	/**
	 * This method is used to see the student at the front without making it exit the queue
	 * 
	 * @return the student at the front of the queue
	 */
	public Student peek() {
		return queueArray[front];
	}
	
	/**
	 * This method returns the number of items in the queue
	 * 
	 * @return nItems which is the number of students currently in the queue
	 */
	public int size() {
		return this.nItems;
	}
}
