//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringTest
{
 private String word;

 public StringTest()
 {
    Scanner keyboard = new Scanner(System.in);
   System.out.print("Enter a word to test: ");
   setString(keyboard.next());
 }

 

   public void setString(String s)
   {
    word=s;
   }

 public boolean isPalindrome()
 {
  return false;
 }

 public String toString()
 {
   return word;
   
 }
}