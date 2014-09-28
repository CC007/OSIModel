/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.keyfeatures;

import com.github.cc007.osimodel.ProtocolType;

/**
 *
 * @author Rik
 */
public interface ProtocolControl {

    /**
     * Get the protocol type of the layer above that was or will be used in the
     * transmission
     *
     * @return the protocol type
     */
    public ProtocolType getProtocolType();

    /**
     * Set the protocol type of the layer above that was or will be used in the
     * transmission
     *
     * @param protocolType the protocol type
     */
    public void setProtocolType(ProtocolType protocolType);
}
