package core;

import org.bukkit.scheduler.BukkitRunnable;

public class Begin extends BukkitRunnable {

	private final Arena arena;
	public Begin(Arena arena) {
		this.arena = arena;
	}
	@Override
	public void run() {
		arena.getGame().start();
		return;
	}
	
	public boolean isRunning() {
		return arena.getState() == GameState.RUNNING;
	}
	
}
