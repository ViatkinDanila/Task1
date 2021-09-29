import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		sc.close();
		System.out.println((b+Math.sqrt(b*b+4*a*c))/(2*a)-Math.pow(a,3.0)*c-Math.pow(b,-2.0));
	}
}
