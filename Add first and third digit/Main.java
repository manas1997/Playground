import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
      int n=scan.nextInt();
      int first_digit=n/100;
      int last_digit=n%10;
      int sum = first_digit+last_digit;
      System.out.println(sum);
      
	}
}