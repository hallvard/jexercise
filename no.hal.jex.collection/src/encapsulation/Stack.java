package encapsulation;

import java.util.ArrayList;

public class Stack {
	
	private ArrayList<String> stringList = new ArrayList<String>();
	
	public void push(String str) {
		stringList.add(str);
	}
	
	public String pop() {
		if (stringList.size() >= 1) {
			String str = stringList.get(stringList.size()-1);
			stringList.remove(stringList.size()-1);
			return str;
		} else {
			return null;
		}
	}
	
	public String peek(int i) {
		if (0 <= i && i <= stringList.size()-1) {
			return stringList.get(stringList.size()-1-i);			
		} else {
			return null;
		}
	}
	
	
	public int getSize() {
		return stringList.size();
	}
	
	public String toString() {
		String returnStr = "[";
		for (String str : stringList) {
			returnStr += str + ", ";
		}
		return returnStr.substring(0, returnStr.length()-2) + "]";
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		System.out.println(stack);
		System.out.println(stack.peek(3));
		System.out.println(stack.pop());
		System.out.println(stack);
	}
}
