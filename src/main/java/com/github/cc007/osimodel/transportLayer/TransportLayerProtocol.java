/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.transportLayer;

import com.github.cc007.osimodel.keyfeatures.Collapsable;
import com.github.cc007.osimodel.sessionLayer.SessionLayerProtocol;

/**
 *
 * @author Rik
 */
public interface TransportLayerProtocol extends Collapsable {

    public void setSessionProtocolDataUnit(SessionLayerProtocol sessionProtocolDataUnit);

    public SessionLayerProtocol getSessionProtocolDataUnit();
}
