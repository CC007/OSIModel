/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.keyfeatures;

/**
 *
 * @author Rik
 */
public interface CompressionControl {

    public static final int COMPRESSION_CLEAR_TEXT = 0;

    /**
     * set the compression type of the content
     *
     * @param compressionType the compression type
     */
    public void setCompressionType(int compressionType);

    /**
     * get the compression type of the content
     *
     * @return the compression type
     */
    public int getCompressionType();

}
