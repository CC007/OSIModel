/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.protocols.transportLayer;

import com.github.cc007.osimodel.keyfeatures.Addressing;
import com.github.cc007.osimodel.keyfeatures.Collapsable;
import com.github.cc007.osimodel.keyfeatures.CongestionControl;
import com.github.cc007.osimodel.keyfeatures.ErrorControl;
import com.github.cc007.osimodel.keyfeatures.FlowControl;
import com.github.cc007.osimodel.protocols.sessionLayer.SessionLayerProtocol;

/**
 *
 * @author Rik
 */
public abstract class TransportLayerProtocol implements Collapsable, ErrorControl, FlowControl, CongestionControl, Addressing{

    /**
     * set the content, which follows a session layer protocol
     *
     * @param sessionProtocolDataUnit
     */

    public abstract void setSessionProtocolDataUnit(SessionLayerProtocol sessionProtocolDataUnit);

    /**
     * get the content, which follows a session layer protocol
     *
     * @return
     */
    public abstract SessionLayerProtocol getSessionProtocolDataUnit();
}
