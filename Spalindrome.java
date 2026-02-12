import java.util.Scanner;
public class Spalindrome {
    static boolean palindrome (String s , int st, int e)
    {
        if(st>=e)
           return true;
        if(s.charAt(st)!=s.charAt(e))
            return false;
        palindrome(s,st+1,e-1);
        return true;

    }

public static void main (String []args)
{
Scanner sc= new Scanner(System.in);
String ss=sc.next();
if (palindrome(ss,0,ss.length()-1))
    System.out.println("it is palindrome");
else
    System.out.println("it is not palindrome");
}
}