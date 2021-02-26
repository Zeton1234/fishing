package zeton1942.gmail.com.fishing;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Fishing extends JavaPlugin {

    public void onEnable() {
        new Fyet(this);
    }

    public void onDisable() {
        HandlerList.unregisterAll((Plugin)this);
    }

}
