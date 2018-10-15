package carlxuan.collections;

import java.util.LinkedList;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueTest {

	public static void main(String[] args) {
//		testLinkedList();
//		testLinkedQueue();
		
		Stack<String> s = new Stack<>();
		s.push("1");
		s.push("2");
		s.push("3");
		System.out.println(s);
		System.out.println(s.pop());
	
		System.out.println(s.lastElement());
	}
	
	private static void testLinkedList() {
		LinkedList<String> list = new LinkedList<>();
//		list.push("a");
//		list.push("b");
//		list.push("c");
		list.offer("a");
		list.offer("b");
		list.offer("c");
		System.out.println(list);
//		list.pop();
		list.poll();
		System.out.println(list);
	}
	
	private static void testLinkedQueue() {
		LinkedBlockingQueue<String> list = new LinkedBlockingQueue<>();
		list.offer("a");
		list.offer("b");
		list.offer("c");
		System.out.println(list);
		list.poll();
		System.out.println(list);
	}

}
