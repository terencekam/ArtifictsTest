package xyz.thepeace.artifictstest.Event;


import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import xyz.thepeace.artifictstest.Main;

public class GlobalEvent implements Listener {
    public GlobalEvent(Listener listener){
        Bukkit.getPluginManager().registerEvents(listener , Main);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){

    }
    @EventHandler
    public boolean hasEntityDead(EntityDeathEvent e , Entity entity){
        return e.getEntity().getEntityId() == entity.getEntityId();
    }
}
