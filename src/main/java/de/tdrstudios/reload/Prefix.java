package de.tdrstudios.reload;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.ChatColor;


public class Prefix {


    @Setter
    @Getter
    public static String prefix =  ChatColor.WHITE + "[Server]";
    @Getter
    @Setter
    public static String noPerms =  prefix + ChatColor.RED + "Keine Rechte!";

}
