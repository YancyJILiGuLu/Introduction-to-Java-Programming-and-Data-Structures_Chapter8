package chapter8;

public class Q8_3 {
	// int[] correctCounter=new int[answers.length];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char [][] answers= {{'A','B','A','C','C','D','E','E','A','D'},
				{'D','B','A','B','C','A','E','E','A','D'},
				{'E','D','D','A','C','B','E','E','A','D'},
				{'C','B','A','E','D','C','E','E','A','D'},
				{'A','B','D','C','C','D','E','E','A','D'},
				{'B','B','E','C','C','D','E','E','A','D'},
				{'B','B','A','C','C','D','E','E','A','D'},
				{'E','B','E','C','C','D','E','E','A','D'}};
		
		char [] keys = {'D','B','D','C','C','D','A','E','A','D'};
		 int[] correctCounter=new int[answers.length];
		 char[] names= {'0','1','2','3','4','5','6','7'};
		 
		 correctCounter=compare(answers,keys);
		order(correctCounter,names);
		
		

	}

	private static void order(int[] correctCounter,char[] name) {
		// TODO Auto-generated method stub
		
		char temChar =' ';
		for(int a=0;a<correctCounter.length;a++) {
			for(int b=a+1;b<correctCounter.length;b++) {
				if(correctCounter[a]>correctCounter[b]) {
					int tem = correctCounter[a];
					correctCounter[a]=correctCounter[b];
					correctCounter[b]=tem;
					temChar=name[a];
					name[a]=name[b];
					name[b]=temChar;
					
					
				}
				
				
			}
			System.out.print("Student" + name[a]+ 
					"'s correct answers is"+correctCounter[a]+"\n" );
		}
		
		
	}

	private static int[] compare(char[][] answers, char[] keys) {
		// TODO Auto-generated method stub
		int[] correctCounter= new int[answers.length];
		for(int i=0;i<answers.length;i++) {
			
			
			for(int j=0;j<answers[i].length;j++) {
				if(answers[i][j]==keys[j]) {
					correctCounter[i]++;
				}
			}			
		}
		return correctCounter;
	}
}
			

		
		

	
