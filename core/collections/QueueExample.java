package core.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue();
		queue.add(1);
		System.out.println(queue);
		queue.add(2);
		queue.add(3);
		System.out.println(queue);
	}

}
