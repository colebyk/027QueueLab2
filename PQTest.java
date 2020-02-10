import java.util.PriorityQueue;

public class PQTest {
	PriorityQueue<String> pQueue;
	String[] listArray;
	int queueSize;
	
	public PQTest(String list) {
		pQueue = new PriorityQueue<String>();
		listArray = list.split(" ");
		for (int i = 0; i < listArray.length; i++) {
			pQueue.add(listArray[i]);
		}
		queueSize = pQueue.size();
	}
	
	public void doLabTasks() {
		System.out.println("toString() - " + pQueue);
		System.out.println("getMin() - " + pQueue.peek());
		String naturalOrder = "";
		for (int i = 0; i < queueSize; i++) {
			naturalOrder += pQueue.remove() + " ";
		}
		System.out.println("getNaturalOrder() - " + naturalOrder);
	}
}
