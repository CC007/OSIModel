/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.keyfeatures;

/**
 *
 * @author Rik
 */
public interface SessionRestoration {

    /**
     * set the session ID of the session
     *
     * @param sessionID the session ID
     */
    public void setSessionID(long sessionID);

    /**
     * set the session ID of the session
     *
     * @return the session ID
     */
    public long getSessionID();

    /**
     * set the sequence number of the specified session
     *
     * @param sequenceNumber the sequence number
     */
    public void setSequenceNumber(long sequenceNumber);

    /**
     * get the sequence number of the specified session
     *
     * @return the sequence number
     */
    public long getSequenceNumber();

}
