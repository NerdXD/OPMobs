package com.nerdxd.opmobs;

import com.nerdxd.opmobs.Mobs.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class RealCommand implements CommandExecutor, Listener {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        player.sendMessage("THE ACTUAL PLUGIN COMMAND IS ACTIVATED GOOD LUCK");

        return false;
    }

    @EventHandler
    public void onEntitySpawn(EntitySpawnEvent e) {
        if(e.getEntity() instanceof Zombie) {
            Zombie zom = (Zombie) e.getEntity();
            CustomZombie cz = new CustomZombie(zom);
        } else if(e.getEntity() instanceof Creeper) {
            Creeper creeper = (Creeper) e.getEntity();
            CustomCreeper cz = new CustomCreeper(creeper);
        } else if(e.getEntity() instanceof Skeleton) {
            Skeleton creeper = (Skeleton) e.getEntity();
            CustomSkeleton cz = new CustomSkeleton(creeper);
        } else if(e.getEntity() instanceof Husk) {
            Husk creeper = (Husk) e.getEntity();
            CustomHusk cz = new CustomHusk(creeper);
        } else if(e.getEntity() instanceof Drowned) {
            Drowned creeper = (Drowned) e.getEntity();
            CustomDrowned cz = new CustomDrowned(creeper);
        }


    }


}
