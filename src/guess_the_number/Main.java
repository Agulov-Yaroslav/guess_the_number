package guess_the_number;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Давай сыграем в игру. Угадай число, которое Я загадал от 1 до 100");
		int min = 1;
		int max = 100;
		int myNumber = (int) (Math.random() * (max - min + 1) + min);
		boolean continueLoop = true;
		int attempts = 0;
		
		do {
			try {
				System.out.print("Введи от 1 до 100: ");
				int a = scanner.nextInt();
				attempts++;
				if (a == myNumber) {
					System.out.print("Да, это мое число. ТЫ УГАДАЛ!");
					continueLoop = false;
				} else if (a < myNumber) {
					System.out.println("Мое число больше. Попробуй еще раз");

				} else if (a > myNumber) {
					System.out.println("Мое число меньше. Попробуй еще раз");

				} else {
					System.out.println("Это число от 1 до 100. Попробуй еще раз");

				}
			} catch (InputMismatchException e) {
				System.out.println("Это ведь не число. Попробуй еще раз");
				scanner.next();
			}

		} while (continueLoop);
		
		System.out.println("Ты угадал число за " + attempts + " попыток!");
		scanner.close();
		
	}
}
