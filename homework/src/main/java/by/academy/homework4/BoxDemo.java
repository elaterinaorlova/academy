package by.academy.homework4;

public class BoxDemo {

	public static void main(String[] args) {

		Box<Integer> box1 = new Box<>();
		Box<String> box2 = new Box<>(2);
		box1.addItem(10);
		box1.addItem(50);
		box1.addItem(100);
		System.out.println(box1);
		box2.addItem("Dog");
		box2.addItem("Cat");
		box2.addItem("Frog");
		System.out.println(box2);
		System.out.println(box1.get(1));
		System.out.println(box2.get(1));
		System.out.println(box1.getLast());
		System.out.println(box2.getLast());
		System.out.println(box1.getFirst());
		System.out.println(box2.getFirst());
		box1.boxSize();
		box2.boxSize();
		box1.boxLastIndex();
		box2.boxLastIndex();
		box1.remove(0);
		System.out.println(box1);
		box2.remove(1);
		System.out.println(box2);
		box1.removeObject(50);
		System.out.println(box1);
		box2.removeObject("Dog");
		System.out.println(box2);
	}
}
