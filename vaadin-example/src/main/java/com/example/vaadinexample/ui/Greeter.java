/*
 * Greeter.java
 */
package com.example.vaadinexample.ui;

import com.vaadin.spring.annotation.*;

/**
 * sample ui
 * 
 * @author t-coga
 */
@SpringComponent
@UIScope
public class Greeter {
    public String sayHello() {
        return "demo " + toString();
    }
}