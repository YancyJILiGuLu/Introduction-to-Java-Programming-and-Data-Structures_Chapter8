package chapter8;
import java.util.Scanner;
public class Q8_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][]matrix1=new double[3][3];
		double[][]matrix2=new double[3][3];
		Scanner input= new Scanner (System.in);
		System.out.print("Enter a 3-by-3 matrix1 :");
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix1[i].length;j++) {
				matrix1[i][j]=input.nextDouble();
			}
		}
		System.out.print("Enter a 3-by-3 matrix2 :");
		for(int i=0;i<matrix2.length;i++) {
			for(int j=0;j<matrix2[i].length;j++) {
				matrix2[i][j]=input.nextDouble();
			}
		}

		multiplyMatrix(matrix1,matrix2);
	}

	private static void multiplyMatrix(double[][] matrix1, double[][] matrix2) {
		// TODO Auto-generated method stub
		double[][]ans=new double[3][3];
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix1[i].length;j++) {
				for(int k=0;k<3;k++) {
					ans[i][j]+=matrix1[i][k]* matrix2[k][j];
					
				}
				System.out.print(ans[i][j]+" ");
				
			}
			System.out.print("\n");
		}

	}


}


