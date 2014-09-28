/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.protocols.sessionLayer;

import com.github.cc007.osimodel.keyfeatures.Collapsable;
import com.github.cc007.osimodel.keyfeatures.SessionRestoration;
import com.github.cc007.osimodel.protocols.presentationLayer.PresentationLayerProtocol;

/**
 *
 * @author Rik
 */
public abstract class SessionLayerProtocol implements Collapsable, SessionRestoration {

    /**
     * set the content, which follows a presentation layer protocol
     *
     * @param presentationProtocolDataUnit the content
     */
    public abstract void setPresentationProtocolDataUnit(PresentationLayerProtocol presentationProtocolDataUnit);

    /**
     * get the content, which follows a presentation layer protocol
     *
     * @return the content
     */
    public abstract PresentationLayerProtocol getPresentationProtocolDataUnit();
}
