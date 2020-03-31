package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArenaManager {
	private final List<Arena> arenas = new ArrayList();
	private static ArenaManager am;
	
	public ArenaManager getManager() {
		if(this.am == null) {
			am = new ArenaManager();
		}
		return am;
	}
	
	public List<Arena> getArenas(){
		return this.arenas;
	}
	public Arena getArena(int i){
        for (Arena a : this.arenas) {
            if (a.getId() == i) {
                return a;
            	}
            }
        	return null;
        }
        
	
	public boolean availableArenas() {
		int id = 0;
		Iterator iter = arenas.iterator();
		while(iter.hasNext()) {
			id++;
			Arena d = getArena(id);
			if(d.getPlayers().size() == 2) {
				return false;
			}
			return true;
		}
		return false;
	
	}
}
