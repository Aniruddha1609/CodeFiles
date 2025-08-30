//Factorial of n numbers:
import java.util.*;
class Factorial{
public static void main(String[] args){
    System.out.println("Enter the number:");
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println(fact(num));
}
public static int fact(int num){
    if(num==1)
    {
        return 1;
    }
    return(num*fact(num-1));
}
}    
