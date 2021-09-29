import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static int min(int f,int s){return ((f <= s)? f : s);};
	public static int max(int f,int s){return ((f >= s)? f : s);};
	public static void main(String[] args) {
		int a,b,c,minN,maxN;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		sc.close();
		minN = min(a,min(b,c));
		maxN = max(a,max(b,c));
		System.out.println("Min of this 3 is:" + minN + "\nMax of this 3 is:" + maxN);
			
		
	}
}
