package digits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrawingDigits {
	
	public static void printArray(String[][] arr,int N,int M){
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public static String[][] drawingZero(int N,int M){
		String mas[][]=new String[N][M];
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if(((i==0 || i==N-1) && j<M-2 && j!=0 ) || j==0||j==M-2) mas[i][j]="*";
				else  mas[i][j]=" ";
			}
		}
		return mas;
	}
	public static String[][] drawingOne(int N,int M){
		String mas[][]=new String[N][M];
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if(j==M/2+1 || (i<N/2+1 && j==M/2-i)) mas[i][j]="*";
				else mas[i][j]=" ";
			}
		}
		return mas;
	}
	public static String[][] drawingTwo(int N,int M){
		String mas[][]=new String[N][M];
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if((i==0 || i==N-1)&&j!=0&&j<M-1 ||(i>0 && i<N-1) && j==M-i-1) mas[i][j]="*";
				else mas[i][j]=" ";
			}
		}
		return mas;
	}
	public static String[][] drawingThree(int N,int M){
		String mas[][]=new String[N][M];
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if((i==0 || i==N-1)&&j!=0&&j<M-1 || (i==N/2 && j==M/2-1) ||
						(i<N/2 && j==M-i-2) || (i>N/2 && i==j+1)) mas[i][j]="*";
				else mas[i][j]=" ";
			}
		}
		return mas;
	}
	public static String[][] drawingFour(int N,int M){
		String mas[][]=new String[N][M];
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if(j==M-2 || (i==N/2 && j<M-2&&j!=0) || (i<N/2 && j==1)) mas[i][j]="*";
				else mas[i][j]=" ";
			}
		}
		return mas;
	}
	public static String[][] drawingFive(int N,int M){
		String mas[][]=new String[N][M];
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if((i==N/2 || i==0 || i==N-1)&&j!=0&&j<M-1 || (i<N/2 && j==1) || (i>N/2 && j==M-2)) mas[i][j]="*";
				else mas[i][j]=" ";
			}
		}
		return mas;
	}
	public static String[][] drawingSix(int N,int M){
		String mas[][]=new String[N][M];
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if((i==N/2 || i==0 || i==N-1)&&j!=0&&j<M-1 || j==1 || (i>N/2 && j==M-2)) mas[i][j]="*";
				else mas[i][j]=" ";
			}
		}
		return mas;
	}
	public static String[][] drawingSeven(int N,int M){
		String mas[][]=new String[N][M];
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if((i==N/2 || i==0)&&j!=0&&j<M-1 || j==M-i-1) mas[i][j]="*";
				else mas[i][j]=" ";
			}
		}
		return mas;
	}
	public static String[][] drawingEight(int N,int M){
		String mas[][]=new String[N][M];
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if((i==0 || i==N-1)&&j!=0&&j<M-1 || (i!=N/2 && (j==1 || j==M-2)) || (i==N/2 && j==N/2)) mas[i][j]="*";
				else mas[i][j]=" ";
			}
		}
		return mas;
	}
	public static String[][] drawingNine(int N,int M){
		String mas[][]=new String[N][M];
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if((i==N/2 || i==0 || i==N-1)&&j!=0&&j<M-1 || (i<N/2 && j==1) || j==M-2) mas[i][j]="*";
				else mas[i][j]=" ";
			}
		}
		return mas;
	}
	
	public static void main(String[] args){
		int N=9,M=8;
				String arr[][][]={drawingZero(N,M),drawingOne(N,M),drawingTwo(N,M),drawingThree(N,M),
						drawingFour(N,M),drawingFive(N,M),drawingSix(N,M),drawingSeven(N,M),drawingEight(N,M),drawingNine(N,M)};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String userInput = null;
	     System.out.print("Enter the number: ");
	      try {
			userInput = (String) br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      char character;
          int number[]=new int[userInput.length()];
          String output[][] = new String[N][M*userInput.length()];
          System.out.println("You have entered: ");
          for(int i=0;i<userInput.length();i++){
        	  character = userInput.charAt(i);
        	  number[i] = character-'0';
          }
          for(int i=0;i<N;i++){
        	  int k=0;
        	  for(int j=0;j<M;j++){
        		  output[i][j]=arr[number[0]][i][j];
        		  if(j==M-1){
        			  k=j+1;
        			  for(int a=0;a<number.length-1;a++){
        				  for(int p=0;p<M;p++) {
        					  if(k<M*number.length){
        						  output[i][k]=arr[number[a+1]][i][p];
        						  k++; 
        						  } 
        					  } 
        				  } 
        			  } 
        		  } 
        	  }
          printArray(output,N,M*number.length);
	}
}

