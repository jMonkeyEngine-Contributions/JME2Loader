/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.skyebook.jme2loader;

import com.jme3.asset.AssetManager;
import com.jme3.gde.core.assets.AssetManagerConfigurator;

/**
 *
 * @author Skye Book
 */
@org.openide.util.lookup.ServiceProvider(service = AssetManagerConfigurator.class)
public class JME2AssetManagerConfigurator implements AssetManagerConfigurator {
    @Override
    public void prepareManager(AssetManager manager) {
        manager.registerLoader(net.skyebook.jme2loader.JME2Loader.class, "jme", "jme.xml");
    }
}