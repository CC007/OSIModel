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
public interface ErrorControl extends ErrorHandling, ErrorDetection {

    /**
     * Look in the data presented in this class and correct any errors that were
     * found.
     */
    public void correctErrors();
}
