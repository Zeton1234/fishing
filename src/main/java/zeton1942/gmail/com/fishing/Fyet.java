package zeton1942.gmail.com.fishing;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.plugin.Plugin;

import java.awt.*;

public class Fyet implements Listener {
    private Fishing plugin;

    public Fyet(Fishing plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, (Plugin)plugin);
    }

    @EventHandler
    public void onPlayerFish(PlayerFishEvent e) {
        if (e.getState() != PlayerFishEvent.State.CAUGHT_FISH) return;
        e.getPlayer().sendMessage(ChatColor.YELLOW + ((e.getCaught() == null)?"":e.getCaught().getName().toLowerCase() + ChatColor.GREEN + "を捕まえた"));
    }
}
