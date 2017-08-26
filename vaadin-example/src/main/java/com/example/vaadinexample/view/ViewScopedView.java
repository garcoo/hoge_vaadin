package com.example.vaadinexample.view;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.*;

import com.example.vaadinexample.ui.*;
import com.vaadin.navigator.*;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.*;
import com.vaadin.ui.*;

@SpringView(name = ViewScopedView.VIEW_NAME)
public class ViewScopedView extends VerticalLayout implements View {

    private static final long serialVersionUID = -6976702412515954056L;

    public static final String VIEW_NAME = "view";

    @Autowired
    private ViewGreeter viewGreeter;

    @Autowired
    private Greeter uiGreeter;

    @PostConstruct
    void init() {
        setMargin(true);
        setSpacing(true);
        addComponent(new Label("This is a view scoped view"));
        addComponent(new Label(uiGreeter.sayHello()));
        addComponent(new Label(viewGreeter.sayHello()));
    }

    @Override
    public void enter(ViewChangeEvent event) {
        // the view is constructed in the init() method()
    }
}