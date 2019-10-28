package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivExApp {

	public static void main(String[] args) throws InputMismatchException {
		Scanner scan = new Scanner(System.in);
		boolean num1 = true;
		boolean num2 = true;
		double input1 = 1;
		double input2 = 1;
		do {
			try {
				System.out.println("Enter two numbers to divide");
				input1 = scan.nextInt();
				input2 = scan.nextInt();
				num1 = true;
				num2 = true;
				if (input1 == 0 & input2 == 0) {
					throw new DivByZeroException();
				} else if (input1 == 0) {
					throw new DivWithZeroException();
				}

				else if (input2 == 0) {
					throw new DivByZeroException();
				}

			} catch (InputMismatchException ime) {
				System.out.println("there's not even a number there wtf");
				num1 = false;
				num2 = false;
			} catch (DivByZeroException dbz) {

				System.out.println("I'm sorry Dave, I'm afraid I can't do that");
			} catch (DivWithZeroException dwz) {
				System.out.println(0);
			}catch(Exception e){
				break;
			}finally {
				scan.close();
			}
		} while (!num1 & !num2);
		if (!(input1 == 0) & !(input2 == 0)) {
			System.out.println(input1 / input2);
		}
	}

}