package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public class Arena {

	private final int id;
	private ArrayList<UUID> players;
	private HashMap<UUID, Kit> kits;
	private GameState state;
	private final Location location;
	private final Game game;
	private final String prefix;
	
	public Arena(int id, Location location) {
		this.id = id;
		this.players = new ArrayList<UUID>();
		this.kits = new HashMap<UUID, Kit>();
		this.state = GameState.WAITING;
		this.location = location;
		this.game = new Game(this);
		this.prefix = "[ΔΟΥΕΛΣ]";
	}
	
	public void reset() {
		this.players.clear();
		this.kits.clear();
		this.state = GameState.WAITING;
	}
	
	public void broadcast(String message) {
		for(int i=0; i < players.size(); i++) {
			Bukkit.getPlayer(players.get(i)).sendMessage(prefix + message);
		}
	}
	
	public void addPlayer(UUID uuid) {
		players.add(uuid);
	}
	
	public void removePlayer(UUID uuid) {
		players.remove(uuid);
	}
	public GameState getState() {
		return this.state;
	}

	public Game getGame() {
		// TODO Auto-generated method stub
		return this.game;
	}
	public ArrayList<UUID> getPlayers(){
		return this.players;
	}
	public int getId() {
		return this.id;
	}
}
