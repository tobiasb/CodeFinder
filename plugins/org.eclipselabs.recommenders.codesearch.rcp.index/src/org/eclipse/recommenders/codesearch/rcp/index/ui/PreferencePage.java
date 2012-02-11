package org.eclipse.recommenders.codesearch.rcp.index.ui;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.recommenders.codesearch.rcp.index.wiring.CodesearchIndexPlugin;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class PreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

    private static final String P_KEEP_IN_SYNC = "recommenders.codesearch.index.keep_in_sync";

    @Override
    protected void createFieldEditors() {
        addField(new BooleanFieldEditor(P_KEEP_IN_SYNC, "Keep index in sync with workspace.", getFieldEditorParent()));
    }

    @Override
    public void init(final IWorkbench workbench) {
        setPreferenceStore(CodesearchIndexPlugin.getDefault().getPreferenceStore());
    }

    public static boolean isActive() {
        final CodesearchIndexPlugin plugin = CodesearchIndexPlugin.getDefault();
        final IPreferenceStore store = plugin.getPreferenceStore();
        final boolean res = store.getBoolean(P_KEEP_IN_SYNC);
        return res;
    }
}
