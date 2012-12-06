import java.util.Random;
public class TestsSelfSortedList {
	public static void main(String[] args) {
		TestsSelfSortedList test = new TestsSelfSortedList();
		test.launch();
	}
	public void launch() {
		Random r = new Random();
		System.out.println("Making a new Self Sorted List...");
		IntListSelfSorted list = new IntListSelfSorted();
		for(int i=0; i<1000; i++) {
			list.add(r.nextInt(1000));
		}
		System.out.println("Contents of list:");
		for(int i=0; i<1000; i++) {
			System.out.println(list.get(i));
		}
	}
}