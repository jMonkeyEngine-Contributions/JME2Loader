/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.skyebook.jme2loader;

import com.jme3.gde.core.assets.SpatialAssetDataObject;
import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiFileLoader;

public class JME2LoaderDataObject extends SpatialAssetDataObject {

    public JME2LoaderDataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);

    }
}
