/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.chivv.mathutil.main;

import com.chivv.mathutil.core.MathUtility;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testFactorialGivenWrongArgumentThrowsException();
        testFactorialGivenRightArgumentReturnsWell();
    }
    //kiem thu 
    public static void testFactorialGivenWrongArgumentThrowsException() {
        //Test case 6: test getF(); with n = -1;
        //Expected value an illegal Argument Exception is throw
        try{
            System.out.println("Test -1! | Expected: illegal Arument Exception is throw"
                   + " | Actual: ??");
            MathUtility.getFactorial(-1);
        }catch (Exception e){
            System.out.println(e);
        }
        
    } 
    
    public static void testFactorialGivenRightArgumentReturnsWell() {
        //Case 1: test getF() with n = 0;
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n +"! | expected: " + expectedValue + " | actual: " + actualValue );
        
        //case 2: test getf() with n = 1;
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n +"! | expected: " + expectedValue + " | actual: " + actualValue );
        
        //case 3: test getf() with n = 2;
        n = 2;
        expectedValue = 2;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n +"! | expected: " + expectedValue + " | actual: " + actualValue );
        
        //case 4: test getf() with n = 3;
        n = 3;
        expectedValue = 6;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n +"! | expected: " + expectedValue + " | actual: " + actualValue );
        
        //case 5: test getf() with n = 5;
        n = 5;
        expectedValue = 120;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n +"! | expected: " + expectedValue + " | actual: " + actualValue );
    }
    
}
