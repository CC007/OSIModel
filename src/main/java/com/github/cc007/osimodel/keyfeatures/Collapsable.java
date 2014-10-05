/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.keyfeatures;

import java.io.Serializable;

/**
 *
 * @author Rik
 */
public interface Collapsable extends Serializable {

    /**
     * Collapse this object into an array of byte arrays that follow the protocol that is
     * used.
     *
     * @return the byte array
     */
    public byte[][] collapse();

    /**
     * Find the number of byte arrays that will be returned by collapse
     * @return 
     */
    public int collapseCount();

    /**
     * Expand the array of byte arrays that follow the protocol that is used into this
     * object.
     *
     * @param collapsedObject the byte array to be expanded
     */
    public void expand(byte[][] collapsedObject);
}
