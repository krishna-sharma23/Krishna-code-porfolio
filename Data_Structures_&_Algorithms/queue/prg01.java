package queue;

public class prg01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.dequeue();
		queue.display();
		
	}

}
