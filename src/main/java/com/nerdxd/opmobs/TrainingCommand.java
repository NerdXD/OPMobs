package com.nerdxd.opmobs;

import com.nerdxd.opmobs.Mobs.*;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;

public class TrainingCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Location loc = new Location(player.getWorld(), player.getLocation().getX() + 10, player.getLocation().getY(), player.getLocation().getZ() + 10);
        player.sendMessage(ChatColor.RED + "TRAINING");

        Zombie zom = (Zombie) player.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
        CustomZombie cz = new CustomZombie(zom);

        Skeleton Skell = (Skeleton) player.getWorld().spawnEntity(loc, EntityType.SKELETON);
        CustomSkeleton cs = new CustomSkeleton(Skell);


        Creeper Creeper = (Creeper) player.getWorld().spawnEntity(loc, EntityType.CREEPER);
        CustomCreeper cc = new CustomCreeper(Creeper);


        Husk husk = (Husk) player.getWorld().spawnEntity(loc, EntityType.HUSK);
        CustomHusk ch = new CustomHusk(husk);

        Drowned drowned = (Drowned) player.getWorld().spawnEntity(loc, EntityType.DROWNED);
        CustomDrowned cd = new CustomDrowned(drowned);




        return false;
    }
}
