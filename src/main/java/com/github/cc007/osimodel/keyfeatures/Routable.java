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
public interface Routable {

    public byte[] getSource();

    public void setSource();

    public byte[] getDestination();

    public void setDestination(byte[] destination);

}
