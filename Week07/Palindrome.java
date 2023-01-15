/**
 * Write a description of class MyQueue here.
 * 
 * @author Christianne Gargoles
 * @version 10/18/2018
 /**
 * Write a description of class Palindrome here.
 * 
 * @author Christianne Gargoles
 * @version 10/18/2018
 */


// Java program to find if there is a pair that 
// can form a palindrome. 
import java.util.Arrays; 
import java.util.List; 
public class Palindrome { 
          
    // Utility function to check if a string is a 
    // palindrome 
    static boolean isPalindrome(String str) 
    { 
        int len = str.length(); 
       
        // compare each character from starting 
        // with its corresponding character from last 
        for (int i = 0; i < len/2; i++ ) 
            if (str.charAt(i) != str.charAt(len-i-1)) 
                return false; 
       
        return true; 
    } 
       
    // Function to check if a palindrome pair exists 
    static boolean checkPalindromePair(List<String> vect) 
    { 
        // Consider each pair one by one 
        for (int i = 0; i< vect.size()-1; i++) 
        { 
            for (int j = i+1; j< vect.size() ; j++) 
            { 
                String check_str = ""; 
       
                // concatenate both strings 
                check_str = check_str + vect.get(i) + vect.get(j); 
       
                // check if the concatenated string is 
                // palindrome 
                if (isPalindrome(check_str)) 
                    return true; 
            } 
        } 
        return false; 
    } 
       
    // Driver code 
    public static void main(String args[]) 
    { 
        List<String> vect = Arrays.asList("geekf", "geeks", "or", 
                                "keeg", "abc", "bc"); 
       
       
        if (checkPalindromePair(vect) == true) 
            System.out.println("Yes"); 
        else    
            System.out.println("No"); 
        }
    }