/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel;

import java.io.Serializable;

/**
 *
 * @author Rik
 */
public interface Collapsable extends Serializable {

    /**
     * Collapse the object into a byte array that follows the protocol that is
     * used.
     *
     * @return the byte array
     */
    public byte[] collapse();
}