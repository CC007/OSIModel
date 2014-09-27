/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.datalinkLayer;

import com.github.cc007.osimodel.keyfeatures.Collapsable;

/**
 *
 * @author Rik
 */
public interface DatalinkLayerProtocol extends Collapsable {

    /**
     * set the content, which follows a network layer protocol
     *
     * @param datagram
     */
    public void setDatagram(DatalinkLayerProtocol datagram);


    /**
     * get the content, which follows a network layer protocol
     *
     * @return
     */
    public DatalinkLayerProtocol getDatagram();
    
    public byte[] getSource();
    
    public void setSource();
    
    public byte[] getDestination();
    
    public void setDestination(byte[] destination);
    
}
