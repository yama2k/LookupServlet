/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple;

import javax.ejb.Local;

/**
 *
 * @author kosuk_000
 */
@Local
public interface SimpleSLSBeanLocal {

    void printSomething();
    
}
