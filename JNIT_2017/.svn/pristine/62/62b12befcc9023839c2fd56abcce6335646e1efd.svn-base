package com.jnit.ocp2017.collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Collection
//Queue extends Collection
//LinkedList,PriorityQueue and ,Dequeue, ArrayDeque
//FIFO
//Stack extends Vector -> LIFO
//Map interface
public class QueueMain {

	public static void main(String[] args) {
		Queue<String>q1 = new LinkedList<>();
		
		q1.add("ravi");//boolean or throws exception 
		q1.offer("raju");//returns boolean if no space is there for capacity restricted queue like ArrayBlockingqueue
		System.out.println(q1.peek());//returns null if queue is empty
		System.out.println(q1.element());//throws an exception if queue is empty
		q1.poll();//removes and returns the element, returns null
		System.out.println(q1);
		q1.remove();//throws an exception if queue is empty
		System.out.println(q1);
		System.out.println(q1.isEmpty());
		System.out.println(q1.contains("ramu"));
		
		ArrayDeque<String>q3 = new ArrayDeque<>();
		q3.offer("raja");
		q3.addFirst("ravi");
		q3.addLast("ramu");
		System.out.println(q3);
		q3.removeFirst();
		q3.removeLast();
		System.out.println(q3.removeFirstOccurrence("ramu"));
		System.out.println(q3.removeLastOccurrence("raja"));
		
		Stack<String>stack1 = new Stack<>();
		stack1.push("ramu");
		stack1.push("raja");
		System.out.println(stack1);
		String popped = stack1.pop();
		System.out.println(popped);
		System.out.println(stack1);
		stack1.add("rani");
		
		
		
	}

}
