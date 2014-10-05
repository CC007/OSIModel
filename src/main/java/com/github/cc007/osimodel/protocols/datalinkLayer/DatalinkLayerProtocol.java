/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.protocols.datalinkLayer;

import com.github.cc007.osimodel.keyfeatures.Collapsable;
import com.github.cc007.osimodel.keyfeatures.LogicalLinkControl;
import com.github.cc007.osimodel.keyfeatures.MediaAccessControl;
import com.github.cc007.osimodel.keyfeatures.ProtocolControl;
import com.github.cc007.osimodel.protocols.networkLayer.NetworkLayerProtocol;

/**
 *
 * @author Rik
 */
public abstract class DatalinkLayerProtocol implements Collapsable, LogicalLinkControl, MediaAccessControl, ProtocolControl {

    /**
     * set the content, which follows a network layer protocol
     *
     * @param datagram the content
     */
    public abstract void setDatagram(NetworkLayerProtocol datagram);

    /**
     * get the content, which follows a network layer protocol
     *
     * @return the content
     */
    public abstract NetworkLayerProtocol getDatagram();

}
