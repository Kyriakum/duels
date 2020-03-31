package core;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

public class Manager extends JavaPlugin {
	
	private ArenaManager manager;
	private static ArrayList<Arena> arenas;
	private static Manager mng;	
	public final static Location SPAWN = new Location(Bukkit.getWorld("world"), 0.0,0.0,0.0);
	
	public static Manager getInstance() {
		if(mng == null) {
			mng = new Manager();
		}
		return mng;
	}

	public void onEnable() {
		setup();
		this.manager = new ArenaManager();
	}
	private Manager() {
		this.arenas = new ArrayList<Arena>();
	}

	public static void setup() {
		for(int i = 1; i<=10; i++) {
			arenas.add(new Arena(i, new Location(Bukkit.getWorld("world"), 50.0, 10.0,50.0)));
		}

}
	
}
