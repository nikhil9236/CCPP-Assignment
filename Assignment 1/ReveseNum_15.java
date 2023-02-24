import java.util.Scanner;
class Question15{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		int rev = reverse(num);
		System.out.println(rev);
		
	}
	
	public static int reverse(int n){
		
		int sum = 0;
		
		while(n!=0){
			
			int rem = n%10;
			sum =sum*10 + rem;
			n = n/10;
		}
		
		return sum;
	}
}
	
