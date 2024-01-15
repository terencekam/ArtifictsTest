package xyz.thepeace.artifictstest.Levels;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.util.ArrayList;

import static xyz.thepeace.artifictstest.Main.PluginName;


public class Level1 extends LevelsInfo implements org.bukkit.event.Listener {

    int i = 0;

    private final World world = Bukkit.getWorld("world");
    private static Player player;

    static ArrayList<Entity> list = new ArrayList<>();

    public Level1(Player player) {
        super(player ,"Horror",1,300,400);
        this.player = player;
        start();

    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public void start() {


        list.add(Bukkit.getWorld(world.getName()).spawnEntity(new Location(world,41,69,0),EntityType.ZOMBIE));
        list.add(Bukkit.getWorld(world.getName()).spawnEntity(new Location(world,41,69,1),EntityType.ZOMBIE));
        list.add(Bukkit.getWorld(world.getName()).spawnEntity(new Location(world,41,69,2),EntityType.ZOMBIE));
        list.add(Bukkit.getWorld(world.getName()).spawnEntity(new Location(world,41,69,3),EntityType.ZOMBIE));
        list.add(Bukkit.getWorld(world.getName()).spawnEntity(new Location(world,41,69,4),EntityType.ZOMBIE));
    }

    public boolean hasDead(int UID){
        for (Entity e : list){
            if(e.getEntityId() == UID){
                return true;
            }
        }
        return false;
    }

    public boolean check(int UID) {

        if (hasDead(UID)){
            i++;
        }

        player.sendMessage(PluginName + " check " + i);

        if (i ==5){
            player.sendMessage(PluginName + " Win ");
            return true;
        }else {
            return false;
        }
    }

    public void reset(){
        i = 0;
        list.clear();
    }
}
