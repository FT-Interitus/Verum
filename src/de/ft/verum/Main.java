package de.ft.verum;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import de.ft.interitus.loading.AssetLoader;
import de.ft.interitus.plugin.Configuration;
import de.ft.interitus.plugin.Plugin;
import de.ft.interitus.plugin.PluginManagerHandler;
import de.ft.interitus.plugin.PluginRegister;
import de.ft.interitus.projecttypes.ProjektTypes;

public class Main implements Plugin {
    PluginRegister pluginRegister = new PluginRegister();



    public boolean register() {
        pluginRegister.config(Configuration.name,"Verum");
        pluginRegister.config(Configuration.version,"1.0");
        pluginRegister.config(Configuration.description,"Der Logik Simulator für Interitus");
        PluginManagerHandler.register(pluginRegister);
        PluginManagerHandler.addProjectType(new ProjektTypes(null,"Logik Simulations Projekt / Verum Projekt"));
        //AssetLoader.loadmore("C:\\Users\\Felix\\Documents\\GitHub\\RoboControll\\Verum\\src\\de\\ft\\verum\\and.png", Texture.class);
        //AssetLoader.loadmore("C:\\Users\\Felix\\Documents\\GitHub\\RoboControll\\Verum\\src\\de\\ft\\verum\\andselectet.png", Texture.class);
        //img_and=  (Texture) AssetLoader.save("C:\\Users\\Felix\\Documents\\GitHub\\RoboControll\\Verum\\src\\de\\ft\\verum\\and.png", Texture.class);
        //img_and_selected=(Texture)AssetLoader.save("C:\\Users\\Felix\\Documents\\GitHub\\RoboControll\\Verum\\src\\de\\ft\\verum\\andselectet.png", Texture.class);
        return true;
    }

    public boolean stop() {
        return false;
    }

    public boolean run() {


        return false;
    }
}
