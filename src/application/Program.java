package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter the number o lines in this matrix: ");
		int lines = scanner.nextInt();
		System.out.print("Enter the number o columns in this matrix: ");
		int columns = scanner.nextInt();
		
		int[][] matrix = new int[lines][columns];
		
		System.out.println("Enter the values of the matrix: ");
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		System.out.println();
		
		System.out.print("Enter the value you want to verify: ");
		int number = scanner.nextInt();
		System.out.println();
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < columns; j++) {
				if (number == matrix[i][j]) {
					System.out.println("Position found: line " + (i+1) + ", column " + (j+1) + ":");
					if (j - 1 >= 0) System.out.println("Left: " + matrix[i][j - 1]);
					if (i - 1 >= 0) System.out.println("Up: " + matrix[i - 1][j]);
					if (j + 1 < columns) System.out.println("Right: " + matrix[i][j + 1]);
					if (i + 1 < lines) System.out.println("Down: " + matrix[i + 1][j]);
				}
			}
		}
		
		scanner.close();
	
	}

}
