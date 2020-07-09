package chapter8;

public class Q8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] hours= {{2,4,3,4,5,8,8},
				{7,3,4,3,3,4,4},
				{3,3,4,3,3,2,2},
				{9,3,4,7,3,4,1},
				{3,5,4,3,6,3,8},
				{3,4,4,6,3,4,4},
				{3,7,4,8,3,8,4},
				{6,3,5,9,2,7,9}};
		char[] names= {'0','1','2','3','4','5','6','7'};
		int[]totalHours= new int[8];
		totalHours=countTotalHours(hours);
		show(totalHours,names);
	}

	private static void show(int[] totalHours, char[] names) {
		// TODO Auto-generated method stub
		char temName =' ';
		for(int a=0;a<totalHours.length;a++) {
			for(int b=a+1;b<totalHours.length;b++) {
				if(totalHours[a]>totalHours[b]) {
					int tem = totalHours[a];
					totalHours[a]=totalHours[b];				
					totalHours[b]=tem;
					
					temName=names[a];
					names[a]=names[b];
					names[b]=temName;
					
					
				}
				
				
			}
			System.out.print("Employee" + names[a]+ 
					"'s work hours is"+totalHours[a]+"\n" );
		}
		
		
	}

	private static int[] countTotalHours(int[][] hours) {
		int[]totalHours= new int[8];
		for(int i=0;i<hours.length;i++) {
			for(int j=0;j<hours[i].length;j++) {
				totalHours[i]+=hours[i][j];
			}
		}
		
		return totalHours;
		// TODO Auto-generated method stub
		
	}

}
