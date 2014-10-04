/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.bitoperations;

import java.util.Arrays;

/**
 *
 * @author Rik
 */
public class BitArray {

    /**
     * Length of the bit array (in bit)
     */
    int length;

    /**
     * The bitArray that is stored (as byte array)
     */
    byte[] bitArray;

    /**
     * Constructor of a new empty BitArray.
     *
     * The number of bytes is the minimum amount of bytes needed to store the
     * number of bits
     *
     * @param length length of the BitArray (in bits)
     */
    public BitArray(int length) {
        this.length = length;
        this.bitArray = new byte[(length - 1) / 8 + 1];
    }

    /**
     * Constructor of a BitArray with predefined content
     *
     * The number of bytes is the minimum amount of bytes needed to store the
     * number of bits
     *
     * @param length length of the BitArray (in bits)
     * @param bitArray the predefined content
     */
    public BitArray(int length, byte[] bitArray) {
        this.length = length;
        this.bitArray = Arrays.copyOf(bitArray, (length - 1) / 8 + 1);
    }

    /**
     * Return the byte array, corresponding to the bit array
     *
     * If the bit array doesn't have a length that is dividable by 8, the last
     * byte of the returned byte array is padded with random bits
     *
     * @return the bit array as byte array
     */
    public byte[] toByteArray() {
        return bitArray;
    }

    /**
     * Set a bit at a certain position to a certain value (0 or 1)
     *
     * @param pos the position of the bit you want to change
     * @param val the value (0 or 1) you want to set the bit to
     */
    public void setBit(int pos, int val) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (pos >= length) {
            throw new ArrayIndexOutOfBoundsException("The position that you wanted to change is longer than the length of this bit array!");
        }
        if (val < 0 || val > 1) {
            throw new IllegalArgumentException("The value should be 0 or 1!");
        }
        int posByte = pos / 8;
        int posBit = pos % 8;
        byte oldByte = bitArray[posByte];
        oldByte = (byte) (((0xFF7F >> posBit) & oldByte) & 0x00FF);
        byte newByte = (byte) ((val << (8 - (posBit + 1))) | oldByte);
        bitArray[posByte] = newByte;
    }

    /**
     * Get the bit at a certain position
     *
     * @param pos the position of the bit you want to retrieve
     * @return the value of the bit
     */
    public int getBit(int pos) throws ArrayIndexOutOfBoundsException {
        if (pos >= length) {
            throw new ArrayIndexOutOfBoundsException("The position that you wanted to retrieve is longer than the length of this bit array!");
        }
        int posByte = pos / 8;
        int posBit = pos % 8;
        byte valByte = bitArray[posByte];
        int valInt = valByte >> (8 - (posBit + 1)) & 0x0001;
        return valInt;
    }

    /**
     * Static version: set a bit at a certain position in a given byte array to
     * a certain value (0 or 1)
     *
     * @param data the byte array to retrieve the data from
     * @param pos the position of the bit you want to change
     * @param val the value (0 or 1) you want to set the bit to
     */
    public static void setBit(byte[] data, int pos, int val) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (pos >= data.length * 8) {
            throw new ArrayIndexOutOfBoundsException("The provided input was shorter then the position that you wanted to change!");
        }
        if (val < 0 || val > 1) {
            throw new IllegalArgumentException("The value should be 0 or 1!");
        }
        int posByte = pos / 8;
        int posBit = pos % 8;
        byte oldByte = data[posByte];
        oldByte = (byte) (((0xFF7F >> posBit) & oldByte) & 0x00FF);
        byte newByte = (byte) ((val << (8 - (posBit + 1))) | oldByte);
        data[posByte] = newByte;
    }

    /**
     * Static version: get the bit at a certain position from a given byte array
     *
     * @param data the byte array to retrieve the data from
     * @param pos the position of the bit you want to retrieve
     * @return the value of the bit
     */
    public static int getBit(byte[] data, int pos) throws ArrayIndexOutOfBoundsException {
        if (pos >= data.length * 8) {
            throw new ArrayIndexOutOfBoundsException("The provided input was shorter then the position that you wanted to retrieve!");
        }
        int posByte = pos / 8;
        int posBit = pos % 8;
        byte valByte = data[posByte];
        int valInt = valByte >> (8 - (posBit + 1)) & 0x0001;
        return valInt;
    }
}
