package com.gmail.odynets.leonid;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter side a: ");
		Scanner sc = new Scanner(System.in);
		double a;
		a = sc.nextDouble();

		System.out.println("Enter side b: ");
		double b;
		b = sc.nextDouble();

		System.out.println("Enter side c: ");
		double c;
		c = sc.nextDouble();

		if (a + b >= c && a + c >= b && b + c >= a) {
			System.out.println("Triangle exist!");
		} else {
			System.out.println("Triangle doesn't exist!");
		}

	}

}
