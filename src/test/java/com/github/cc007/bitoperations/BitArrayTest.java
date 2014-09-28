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
public class BitArrayTest {
    
    public BitArrayTest() {
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
     * Test of toByteArray method, of class BitArray.
     */
    @Test
    public void testToByteArray() {
        System.out.println("toByteArray");
        BitArray instance = null;
        byte[] expResult = null;
        byte[] result = instance.toByteArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBit method, of class BitArray.
     */
    @Test
    public void testSetBit_int_int() {
        System.out.println("setBit");
        int pos = 0;
        int val = 0;
        BitArray instance = null;
        instance.setBit(pos, val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBit method, of class BitArray.
     */
    @Test
    public void testGetBit_int() {
        System.out.println("getBit");
        int pos = 0;
        BitArray instance = null;
        int expResult = 0;
        int result = instance.getBit(pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBit method, of class BitArray.
     */
    @Test
    public void testSetBit_3args() {
        System.out.println("setBit");
        int pos = 11;
        int val = 1;
        byte[] expResult = new byte[2];
        expResult[0] = (byte) 0x00FF; // binary: 11111111  
        expResult[1] = (byte) 0x0010; // binary: 00010000
        byte[] result = new byte[2];
        result[0] = (byte) 0x00FF; // binary: 11111111  
        result[1] = (byte) 0x0000; // binary: 00000000
        BitArray.setBit(result, pos, val);
        System.out.println(" Expected value: " + Integer.toString(expResult[0], 2) + " " + Integer.toString(expResult[1], 2));
        System.out.println(" Real value: " + Integer.toString(result[0], 2) + " " + Integer.toString(result[1], 2));
        Assert.assertArrayEquals(expResult, result);
        pos = 4;
        val = 0;
        expResult[0] = (byte) 0x00F7; // binary: 11110111  
        expResult[1] = (byte) 0x0010; // binary: 00010000
        BitArray.setBit(result, pos, val);
        System.out.println(" Expected value: " + Integer.toString(expResult[0], 2) + " " + Integer.toString(expResult[1], 2));
        System.out.println(" Real value: " + Integer.toString(result[0], 2) + " " + Integer.toString(result[1], 2));
        Assert.assertArrayEquals(expResult, result);
    }

    /**
     * Test of getBit method, of class BitArray.
     */
    @Test
    public void testGetBit_byteArr_int() {
        System.out.println("getBit");
        byte[] data = new byte[2];
        data[0] = (byte) 0x00FF; // binary: 11111111  
        data[1] = (byte) 0x0000; // binary: 00000000
        int pos = 5;
        int expResult = 1;
        int result = BitArray.getBit(data, pos);
        assertEquals(expResult, result);
        pos = 10;
        expResult = 0;
        result = BitArray.getBit(data, pos);
        assertEquals(expResult, result);
    }
    
}
