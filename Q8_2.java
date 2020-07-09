package chapter8;

import java.util.Scanner;

public class Q8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][]matrix=new double[4][4];
		Scanner input= new Scanner (System.in);
		System.out.print("Enter a 4-by-4 matrix row by row:");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j]=input.nextDouble();
			}
		}
		sumMarjorDiagonal(matrix);

	}

	private static void sumMarjorDiagonal(double[][] matrix) {
		// TODO Auto-generated method stub
		//int indexOfMaxColumn=0;
		double total=0;

		double maxColumn=matrix[0][0];

		for(int row =0;row<matrix[0].length;row++) {

			for(int column=0;column<matrix[row].length;column++) 
				if(row==column) {
					total+=matrix[row][column];

					if(total>maxColumn) {
						maxColumn=total;
						
					}
				}
			

		}
		System.out.print("Sum of the elements in the "
				+ "marjor diagonal is "+maxColumn+"\n");
	}

}
