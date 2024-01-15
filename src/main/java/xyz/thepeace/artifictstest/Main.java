package xyz.thepeace.artifictstest;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.thepeace.artifictstest.Levels.LevelsInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.logging.Level;

public final class Main extends JavaPlugin implements Listener {



    public static String PluginName = "[ArtifactsTest] ";
    public static Consumer<String> ServerInfo = (o1) -> Bukkit.getServer().getLogger().log(Level.INFO,PluginName+o1);
    public static Consumer<String> ServerWarning = (o1) -> Bukkit.getServer().getLogger().log(Level.WARNING , PluginName+o1);

    public static ArrayList<LevelsInfo> ChallengeList =new ArrayList<>();


    @Override
    public void onEnable() {
        ServerInfo.accept("Started");
        getCommand("start").setExecutor(new Command());
        Bukkit.getPluginManager().registerEvents(new xyz.thepeace.artifictstest.Event.Listener(this),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
