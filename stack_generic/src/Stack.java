
public  class Stack <T> {
private T[]  data;
private  int  top;
public Stack(int size)  {
	data = (T[]) new Object[size];
	top = -1;
  }
public void push(T value)  {
    top++;
    data[top] = value;
  }
public T pop()  {
    return data[top--];
  }
public T top() {
    return data[top];
  }

public static void main(String[] args) {
    Stack<Integer> intStack = new Stack<>(10);
    intStack.push(1);
    intStack.push(2);
    intStack.push(3);
    System.out.println("Top element (intStack): " + intStack.top());
    System.out.println("Popped element (intStack): " + intStack.pop());
    System.out.println("Top element after pop (intStack): " + intStack.top());
    
    Stack<Integer> intStack2 = new Stack<>(10);
    intStack.push(1);
    intStack.push(2);
    intStack.push(3);
    System.out.println("Top element (intStack2): " + intStack.top()); 
    System.out.println("Popped element (intStack2): " + intStack.pop()); 
    System.out.println("Top element after pop (intStack2): " + intStack.top()); 

    Stack<String> stringStack = new Stack<>(10);
    stringStack.push("hello");
    stringStack.push("world");
    System.out.println("Top element (stringStack): " + stringStack.top()); 
    System.out.println("Popped element (stringStack): " + stringStack.pop());
    System.out.println("Top element after pop (stringStack): " + stringStack.top()); 
    
    Stack<Stack> stacks = new Stack<>(10);
    stacks.push(intStack);
    stacks.push(intStack2);
    stacks.push(stringStack);
    System.out.println("Top element (stacks): " + intStack.top()); 
    System.out.println("Popped element (stacks): " + intStack.pop()); 
    System.out.println("Top element after pop (stacks): " + intStack.top()); 

}
}
