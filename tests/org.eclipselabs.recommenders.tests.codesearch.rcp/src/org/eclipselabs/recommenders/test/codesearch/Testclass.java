package org.eclipselabs.recommenders.test.codesearch;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;

@Ignore
@SuppressWarnings({ "unchecked", "rawtypes" })
public class Testclass extends IOException {
    private static final long serialVersionUID = 1L;
    public Object someObject = null;

    // public Object theWorldMap = (new Testclass()).someObject;

    public static void theBestMethodEver() {
        ArrayList list;
        list = new ArrayList();
        list.add("SuppressWarnings");

        try {
        } catch (final Exception ex) {
            final Testclass c = new Testclass();
            final Object myObject = c.someObject;
        }
    }

    public List testReturnNames() {
        return new ArrayList<String>();
    }

    public void operation() {
        final Object a = new String();

        if (a instanceof Exception) {
            // Somethin's fishy
        }
    }
}