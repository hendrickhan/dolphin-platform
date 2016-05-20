package com.canoo.dolphin.test.impl;

import com.canoo.dolphin.server.spring.AbstractSpringContainerManager;
import com.canoo.dolphin.util.Assert;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

/**
 * Created by hendrikebbers on 20.05.16.
 */
public class TestSpringContainerManager extends AbstractSpringContainerManager {

    private final WebApplicationContext webApplicationContext;

    public TestSpringContainerManager(WebApplicationContext webApplicationContext) {
        this.webApplicationContext = Assert.requireNonNull(webApplicationContext, "webApplicationContext");
    }

    @Override
    public void init(ServletContext servletContext) {
        init();
    }

    @Override
    protected WebApplicationContext getContext() {
        return webApplicationContext;
    }


}
