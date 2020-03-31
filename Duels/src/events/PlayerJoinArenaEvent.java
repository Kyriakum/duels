package events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import core.Arena;

public class PlayerJoinArenaEvent extends Event implements Cancellable {
	private Arena arena;
	private Player p;
	private boolean canc;
	private static HandlerList handl = new HandlerList();
	public PlayerJoinArenaEvent(Arena arena, Player p) {
		this.arena = arena;
		this.p = p;
	}
	public Arena getArena() {
		return this.arena;
	}
	public Player getPlayer() {
		return this.p;
	}
	@Override
	public HandlerList getHandlers() {
		return handl;
	}
	public static HandlerList getHandlerList() {
	    return handl;
	}
	@Override
	public boolean isCancelled() {
		return canc;
	}
	@Override
	public void setCancelled(boolean b) {
			this.canc = b;
	}

}
