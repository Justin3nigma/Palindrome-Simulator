package test;
import java.util.Scanner;

public class Palindrome {
   
      public static boolean checkPal(String input) {
         Stack stack = new Stack(input.length());
            
         for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i)); // add input one by one
            }
         
         for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) { 
               /* remove input one by one and if what's removed is not same as the input, then it means that it's not Palindrome
               Thus, return false*/
               return false;
               }
            }
         return true;
         }
      
   
      public static void main(String[] args) {
         
    	  System.out.println("Type the arguments");
    	  
    	  Scanner sc = new Scanner(System.in);
    	  String input = sc.nextLine(); 

         if (input.length() == 0){ // if there is no arguments 
            System.out.println("No arguments found");
         }
         
         else if (checkPal(input) == true) { // if "checkPal returns true"
            System.out.println("Palindrome : True");
            } 
         
         else { // if the length is not 0 and checkPal is not true
            System.out.println("Palindrome : False");
         }
         
         
         }
}