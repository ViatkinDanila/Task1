import java.util.Scanner;  
public class Main {
	public static void main(String[] args) {
		int num;
		num = inputIntFromConsole();
		if(num/1000+num/100%10 == num%100/10+num%10){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
	public static int inputIntFromConsole(){
		int num;
		System.out.println("Enter the four-digit number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
	}
	public static void 
}
