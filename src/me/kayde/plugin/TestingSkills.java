package me.kayde.plugin;

import me.kayde.plugin.Commands.rr;
import me.kayde.plugin.Managers.RouletteManager;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class TestingSkills extends JavaPlugin {
    public RouletteManager rrManager;
    @Override
    public void onEnable(){
        PluginDescriptionFile pdfFile = getDescription();
        Logger logger = getLogger();
        rrManager = new RouletteManager();
        registerCommands();

        logger.info(pdfFile.getName() + " Version: " + pdfFile.getVersion() + "has been ENABLED");
    }
    @Override
    public void onDisable(){
        PluginDescriptionFile pdfFile = getDescription();
        Logger logger = getLogger();
        logger.info(pdfFile.getName() + " Version: " + pdfFile.getVersion() + "has been ENABLED");
    }


    public void registerCommands(){
        getCommand("rr").setExecutor(new rr(this));
    }




}
