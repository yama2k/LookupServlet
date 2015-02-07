/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple;

import javax.ejb.Stateless;

/**
 *
 * @author kosuk_000
 */
@Stateless
public class SimpleSLSBean2 implements SimpleSLSBeanLocal {

    @Override
    public void printSomething() {
        System.out.println("Foo");
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
