package com.generic.implement;

import java.util.Scanner;

import com.generic.arithmetic.Arithmetic;

public class BasicArithmaticOperations extends Arithmetic implements ImpInterface {
	private Scanner scanner = new Scanner(System.in);
	private String base;
	private String num1;
	private String num2;
	private String result;

	public void menue() {
		String message = "\n Valide bases are : 2, 8, 10, 16.  Also, please ensure that the value of and the number to convert is entered in the same base as the input base.";
		System.out.println(message);
		String display = "****************************** \n" + "for Addition enter add \n"
				+ "for floatAdd enter floatAdd \n" + "for Subtraction enter sub \n"
				+ "for floatSubtract enter floatSub \n" + "for multiplication enter mult \n"
				+ "for floatMultiplication enter floatMult \n" + "for division enter divid \n"
				+ "for floatDivision enter floatDivid \n" + " for SquareRoot enter squareRoot \n"
				+ "for floatSquareRoot enter floatSquareRoot \n" + "for exponentt enter exponent \n"
				+ "for floatExponentt enter floatExponen \n" + "****************************** \n";
		System.out.println(display);

	}

	public String choice(String ch) {
		if (ch.equalsIgnoreCase("add")) {
			System.out.println("add");
			System.out.println(numberMessage());
			base = scanner.nextLine();
			num1 = scanner.nextLine();
			num2 = scanner.nextLine();
			result = add(Integer.parseInt(base.trim().intern()), num1, num2);
			System.out.println(result);
			return result;

		} else if (ch.equalsIgnoreCase("floatAdd")) {
			System.out.println("floatAdd");
			System.out.println(floatNumberMessage());
			num1 = scanner.nextLine();
			num2 = scanner.nextLine();
			result = floatAdd(num1, num2);
			System.out.println(result);
			return result;

		} else if (ch.equalsIgnoreCase("sub")) {
			System.out.println("sub");
			System.out.println(numberMessage());
			base = scanner.nextLine();
			num1 = scanner.nextLine();
			num2 = scanner.nextLine();
			result = subtract(Integer.parseInt(base.trim().intern()), num1, num2);
			System.out.println(result);
			return result;

		} else if (ch.equalsIgnoreCase("floatSub")) {
			System.out.println("floatSub");
			System.out.println(floatNumberMessage());
			num1 = scanner.nextLine();
			num2 = scanner.nextLine();
			result = floatSubtract(num1, num2);
			System.out.println(result);
			return result;

		} else if (ch.equalsIgnoreCase("mult")) {
			System.out.println("mult");
			System.out.println(numberMessage());
			base = scanner.nextLine();
			num1 = scanner.nextLine();
			num2 = scanner.nextLine();
			result = multiply(Integer.parseInt(base.trim().intern()), num1, num2);
			System.out.println(result);
			return result;

		} else if (ch.equalsIgnoreCase("floatMult")) {
			System.out.println("floatMult");
			System.out.println(floatNumberMessage());
			num1 = scanner.nextLine();
			num2 = scanner.nextLine();
			result = floatMultiply(num1, num2);
			System.out.println(result);
			return result;

		} else if (ch.equalsIgnoreCase("divid")) {
			System.out.println("divid");
			System.out.println(numberMessage());
			base = scanner.nextLine();
			num1 = scanner.nextLine();
			num2 = scanner.nextLine();
			result = divide(Integer.parseInt(base.trim().intern()), num1, num2);
			System.out.println(result);
			return result;

		} else if (ch.equalsIgnoreCase("floatDivid")) {
			System.out.println("floatDivid");
			System.out.println(floatNumberMessage());
			num1 = scanner.nextLine();
			num2 = scanner.nextLine();
			result = floatDivide(num1, num2);
			System.out.println(result);
			return result;

		} else if (ch.equalsIgnoreCase("squareRoot")) {
			System.out.println("squareRoot");
			System.out.println("\"please enter  base and number \n");
			base = scanner.nextLine();
			num1 = scanner.nextLine();
			result = squareRoot(Integer.parseInt(base.trim().intern()), num1);
			System.out.println(result);
			return result;

		} else if (ch.equalsIgnoreCase("floatSquareRoot")) {
			System.out.println("floatSquareRoot");
			System.out.println("\"please enter number \n");
			num1 = scanner.nextLine();
			result = floatSquareRoot(num1);
			System.out.println(result);
			return result;

		} else if (ch.equalsIgnoreCase("exponent")) {
			System.out.println("exponent");
			System.out.println(numberMessage());
			base = scanner.nextLine();
			num1 = scanner.nextLine();
			num2 = scanner.nextLine();
			result = exponent(Integer.parseInt(base.trim().intern()), num1, num2);
			System.out.println(result);
			return result;

		} else if (ch.equalsIgnoreCase("floatExponen")) {
			System.out.println("floatExponen");
			System.out.println(floatNumberMessage());
			num1 = scanner.nextLine();
			num2 = scanner.nextLine();
			result = floatExponent(num1, num2);
			System.out.println(result);
			return result;

		} else {

		}
		return "";

	}

	private String numberMessage() {
		return "please enter base , number1 and number2 \n";
	}

	private String floatNumberMessage() {
		return "please enter  number1 and number2 \n";
	}

}
