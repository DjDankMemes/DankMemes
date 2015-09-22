import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner myln=new Scanner(System.in);
        int number;
        number=myln.nextInt();
    CheckIt cI=new CheckIt();
        if(cI.isDivisible(number)){
            System.out.println("For real my homie its divisible by 17 gg");
    }else{
            System.out.println("Nah dawg dat aint divisible by 17 ya dig");
    }
    }
}
