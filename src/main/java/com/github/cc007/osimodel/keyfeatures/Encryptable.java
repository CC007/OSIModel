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
public interface Encryptable {
    public static final int ENCRYPTABLE_UNENCRYPTED = 0;

    /**
     * set the encryption type of the content
     *
     * @param encryptionType the encryption type
     */
    public void setEncryptionType(int encryptionType);

    /**
     * get the encryption type of the content
     *
     * @return the encryption type
     */
    public int getEncryptionType();
}
