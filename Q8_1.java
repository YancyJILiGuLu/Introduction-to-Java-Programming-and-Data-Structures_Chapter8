package chapter8;

import java.util.Scanner;

public class Q8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][]matrix=new double[3][4];
		Scanner input= new Scanner (System.in);
		System.out.print("Enter a 3-by-4 matrix row by row:");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j]=input.nextDouble();
			}
		}
		sumColumn(matrix);
		
		
	}

	private static void sumColumn(double[][] matrix) {
		// TODO Auto-generated method stub
		double maxColumn=0;
		
		
		
			maxColumn=matrix[0][0];
		
		for(int column =0;column<matrix[0].length;column++) {
			double total=0;
			for(int row=0;row<matrix.length;row++) 
				total+=matrix[row][column];
				System.out.print("Sum of the elements at column " + column+
						"is "+total+"\n");
			
		}
		
	}

}
