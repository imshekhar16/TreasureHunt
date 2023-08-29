package com.aurionpro.test;

import java.util.Scanner;

public class TreasureHunt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Treasure Island. Lets find the treasure.");

		System.out.print("Left or right? ");
		String ch1 = sc.next();

		if (ch1.equalsIgnoreCase("left")) {
			System.out.print("Swim or wait? ");
			String ch2 = sc.next();

			if (ch2.equalsIgnoreCase("wait")) {
				System.out.print("Red or blue? ");
				String ch3 = sc.next();

				if (ch3.equalsIgnoreCase("blue")) {
					System.out.print("Which door? ");
					String ch4 = sc.next();

					if (ch4.equalsIgnoreCase("yellow")) {
						System.out.println("You Win!");
					} else {
						System.out.println("Eaten by beasts. Game Over!");
					}
				} else {
					System.out.println("Burned by fire. Game Over!");
				}
			} else {
				System.out.println("Attacked by trout. Game Over!");
			}
		} else {
			System.out.println("Fall into a hole. Game Over!");
		}
	}
}
