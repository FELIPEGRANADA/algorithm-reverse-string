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
public class Main {
    // Main method to execute the program
    public static void main(String[] args) {
        // Define the test strings
        String cadena1 = "(bar)";
        String cadena2 = "foo(bar)baz";
        String cadena3 = "foo(bar)baz(blim)";
        String cadena4 = "foo(bar(baz))blim";
        String cadena5 = "foo(bar)(baz)(blim)";
        String cadena6 = "(a)";
        String cadena7 = "(foo(bar(baz(blim))))";
        String cadena8 = "foo(bar(baz)(blimb))";
        
        // Instance of the class ReverseString
        ReverseString rs = new ReverseString();
        
        // Reverse the string
        System.out.println("Cadena en reversa: "+ cadena1 + " "+ rs.reverseInParentheses(cadena1));
        System.out.println("Cadena en reversa: "+ cadena2 + " "+ rs.reverseInParentheses(cadena2));
        System.out.println("Cadena en reversa: "+ cadena3 + " "+ rs.reverseInParentheses(cadena3));
        System.out.println("Cadena en reversa: "+ cadena4 + " "+ rs.reverseInParentheses(cadena4));
        System.out.println("Cadena en reversa: "+ cadena5 + " "+ rs.reverseInParentheses(cadena5));
        System.out.println("Cadena en reversa: "+ cadena6 + " "+ rs.reverseInParentheses(cadena6));
        System.out.println("Cadena en reversa: "+ cadena7 + " "+ rs.reverseInParentheses(cadena7));
        System.out.println("Cadena en reversa: "+ cadena8 + " "+ rs.reverseInParentheses(cadena8));         
    }
}
