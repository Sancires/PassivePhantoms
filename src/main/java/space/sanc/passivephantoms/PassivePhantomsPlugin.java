package space.sanc.passivephantoms;

import org.bukkit.plugin.java.JavaPlugin;
import space.sanc.passivephantoms.listeners.TargetEvent;

public final class PassivePhantomsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new TargetEvent(this), this);
    }

}
