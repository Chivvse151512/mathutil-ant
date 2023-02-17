/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.chivv.mathutil.test.core;

import com.chivv.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ASUS
 */
public class MathUtilityTest {

    @Test
    public void testFactorialGivenRightArgumentReturnWell() {
        //Test case #1; test getF() with n = 0;
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);

        //Test case #2: test getF() with n = 1;
        // expected: 1 
        Assert.assertEquals(1, MathUtility.getFactorial(1));

        //Test case #3: test getF() with n = 6
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        Assert.assertEquals(120, MathUtility.getFactorial(5));
    }

    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        //Test case 4: test getF(), with n < 0;
        ///Expected:
        for (int i = -10; i < 0; i++) {
            MathUtility.getFactorial(i);
        }
        
        //neu chi viet 
    }
    
    //DDT - Data driven testing
}
