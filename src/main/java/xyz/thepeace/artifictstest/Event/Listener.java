package xyz.thepeace.artifictstest.Event;


import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import xyz.thepeace.artifictstest.Levels.Level1;
import xyz.thepeace.artifictstest.Levels.LevelsInfo;
import xyz.thepeace.artifictstest.Main;

import static xyz.thepeace.artifictstest.Main.ChallengeList;

public class Listener implements org.bukkit.event.Listener {
    private Main plugin;

    public Listener(Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){

    }
    @EventHandler
    public void hasEntityDead(EntityDeathEvent e){
        ChallengeList.removeIf(info -> info.check(e.getEntity().getEntityId()));

    }

    @EventHandler
    public void PlayerLeaveEvent(PlayerQuitEvent e){
        ChallengeList.removeIf(info -> info.getPlayer() == e.getPlayer());
    }
}
