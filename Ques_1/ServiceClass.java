package com;

import java.util.Stack;

public class ServiceClass {
   public static void SkyScrapper(Stack<Integer> stack,int floor, int day, int lastVal){
	   Stack<Integer> stcomp = new Stack<Integer>();
	   
		for (Integer st : stack) {
			int ctr = 1;
			day++;
			if (st != floor) {
				System.out.println("Day: " + day + "\n");
				stcomp.push(st);

			} else if (st == floor) {
				System.out.println("Day: " + day + "\n" + st);
				for (int k = 1; k <= stcomp.size(); k++) {
					if (ctr == k) {
						for (Integer st1 : stcomp) {
							if (st1 == st - k) {
								System.out.println(st1);
								lastVal = st1;
								ctr++;
							}
						}
					} else {
						break;
					}
				}
				if (ctr == 1) {
					lastVal = st;
				}
				floor = lastVal - 1;
			}
		}
   }
}
