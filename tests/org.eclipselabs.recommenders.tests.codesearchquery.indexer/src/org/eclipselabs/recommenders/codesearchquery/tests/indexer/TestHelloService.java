package org.eclipselabs.recommenders.codesearchquery.tests.indexer;

import junit.framework.Assert;

import org.eclipselabs.recommenders.codesearchquery.indexer.HelloService;
import org.junit.Test;

public class TestHelloService {

    @Test
    public void testHello() {
        final HelloService service = new HelloService();
        final String result = service.hello();

        Assert.assertEquals("Hello World", result);
    }
}
