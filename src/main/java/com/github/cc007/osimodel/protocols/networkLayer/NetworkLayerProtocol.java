/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.protocols.networkLayer;

import com.github.cc007.osimodel.keyfeatures.Collapsable;
import com.github.cc007.osimodel.keyfeatures.Addressing;
import com.github.cc007.osimodel.keyfeatures.ProtocolControl;
import com.github.cc007.osimodel.protocols.transportLayer.TransportLayerProtocol;

/**
 *
 * @author Rik
 */
public abstract class NetworkLayerProtocol implements Collapsable, Addressing, ProtocolControl {

    /**
     * set the content, which follows a transport layer protocol
     *
     * @param segment
     */
    public abstract void setSegment(TransportLayerProtocol segment);

    /**
     * get the content, which follows a transport layer protocol
     *
     * @return
     */
    public abstract TransportLayerProtocol getSegment();
}
