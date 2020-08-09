package de.tdrstudios.reload;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ReloadPlugin  extends JavaPlugin {


    @Override
    public void onEnable() {

        System.out.println("[TDRStudios] Das Reload Plugin wird geladen!");
        System.out.println("[TDRStudios] This is an OpenS Repo -> https://github.com/tdr-studios/TDRReloadPlugin/");

        this.getServer().getPluginManager().registerEvents(new ReloadCommand(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("[TDRStudios] Das Reload Plugin wurde entladen!");
    }


}
