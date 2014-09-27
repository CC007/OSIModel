/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.protocols.datalinkLayer;

import com.github.cc007.osimodel.keyfeatures.Collapsable;
import com.github.cc007.osimodel.keyfeatures.LogicalLinkControl;
import com.github.cc007.osimodel.keyfeatures.Addressing;
import com.github.cc007.osimodel.keyfeatures.MediaAccessControl;

/**
 * Main features:
 * - Encapsulation of network layer
 * 
 * @author Rik
 */
public abstract class DatalinkLayerProtocol implements Collapsable, LogicalLinkControl, MediaAccessControl {

    /**
     * set the content, which follows a network layer protocol
     *
     * @param datagram
     */
    public abstract void setDatagram(DatalinkLayerProtocol datagram);


    /**
     * get the content, which follows a network layer protocol
     *
     * @return
     */
    public abstract DatalinkLayerProtocol getDatagram();
    
}
