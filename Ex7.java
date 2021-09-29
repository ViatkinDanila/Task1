import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static double function(double x){return Math.pow(Math.sin(x), 2) - Math.cos(2*x);};
	public static void main(String[] args) {
		double a,b,h;
		double eps = 0.01;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Enter h:");
			h = sc.nextDouble();
		}while(h<eps);
		a = sc.nextDouble();
		b = sc.nextDouble();
		sc.close();
		System.out.println("x			F(x)");
		for(double x = a; x <= b; x+=h){
			System.out.println(x + "		" + function(x));
		}
	}
}
