package de.tdrstudios.reload;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class ReloadCommand implements Listener {


    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent e){
        Player p = e.getPlayer();
        String cmd = e.getMessage();

        if(cmd.equalsIgnoreCase("/reload") || cmd.equalsIgnoreCase("/rl")){
            e.setCancelled(true);
            if(p.hasPermission("tdrstudios.reload")){
                Bukkit.reload();
                Bukkit.broadcastMessage(Prefix.getPrefix() + ChatColor.GREEN + " Server wird neugeladen!");
            }else {
                p.sendMessage(Prefix.getNoPerms());
            }
        }
    }

}