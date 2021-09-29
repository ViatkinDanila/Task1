import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		int a,b;
		double c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		c = Math.sqrt(a*a+b*b);
		System.out.println("hypotenuse is:" + c+ "\nperimeter is:" + a+b+c + "\nsquare is:" + a*b/2);
	}
}
