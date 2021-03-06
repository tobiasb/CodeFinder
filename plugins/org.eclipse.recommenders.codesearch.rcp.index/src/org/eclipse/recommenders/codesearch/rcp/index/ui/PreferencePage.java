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

package org.eclipse.recommenders.codesearch.rcp.index.ui;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.recommenders.codesearch.rcp.index.wiring.CodesearchIndexPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class PreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

    private static final String P_KEEP_IN_SYNC = "recommenders.codesearch.index.keep_in_sync";
    private static final String P_OUT_PERF_INFO = "recommenders.codesearch.index.out_perf_information";
    private static final String P_USE_ALTERNATE_INDEXING_STRATEGY = "recommenders.codesearch.index.use_alternative_indexing_strategy";

    @Override
    protected void createFieldEditors() {
        final Composite parent = getFieldEditorParent();
        addField(new BooleanFieldEditor(P_KEEP_IN_SYNC, "Keep index in sync with workspace.", parent));
        final Label label = new Label(parent, SWT.WRAP | SWT.BORDER);
        final GridData data = GridDataFactory.fillDefaults().grab(true, true).span(2, 1).hint(100, 300).create();
        data.horizontalSpan = 2;
        data.widthHint = 200;
        data.grabExcessHorizontalSpace = true;
        label.setLayoutData(data);

        label.setText("Note that building the initial index is a long running operation. "
                + "Its duration depends on workspace size and number project dependencies and "
                + "may take up to 30 minutes.\n\nThis operation can be canceled at any time; "
                + "Indexing operation starts from the last sucessfully indexed project.");

        addField(new BooleanFieldEditor(P_OUT_PERF_INFO, "Output of index/search performance information", parent));

        addField(new BooleanFieldEditor(P_USE_ALTERNATE_INDEXING_STRATEGY, "Use alternative indexing Strategy (increases index size)", parent));
    }

    @Override
    public void init(final IWorkbench workbench) {
        setPreferenceStore(CodesearchIndexPlugin.getDefault().getPreferenceStore());
    }
    
    private static boolean getBooleanPref(String prefName) {
        final CodesearchIndexPlugin plugin = CodesearchIndexPlugin.getDefault();
        final IPreferenceStore store = plugin.getPreferenceStore();
        final boolean res = store.getBoolean(prefName);
        return res;
    }

    public static boolean isActive() {
    	return getBooleanPref(P_KEEP_IN_SYNC);
    }
    
    public static boolean isPerfInfoOutputEnabled() {
    	return getBooleanPref(P_OUT_PERF_INFO);
    }
    
    public static boolean isUseAlternativeStrategyEnabled() {
    	return getBooleanPref(P_USE_ALTERNATE_INDEXING_STRATEGY);
    }
}
