/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.presentationLayer;

import com.github.cc007.osimodel.applicationLayer.ApplicationLayerProtocol;

/**
 *
 * @author Rik
 */
public interface PresentationLayerProtocol {

    /**
     * get presentation layer protocol type
     *
     * @return presentation layer protocol type
     */
    public int getPresentationLayerProtocolType();

    // content
    /**
     * set the content, which follows a application layer protocol
     *
     * @param applicationData the content
     */
    public void setApplicationData(ApplicationLayerProtocol applicationData);

    /**
     * get the content, which follows a application layer protocol
     *
     * @return the content
     */
    public ApplicationLayerProtocol getApplicationData();

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
     * @param dataFormattingType the compression type
     */
    public void setCompressionType(int dataFormattingType);

    /**
     * get the compression type of the content
     *
     * @return the compression type
     */
    public int getCompressionType();

    /**
     * set the encryption type of the content
     *
     * @param dataFormattingType the encryption type
     */
    public void setEncryptionType(int dataFormattingType);

    /**
     * get the encryption type of the content
     *
     * @return the encryption type
     */
    public int getEncryptionType();
}
