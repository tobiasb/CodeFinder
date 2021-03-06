/**
 * Copyright (c) 2012 Tobias Boehm.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */

package org.eclipselabs.recommenders.test.codesearch;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.common.NotDefinedException;
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
    
	public static final Collection generateCombinations(final Command command)
			throws NotDefinedException {
		
		//...
		
				return null;
		
	}
}
