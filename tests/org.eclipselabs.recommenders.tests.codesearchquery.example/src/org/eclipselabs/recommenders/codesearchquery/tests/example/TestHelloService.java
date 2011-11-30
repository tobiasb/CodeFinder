package org.eclipselabs.recommenders.codesearchquery.tests.example;

import junit.framework.Assert;

import org.eclipselabs.recommenders.codesearchquery.example.HelloService;
import org.junit.Test;

public class TestHelloService {

    @Test
    public void testHello() {
        final HelloService service = new HelloService();
        final String result = service.hello();

        Assert.assertEquals("Hello World", result);
    }
}
