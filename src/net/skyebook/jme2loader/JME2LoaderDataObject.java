package net.skyebook.jme2loader;

import com.jme3.gde.core.assets.SpatialAssetDataObject;
import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiFileLoader;

/**
 * 
 * @author Skye Book
 */
public class JME2LoaderDataObject extends SpatialAssetDataObject {

    public JME2LoaderDataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        //registerEditor("application/jme", true);
    }
    
    /*

    @MultiViewElement.Registration(displayName = "#LBL_JME2Loader_EDITOR",
    iconBase = "net/skyebook/jme2loader/monkey.gif",
    mimeType = "application/jme",
    persistenceType = TopComponent.PERSISTENCE_ONLY_OPENED,
    preferredID = "JME2Loader",
    position = 1000)
    public static MultiViewEditorElement createEditor(Lookup lkp) {
        return new MultiViewEditorElement(lkp);
    
    */
}
