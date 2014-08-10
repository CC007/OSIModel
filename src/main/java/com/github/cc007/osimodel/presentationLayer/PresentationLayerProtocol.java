/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.presentationLayer;

import com.github.cc007.osimodel.Collapsable;
import com.github.cc007.osimodel.applicationLayer.ApplicationLayerProtocol;

/**
 *
 * @author Rik
 */
public interface PresentationLayerProtocol extends Collapsable{

    public static final int DATA_FORMATTING_UTF8 = 0;
    
    public static final int COMPRESSION_CLEAR_TEXT = 0;

    public static final int ENCRYPTION_UNENCRYPTED = 0;

    /**
     * get the presentation layer protocol type
     *
     * @return the presentation layer protocol type
     */
    public int getPresentationLayerProtocolType();

    /**
     * set the content, which follows a application layer protocol
     *
     * @param applicationProtocolDataUnit the content
     */
    public void setApplicationProtocolDataUnit(ApplicationLayerProtocol applicationProtocolDataUnit);

    /**
     * get the content, which follows a application layer protocol
     *
     * @return the content
     */
    public ApplicationLayerProtocol getApplicationProtocolDataUnit();

    /**
     * set the data formatting type of the content
     *
     * @param dataFormattingType the data formatting type
     */
    public void setDataFormattingType(int dataFormattingType);

    /**
     * get the data formatting type of the content
     *
     * @return the data formatting type
     */
    public int getDataFormattingType();

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
