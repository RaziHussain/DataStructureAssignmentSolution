package com;

import java.util.Scanner;
import java.util.Stack;

public class BuildSkyScraper {

	static int floor;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("enter the total no of floors in the building: ");
		floor = sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>();

		int day = 0;
		int lastVal = 0;
		for (int i = 0; i < floor; i++) {
			System.out.println("enter the floor size given on day: ");
			stack.push(sc.nextInt());
		}
		ServiceClass.SkyScrapper(stack, floor, day, lastVal);

	}
}
