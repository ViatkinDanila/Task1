import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();
		if(x <= 4 && x >= -4 && y >= -3 && y <= 4){
			if(x>2&&y>0||x<-2&&y>0){
				System.out.println("false");
			}else{
				System.out.println("true");
			}
		}else{
			System.out.println("false");
		}
	}
}
