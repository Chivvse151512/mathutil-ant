/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.chivv.mathutil.test.core;

import com.chivv.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author ASUS
 */
@RunWith(value = Parameterized.class)
//bao voi jUnit va jvm rang class nay se tach data ra khoi Assert
//khi run class nay, JUnit se tu sinh ra them code de fill data vao trong ham assertE()
//dung code theo cach thuc bi ep tuan thu 1 logic nao do => ta dang dung FRAMEWORK
public class MathUtilityAdvancedTest {

    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Object[][]{
            {0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120},};
    }

    @Parameterized.Parameter(value = 0)
    public int n;
    @Parameterized.Parameter(value = 1)
    public long expected;

    @Test
    public void testFactorialGivenRightArgumentReturnWell() {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
