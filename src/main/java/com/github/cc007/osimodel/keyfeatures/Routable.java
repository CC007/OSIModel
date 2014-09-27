/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.keyfeatures;

import com.github.cc007.osimodel.Address;

/**
 *
 * @author Rik
 */
public interface Routable {

    /**
     * Get the source of the data transfer
     *
     * @return the address of the source
     */
    public Address getSource();

    /**
     * Set the source of the data transfer to the addres of the current device
     */
    public void setSource();

    /**
     * Get the destination of the data transfer
     *
     * @return the address of the destination
     */
    public Address getDestination();

    /**
     * Set the source of the data transfer
     *
     * @param destination the address of the destination
     */
    public void setDestination(Address destination);

}
