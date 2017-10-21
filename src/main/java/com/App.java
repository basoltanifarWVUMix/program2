package com;

import java.util.Scanner;

import com.generic.implement.BasicArithmaticOperations;

/**
 * Hello world!
 *
 */
public class App {
	static Scanner scanner = new Scanner(System.in);

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		String ch = "Y";
		BasicArithmaticOperations basicArithmaticOperations = new BasicArithmaticOperations();
		basicArithmaticOperations.menue();
		while (ch.equalsIgnoreCase("Y") || ch.equalsIgnoreCase("YES")) {
			System.out.println("please enter your choice !! \n");
			String Input = scanner.nextLine();
			String result = basicArithmaticOperations.choice(Input);
			System.out.println("\n Result is " + result);
			System.out.println("Do you wish to continue? (Y|N) \n");
			ch = scanner.nextLine();
		}
	}
}
