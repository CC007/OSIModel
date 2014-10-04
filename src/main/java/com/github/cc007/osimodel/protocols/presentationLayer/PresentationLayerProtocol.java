/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.protocols.presentationLayer;

import com.github.cc007.osimodel.keyfeatures.Collapsable;
import com.github.cc007.osimodel.keyfeatures.EncryptionControl;
import com.github.cc007.osimodel.protocols.applicationLayer.ApplicationLayerProtocol;
import com.github.cc007.osimodel.keyfeatures.CompressionControl;
import com.github.cc007.osimodel.keyfeatures.DataFormatting;

/**
 *
 * @author Rik
 */
public interface PresentationLayerProtocol extends Collapsable, EncryptionControl, CompressionControl, DataFormatting {

    public static final int DATA_FORMATTING_UTF8 = 0;

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

}
