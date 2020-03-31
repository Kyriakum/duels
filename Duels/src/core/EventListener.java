package core;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import events.PlayerJoinArenaEvent;

public class EventListener implements Listener  {

	
	@EventHandler
	public void onJoin(PlayerJoinArenaEvent e) {
		for(Arena arena : ArenaManager.)
		if(e.getArena().getPlayers().size() > 2) {
		e.getPlayer().sendMessage("Arenas Full!");
		return;	
		}
		e.getArena().addPlayer(e.getPlayer().getUniqueId());
	
	}
}
