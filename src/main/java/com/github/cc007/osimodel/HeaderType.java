/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel;

import com.github.cc007.osimodel.protocols.LayerProtocol;

/**
 *
 * @author Rik
 */
public interface HeaderType {
    public byte[] asByteArray();
    public boolean isLayerProtocol();
    public LayerProtocol getNewLayerProtocolObject();
}
