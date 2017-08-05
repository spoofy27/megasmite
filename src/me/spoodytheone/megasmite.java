package me.spoodytheone;

import java.util.Set;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class megasmite extends JavaPlugin {

	
	@Override
	public void onEnable() {
		
		getLogger().info("Megasmite enabled successfully!");
	}
	
	@Override
	public void onDisable() {
		
		getLogger().info("Disableling Megasmite...");
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
if (cmd.getName().equalsIgnoreCase("megasmite") && sender instanceof Player) {
			
	if (sender.hasPermission("Megasmite.megasmite")) {
	
			Player player = (Player) sender;
			
			World world = player.getWorld();
			
			Block targetblock = player.getTargetBlock((Set<Material>) null, 100);
			Location location = targetblock.getLocation();
			world.strikeLightning(location);
			world.strikeLightning(location);
			world.strikeLightning(location);
			world.strikeLightning(location);
			world.strikeLightning(location);
			world.strikeLightning(location);
			world.strikeLightning(location);
			world.strikeLightning(location);
			world.strikeLightning(location);
			world.strikeLightning(location);
			world.strikeLightning(location);
			world.strikeLightning(location);
			world.strikeLightning(location);
			world.strikeLightning(location);
			world.strikeLightning(location);
			world.strikeLightning(location);
			world.strikeLightning(location);
			world.strikeLightning(location);
			world.strikeLightning(location);
			world.strikeLightning(location);
			world.strikeLightning(location);
			world.strikeLightning(location);
			
			world.createExplosion(location, 6F);
			world.createExplosion(location, 7F);
			world.createExplosion(location, 8F);
			world.createExplosion(location, 9F);
			world.createExplosion(location, 10F);
			return true;
			
			} else {
				
				Player player = (Player) sender;
				
				player.sendMessage(ChatColor.RED + "You do not have permission to do that!");
				return true;
				
			}
	
		}	
	
		return false;
		
	}
	
	}
