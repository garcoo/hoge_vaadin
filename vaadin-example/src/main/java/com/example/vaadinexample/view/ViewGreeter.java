/*
 * ViewGreeter.java
 */
package com.example.vaadinexample.view;

import com.vaadin.spring.annotation.*;

/**
 * sample view
 * 
 * @author t-coga
 */
@SpringComponent
@ViewScope
public class ViewGreeter {
    public String sayHello() {
        return "Hello from a view scoped bean " + toString();
    }
}