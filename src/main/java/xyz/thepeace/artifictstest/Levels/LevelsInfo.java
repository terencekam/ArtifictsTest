package xyz.thepeace.artifictstest.Levels;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.List;

public abstract class LevelsInfo {
    private String LevelName;
    private int Levels;
    private int ATickSpeed;
    private int BTickSpeed;
    private Player player;


    @Override
    public abstract String toString();

    public String getLevelName() {
        return LevelName;
    }

    public void setLevelName(String levelName) {
        LevelName = levelName;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getLevels() {
        return Levels;
    }

    public void setLevels(int levels) {
        Levels = levels;
    }

    public int getATickSpeed() {
        return ATickSpeed;
    }

    public void setATickSpeed(int ATickSpeed) {
        this.ATickSpeed = ATickSpeed;
    }

    public int getBTickSpeed() {
        return BTickSpeed;
    }

    public void setBTickSpeed(int BTickSpeed) {
        this.BTickSpeed = BTickSpeed;
    }

    public LevelsInfo(Player player, String levelName, int levels, int ATickSpeed, int BTickSpeed) {
        LevelName = levelName;
        Levels = levels;
        this.ATickSpeed = ATickSpeed;
        this.BTickSpeed = BTickSpeed;
        this.player = player;
        this.player.sendTitle("&s" + levelName + "&0", String.valueOf(levels));
    }

    public abstract boolean hasDead(int UID);
    public abstract void reset();
    public abstract boolean check(int UID);

    public abstract void start();
}
