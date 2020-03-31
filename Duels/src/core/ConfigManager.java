package core;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public class ConfigManager {
	 public static void setPath(String path, String value) {
	      Manager.getInstance().getConfig().set(path, value);
	      Manager.getInstance().saveConfig();
	   }

	   public static void setPath(String path, int value) {
	      Manager.getInstance().getConfig().set(path, value);
	      Manager.getInstance().saveConfig();
	   }

	   public static void setPath(String path, Location value) {
	      String locationValue = "";
	      locationValue = locationValue + value.getWorld().getName() + "|";
	      locationValue = locationValue + Math.round(value.getX()) + "|";
	      locationValue = locationValue + Math.round(value.getY()) + "|";
	      locationValue = locationValue + Math.round(value.getZ());
	      Manager.getInstance().getConfig().set(path, locationValue);
	      Manager.getInstance().saveConfig();
	   }

	   public static String getStringPath(String path) {
	      return Manager.getInstance().getConfig().getString(path);
	   }

	   public static int getIntPath(String path) {
	      return Manager.getInstance().getConfig().getInt(path);
	   }

	   public static Object getPath(String path) {
	      return Manager.getInstance().getConfig().get(path);
	   }

	   public static Location getLocationPath(String path) {
	      String[] data = Manager.getInstance().getConfig().getString(path).split("\\|");
	      return new Location(Bukkit.getWorld(data[0]), Double.parseDouble(data[1]), Double.parseDouble(data[2]), Double.parseDouble(data[3]));
	   }
}
