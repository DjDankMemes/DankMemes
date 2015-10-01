import java.util.Scanner;
class Prime{
   public static void main(String[]args){		
	long temp;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a number for check:");
	
	long num=scan.nextInt();
	for(long i=2;i<=num/2;i++){
           temp=num%i;
	   if(temp==0){
	      isPrime=false;
	      break;
	   }
	}
	if(isPrime)
	   System.out.println(num + " is Prime Number");
	else
	   System.out.println(num + " is not Prime Number");
   }
}
