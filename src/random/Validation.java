//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
			
		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
		int randomNumber = new Random().nextInt(5); //4
		
		// 2. On paper, write all the numbers that get printed when you run this class 10 times
		
		System.out.println(randomNumber);

		// 3. Use each value of randomNumber to give the user a random compliment.
		// 4. Repeat all the code above 10 times
		for (int i = 0; i < 10; i++) {
			 randomNumber = new Random().nextInt(5);
			if (randomNumber == 0) {
				System.out.println("You've got an amazing face.");
			}
			if (randomNumber == 1) {
				System.out.println("Someday, people will see you for who you truly are.");
			}
			if (randomNumber == 2) {
				System.out.println("You're in great shape.");
			}
			if (randomNumber == 3) {
				System.out.println("You're great at what you do.");
			}
			if (randomNumber == 4) {
				System.out.println("You are so talented.");
			}
		}
		// 5. Find someone to test out your program. They will like it :)
	}
}
