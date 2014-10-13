/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.keyfeatures;

import com.github.cc007.osimodel.HeaderType;

/**
 * The header of the next layer should be identifiable in a code that is unique
 * for the protocol
 *
 * @author Rik
 */
public interface Identifiable {

    public void setNextHeader(HeaderType headertype);

    public HeaderType getNextHeader();
}
