package com.ksg.collection;

import java.util.PriorityQueue;

public class PriorityDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
	        
	        System.out.println(priorityQueue.peek());
	        
	        //System.out.println(priorityQueue.element());
	        
	        for(int i=1;i<=10;i++) {
	            priorityQueue.offer(i);
	        }
	        
	        System.out.println(priorityQueue);
	        System.out.println(priorityQueue.poll());
	        System.out.println(priorityQueue);

	    }


	}

 