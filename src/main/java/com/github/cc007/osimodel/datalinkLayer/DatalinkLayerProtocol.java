/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.datalinkLayer;

import com.github.cc007.osimodel.Collapsable;

/**
 *
 * @author Rik
 */
public interface DatalinkLayerProtocol extends Collapsable {

    public void setDatagram(DatalinkLayerProtocol datagram);

    public DatalinkLayerProtocol setDatagram();
    
    public byte[] getSource();
    
    public void setSource();
    
    public byte[] getDestination();
    
    public void setDestination(byte[] destination);
    
    public void correctErrors();
    
}
