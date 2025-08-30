//Check if a String is palindrome or not using Recursion :
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String word=sc.nextLine();
        palindrome(0,word.length()-1,word);
        
    }
    
    public static void palindrome(int start,int end,String word)
    {
        if(start>end)
        {
            System.out.println("Palindrome");
        
            return;
        }
        if(word.charAt(start)!=word.charAt(end))
        {
            System.out.println("Not palindrome");
            return;
        }
        palindrome(start+1,end-1,word);
    }
}
