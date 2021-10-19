/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithm.projectreversestring;

/**
 *
 * @author pipel
 */
public class ReverseString {
    
    // Reverse a String in parentheses
    public String reverseInParentheses(String inputString)
    {
        // Character of the input String 
        char ch;
        // String to reverse
        String reverseString;        
        
        // Analize each character of the input String
        for(int i=0; i< inputString.length(); i++)
        {            
            // Get the character in the position i
            ch = inputString.charAt(i);
            // If the character is a open parentheses
            if (ch == '(')
            {
                // Get the string in reverse
                reverseString = reverse(inputString.substring(i));
                // Build the new string to continue its review
                inputString = inputString.substring(0,i) + 
                              reverseString + 
                              inputString.substring(i + reverseString.length());
                // Change the position of the index
                i = i + reverseString.length() - 1;
            }                
        }
        // Eliminate the parentheses of the result
        inputString = inputString.replace("(", "");
        inputString = inputString.replace(")", "");
        return inputString;
    }
    
    private String reverse(String inputString)
    {
       // Character of the input String 
        char ch;
        // String to reverse
        String reverseString;
        // Aux string to reverse
        String auxString;
        // Result String 
        String result = "";
        
        // Analize each character of the input String 
        for(int i=1; i< inputString.length(); i++)
        {            
            // Get the character in the position i
            ch = inputString.charAt(i);
            // If the character is a open parentheses
            if (ch == '(')
            {
                // Get the string in reverse
                reverseString = reverse(inputString.substring(i));
                // Build the new string to continue its review
                inputString = inputString.substring(0,i) + 
                              reverseString + 
                              inputString.substring(i + reverseString.length());
                // Change the position of the index
                i = i + reverseString.length() - 1;                
            }
            // If the character is a close parentheses
            else if (ch == ')')
            {
                // Get the string to reverse
                auxString = inputString.substring(0, i+1);
                // Reverse the string
                for(int j=auxString.length() - 1; j>=0; j--)
                {
                    result = result + auxString.charAt(j);
                }
                // Break the cycle to continue its review
                break;
            }
        }
        
        return result;
    }
}
