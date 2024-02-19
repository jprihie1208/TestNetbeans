/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.calculadoramaven;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alumno Tarde
 */
public class CalculadoraMavenTest {
    
    public CalculadoraMavenTest() {
    }

    @org.junit.Test
    public void testDividir() {
        CalculadoraMaven cal=new CalculadoraMaven();
        System.out.println("Dividir");
        int a=10;
        int b=5;
        int expResult = 2;
        int result = cal.dividir(a, b);
        assertEquals(expResult, result);
    }
//    
//    @org.junit.Test
//    public void testDividirB() {
//        CalculadoraMaven cal=new CalculadoraMaven();
//        System.out.println("Dividir 2");
//        int a=10;
//        int b=0;
//        int expResult = 0;
//        int result = cal.dividir(a, b);
//        assertEquals(expResult, result);
//    }
//    
}
