package com.nerdxd.opmobs;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("training").setExecutor(new TrainingCommand());
        getCommand("real").setExecutor(new RealCommand());
        Bukkit.getPluginManager().registerEvents(new RealCommand(), this);


    }

}
