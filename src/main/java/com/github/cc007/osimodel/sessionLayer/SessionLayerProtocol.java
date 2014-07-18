/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.cc007.osimodel.sessionLayer;

import com.github.cc007.osimodel.presentationLayer.PresentationLayerProtocol;

/**
 *
 * @author Rik
 */
public interface SessionLayerProtocol {

    /**
     * get the session layer protocol type
     *
     * @return the session layer protocol type
     */
    public int getSessionLayerProtocol();
    
    /**
     *
     * @param presentationData
     */
    public void setPresentationData(PresentationLayerProtocol presentationData);
    public PresentationLayerProtocol getPresentationData();
    
    public void setSessionID(long sessionID);
    public long getSessionID();
    
    public void setSequenceNumber(long sequenceNumber);
    public long getSequenceNumber();
}
