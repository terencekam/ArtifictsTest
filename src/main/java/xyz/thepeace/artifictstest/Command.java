package xyz.thepeace.artifictstest;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.thepeace.artifictstest.Levels.Level1;

import static xyz.thepeace.artifictstest.Main.*;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, org.bukkit.command.Command command, String s, String[] args) {
        if(command.getName().equalsIgnoreCase("start")){
            if (commandSender instanceof Player){
                if (args.length == 1){
                    ServerInfo.accept(String.valueOf(Integer.parseInt(args[0])));
                    switch (Integer.parseInt(args[0])){
                        case 1:
                            ChallengeList.add(new Level1((Player) commandSender));
                            break;

                        default:
                            ((Player)commandSender).sendMessage("There are no such level");
                    }
                }else if (args.length == 0){
                    ((Player) commandSender).sendMessage("Please type the level");
                    return false;
                }else{
                    ((Player) commandSender).sendMessage("Wrong format");
                    return false;
                }
            }else{
                ServerWarning.accept("This command can only performed by Player");
                return false;
            }
            return false;

        }
        return false;
    }
}
