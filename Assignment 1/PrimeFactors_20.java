import java.util.Scanner;
class Question20{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		primeFactors(num);
		
	}
	
	public static void primeFactors(int n){
		
		while(n%2 == 0){
			System.out.print(2 + " ");
			n = n/2;
		}
		
		for(int i=3;i<=n/2;i=i+2){
			
			while(n%i==0){
				System.out.print(i + " ");
				n = n/i;
			}
		}
		if(n > 2)
			System.out.print(n);
	}
}