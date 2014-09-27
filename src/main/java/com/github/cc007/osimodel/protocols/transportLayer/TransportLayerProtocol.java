/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.protocols.transportLayer;

import com.github.cc007.osimodel.keyfeatures.Collapsable;
import com.github.cc007.osimodel.protocols.sessionLayer.SessionLayerProtocol;

/**
 *
 * @author Rik
 */
public interface TransportLayerProtocol extends Collapsable {

    /**
     * set the content, which follows a session layer protocol
     *
     * @param sessionProtocolDataUnit
     */

    public void setSessionProtocolDataUnit(SessionLayerProtocol sessionProtocolDataUnit);

    /**
     * get the content, which follows a session layer protocol
     *
     * @return
     */
    public SessionLayerProtocol getSessionProtocolDataUnit();
}
