/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab2;

/**
 *
 * @author tvodden
 */
public class Ex2 {

  //Requires: <A real string a>   
  //Modifies: <Does not modify anything>   
  //Effects:  <Returns true or false depending on whether the string is a Palindrome>     
    public static boolean isPalindrome(String a) {
        String b="";
        int n=a.length();
        int i;
        
        for(i=n-1;i>=0;i--){
            b=b + a.charAt(i);
        }
        if(b.equalsIgnoreCase(a)){
            System.out.println("True");
            return true;
        }
        else{
            System.out.println("False");
            return false;
        }
    }

public static void main(String[] args) {        
    if(args.length == 1) {            
        if (args[0].equals("1"))                
            System.out.println(isPalindrome(null));   
       else if (args[0].equals("2"))   
            System.out.println(isPalindrome(""));    
       else if (args[0].equals("3"))              
            System.out.println(isPalindrome("deed")); 
       else if (args[0].equals("4"))               
           System.out.println(isPalindrome("abcd"));   
    }
}
}