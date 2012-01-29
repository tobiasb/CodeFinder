package org.eclipselabs.recommenders.codesearchquery.rcp.searcher.utils;

import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.PlatformUI;

public class ProjectImageProvider implements IImageProvider {

    @Override
    public Image getImage() {
        return PlatformUI.getWorkbench().getSharedImages()
                .getImage(org.eclipse.ui.ide.IDE.SharedImages.IMG_OBJ_PROJECT);
    }

}
