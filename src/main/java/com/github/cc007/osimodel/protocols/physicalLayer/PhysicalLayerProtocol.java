/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.protocols.physicalLayer;

import com.github.cc007.osimodel.keyfeatures.Collapsable;
import com.github.cc007.osimodel.protocols.datalinkLayer.DatalinkLayerProtocol;

/**
 * For simulation purposes only, it will simulate how data is transferred from
 * one point to another.
 *
 * @author Rik
 */
public interface PhysicalLayerProtocol extends Collapsable {

    /**
     * set the content, which follows a data link layer protocol
     *
     * @param frame
     */
    public void setFrame(DatalinkLayerProtocol frame);

    /**
     * get the content, which follows a data link layer protocol
     *
     * @return
     */
    public DatalinkLayerProtocol getFrame();
}