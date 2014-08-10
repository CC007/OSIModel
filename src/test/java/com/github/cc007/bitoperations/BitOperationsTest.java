/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.bitoperations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rik
 */
public class BitOperationsTest {

    public BitOperationsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setBit method, of class BitOperations.
     */
    @Test
    public void testSetBit() {
        System.out.println("setBit");
        int pos = 11;
        int val = 1;
         byte[] expResult = new byte[2];
        expResult[0] = (byte) 0x00FF; // binary: 11111111  
        expResult[1] = (byte) 0x0010; // binary: 00010000
        byte[] result = new byte[2];
        result[0] = (byte) 0x00FF; // binary: 11111111  
        result[1] = (byte) 0x0000; // binary: 00000000
        BitOperations.setBit(result, pos, val);
        System.out.println(" Expected value: " + Integer.toString(expResult[0], 2) + " " + Integer.toString(expResult[1], 2));
        System.out.println(" Real value: " + Integer.toString(result[0], 2) + " " + Integer.toString(result[1], 2));
        Assert.assertArrayEquals(expResult, result);
        pos = 4;
        val = 0;
        expResult[0] = (byte) 0x00F7; // binary: 11110111  
        expResult[1] = (byte) 0x0010; // binary: 00010000
        BitOperations.setBit(result, pos, val);
        System.out.println(" Expected value: " + Integer.toString(expResult[0], 2) + " " + Integer.toString(expResult[1], 2));
        System.out.println(" Real value: " + Integer.toString(result[0], 2) + " " + Integer.toString(result[1], 2));
        Assert.assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of getBit method, of class BitOperations.
     */
    @Test
    public void testGetBit() {
        System.out.println("getBit");
        byte[] data = new byte[2];
        data[0] = (byte) 0x00FF; // binary: 11111111  
        data[1] = (byte) 0x0000; // binary: 00000000
        int pos = 5;
        int expResult = 1;
        int result = BitOperations.getBit(data, pos);
        assertEquals(expResult, result);
        pos = 10;
        expResult = 0;
        result = BitOperations.getBit(data, pos);
        assertEquals(expResult, result);
    }

}
