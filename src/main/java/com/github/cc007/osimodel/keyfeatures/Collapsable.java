/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.keyfeatures;

import com.github.cc007.osimodel.HeaderTypes;
import com.github.cc007.osimodel.exceptions.HeaderTypesClassException;
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
     * @param headerTypesClass the class object of the HeaderTypes utility class implementation
     * @throws com.github.cc007.osimodel.exceptions.HeaderTypesClassException The exception you get when the HeaderTypes class causes errors
     */
    public void expand(byte[][] collapsedObject, Class<? extends HeaderTypes> headerTypesClass) throws HeaderTypesClassException;
}
