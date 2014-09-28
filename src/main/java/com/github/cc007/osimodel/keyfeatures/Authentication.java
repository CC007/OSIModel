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
    public boolean authenticate(AuthenticationProtocol authenticationData);
}
