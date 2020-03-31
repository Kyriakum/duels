package events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import core.Arena;

public class PlayerQuitArenaEvent extends Event implements Cancellable {
	private boolean bool;
	private static HandlerList list = new HandlerList();
	private Arena arena;
	private Player player;
	
	public PlayerQuitArenaEvent(Arena arena, Player player) {
		this.arena = arena;
		this.player = player;
	}
	public Player getPlayer() {
		return this.player;
	}
	
	public Arena getArena() {
		return this.arena;
	}
	
	@Override
	public boolean isCancelled() {
		return bool;
	}

	@Override
	public void setCancelled(boolean b) {
		this.bool = b;
	}

	@Override
	public HandlerList getHandlers() {
		// TODO Auto-generated method stub
		return list;
	}
	public static HandlerList getHandlerList() {
		// TODO Auto-generated method stub
		return list;
	}
}
