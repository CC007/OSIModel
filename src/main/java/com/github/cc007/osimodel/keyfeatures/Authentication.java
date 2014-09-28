/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.keyfeatures;

import com.github.cc007.authentication.protocols.AuthenticationProtocol;

/**
 *
 * @author Rik
 */
public interface Authentication {

    /**
     * This method is used to authenticate the sender of data
     *
     * @param authenticationData contains all needed information to authenticate
     * the sender
     * @return whether or not the sender has been authenticated
     */
    public boolean authenticate(AuthenticationProtocol authenticationData);
}
