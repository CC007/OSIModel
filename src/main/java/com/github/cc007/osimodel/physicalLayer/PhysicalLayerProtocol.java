/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.cc007.osimodel.physicalLayer;

import com.github.cc007.osimodel.datalinkLayer.DatalinkLayerProtocol;

/**
 *
 * @author Rik
 */
public interface PhysicalLayerProtocol {
    public void setFrame(DatalinkLayerProtocol frame);
    public DatalinkLayerProtocol getFrame();
}
