/*
 * Greeter.java
 */
package com.example.vaadinexample.ui;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.*;

import com.vaadin.navigator.*;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.*;
import com.vaadin.ui.*;

/**
 * sample ui
 * 
 * @author t-coga
 */
@UIScope
@SpringView(name = UIScopedView.VIEW_NAME)
public class UIScopedView extends VerticalLayout implements View {

    private static final long serialVersionUID = -5951130658834378237L;

    public static final String VIEW_NAME = "ui";

    @Autowired
    private Greeter greeter;

    @PostConstruct
    void init() {
        setMargin(true);
        setSpacing(true);
        addComponent(new Label("This is a UI scoped view. Greeter says: "
                + greeter.sayHello()));
    }

    @Override
    public void enter(ViewChangeEvent event) {
        // the view is constructed in the init() method()
    }
}