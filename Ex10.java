import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void printMatrix(int[][] matrix){
		for(int i = 0; i < matrix.length;i++){
			for(int j = 0; j < matrix[0].length; j++){
				System.out.printf("[%4d]",matrix[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] matrix;
		int n,j,i;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Enter n:");
			n = sc.nextInt();
		}while(n%2!=0);
		matrix = new int[n][n];
		
		for(i = 0; i < n; i+=2)
		{
			for(j = 0; j < n; j++){
				matrix[i][j] = j+1;
				matrix[i+1][j] = matrix[i].length-j;
			}
		}
		printMatrix(matrix);
	}
}
