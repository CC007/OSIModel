/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cc007.osimodel.exceptions;

/**
 *
 * @author Rik
 */
public class HeaderTypesClassException extends Exception {

    /**
     * Creates a new instance of <code>HeaderTypesClassException</code> without
     * detail message.
     */
    public HeaderTypesClassException() {
    }

    /**
     * Constructs an instance of <code>HeaderTypesClassException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public HeaderTypesClassException(String msg) {
        super(msg);
    }

    /**
     * Constructs an instance of <code>HeaderTypesClassException</code> with the
     * specified detail message and the cause of the Exception.
     *
     * @param msg the detail message.
     * @param cause the cause of the exception
     */
    public HeaderTypesClassException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
