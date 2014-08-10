/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.cc007.osimodel.networkLayer;

import com.github.cc007.osimodel.Collapsable;
import com.github.cc007.osimodel.transportLayer.TransportLayerProtocol;

/**
 *
 * @author Rik
 */
public interface NetworkLayerProtocol extends Collapsable{
    public void setSegment(TransportLayerProtocol segment);
    public TransportLayerProtocol getSegment();
}
