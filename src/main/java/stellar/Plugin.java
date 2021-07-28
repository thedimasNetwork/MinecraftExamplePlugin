package stellar;

import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class Plugin extends JavaPlugin {
    @Override
    public void onEnable() {
        // calls on server start (end of reload)
    }

    @Override
    public void onDisable() {
        // calls on server stop (start of reload)
    }
}
