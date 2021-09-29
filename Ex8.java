import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		int A[],N,K, sum = 0;
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N:");
		N = sc.nextInt();
		System.out.println("Enter K:");
		K = sc.nextInt();
		sc.close();
		A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = ran.nextInt(100);
		}
		for(int i = 0; i < N; i++){
			if(A[i]%K == 0){
				sum += A[i];
			}
		}
		
		System.out.println("Sum is:" + sum);
	}
}
