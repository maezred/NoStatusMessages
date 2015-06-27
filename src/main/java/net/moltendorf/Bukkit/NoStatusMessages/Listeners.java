package net.moltendorf.Bukkit.NoStatusMessages;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * Created by moltendorf on 15/06/05.
 *
 * @author moltendorf
 */
public class Listeners implements Listener {
	@EventHandler
	public void PlayerJoinEventHandler(final PlayerJoinEvent event) {
		event.setJoinMessage("");
	}

	@EventHandler
	public void PlayerQuitEventHandler(final PlayerQuitEvent event) {
		event.setQuitMessage("");
	}
}
