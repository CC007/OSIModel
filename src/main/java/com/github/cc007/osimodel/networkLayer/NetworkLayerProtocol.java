/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.cc007.osimodel.networkLayer;

import com.github.cc007.osimodel.transportLayer.TransportLayerProtocol;
import java.io.Serializable;

/**
 *
 * @author Rik
 */
public interface NetworkLayerProtocol extends Serializable{
    public void setSegment(TransportLayerProtocol segment);
    public TransportLayerProtocol getSegment();
}
