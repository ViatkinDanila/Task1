import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		double[] num = new double[3];
		Scanner sc = new Scanner(System.in);
		num[0]=sc.nextInt();
		num[1]=sc.nextInt();
		num[2]=sc.nextInt();
		sc.close();
		for(int i = 0; i < num.length;i++){
			if(num[i] < 0){
				num[i] = Math.pow(num[i],4);
			}else{
				num[i] = Math.pow(num[i],2);
			}
			System.out.println(num[i]);
		}
	}
}
