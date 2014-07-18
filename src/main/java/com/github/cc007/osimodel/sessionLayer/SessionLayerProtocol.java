/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.cc007.osimodel.sessionLayer;

import com.github.cc007.osimodel.presentationLayer.PresentationLayerProtocol;

/**
 *
 * @author Rik
 */
public interface SessionLayerProtocol {
    public void setPresentationData(PresentationLayerProtocol presentationData);
    public PresentationLayerProtocol getPresentationData();
}
