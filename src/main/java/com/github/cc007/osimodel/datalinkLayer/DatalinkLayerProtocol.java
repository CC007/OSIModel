/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.cc007.osimodel.datalinkLayer;

import java.io.Serializable;

/**
 *
 * @author Rik
 */
public interface DatalinkLayerProtocol extends Serializable{
    public void setDatagram(DatalinkLayerProtocol datagram);
    public DatalinkLayerProtocol setDatagram();
}
