package org.eclipse.recommenders.codesearch.rcp.searcher.utils;

import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.PlatformUI;

public class MethodImageProvider implements IImageProvider {

    @Override
    public Image getImage() {
        return PlatformUI.getWorkbench().getSharedImages()
                .getImage(org.eclipse.ui.ide.IDE.SharedImages.IMG_OPEN_MARKER);
    }

}
