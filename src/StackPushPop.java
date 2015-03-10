import java.util.Stack;


public class StackPushPop {

	public static void main(String[] args) {
	Stack<String> stack = new Stack<String>();
	
	//stact`a element ekledik
	stack.push("bottom");
	//print ediyoruz stack`i
	printStack(stack);

	stack.push("second");
	printStack(stack);
	
	stack.push("third");
	printStack(stack);
	
	stack.pop();
	printStack(stack);
	stack.pop();
	printStack(stack);
	stack.pop();
	printStack(stack);
	}
	
	private static void printStack(Stack<String> s) {
	if(s.isEmpty())
	System.out.println("Stack is free");
	else
	System.out.printf("%s TOP\n", s);
	}
}

