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

package org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.contentassist;

import java.util.List;

import org.eclipse.swt.graphics.Image;

public interface IQueryProposalProvider {
    public List<String> getProposals();

    public String convert(String source);

    public Image getImage();

    public void setArgument(int index, Object o);
}
