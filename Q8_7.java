package chapter8;

import java.util.Scanner;

public class Q8_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		//System.out.print("Enter the number of points :");
		double [][] points= {{-1,0,3},{-1,-1,-1},{4,1,1},{2,0.5,9},
		{3.5,2,-1},{3,1.5,3},{-1.5,4,2},{5.5,4,-0.5}};
		
		compare(points);
	}

	private static void compare(double[][] points) {
		// TODO Auto-generated method stub
		double distance1 =0,distance2 =0, shortest = 10;
		for(int i=0;i<points.length;i++) {
			for(int j=i+1;j<points.length;j++) {
				
					 distance1 += Math.pow((j-i), 2);
					 distance2= Math.pow(distance1,0.5);
			}
			if(distance2<shortest) {
				distance2=shortest;
			}
			
		}
		System.out.print("The sortedt distance is "+shortest );
		
	}

}
