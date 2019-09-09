package org.exoplatform.addons.services;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyServiceTest {

    @org.junit.Test
    public void getMessage() {

        MyService SR = new MyService();

        Assert.assertNotNull(SR.getMessage());
        assertEquals("Bonjour eXo", SR.getMessage());

    }
}