package com.interpreter.calculator;

import java.util.Stack;

public class Calculator {
	
	private Node node;

	public void calculate(String instruction){
		String[] words = instruction.split(" ");
		Node left, right;
		Node value;
		Stack<Node> stack = new Stack<Node>();
		for (int i=0;i<words.length;){
			if (words[i].equals("*") || words[i].equals("%") || words[i].equals("/")){
				String operator = words[i];
				System.out.println(operator);
				left = stack.pop();
				System.out.println("Atfer pop : " + stack);
				right = new ValueNode(Integer.parseInt(words[++i]));
				if ("*".equals(operator)){
					stack.push(new MulNode(left, right));
					System.out.println("Atfer push : " + stack);
				}
				if ("/".equals(operator))
					stack.push(new DivNode(left, right));
				if ("%".equals(operator))
					stack.push(new ModNode(left, right));
				i++;
			}else {
				left = new ValueNode(Integer.parseInt(words[i++]));
				stack.push(left);
				System.out.println("Atfer push : " + stack);
			}
		}
		System.out.println(stack);
		node = stack.pop();
	}
	
	public int output(){
		return node.interpret();
	}
	

}
