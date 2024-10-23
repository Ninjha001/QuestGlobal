package basicjavaprg;
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		Stack s = new Stack();
		System.out.println(s);
		s.push("A");
		System.out.println(s);
		s.push("B");
		System.out.println(s);
		s.push("C");
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		s.push("D");
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.size());
		System.out.println(s.empty());
		System.out.println(s.search("B"));   //returns -1 if it isn't present in stack. Indexing starts from 1.
	}

}
