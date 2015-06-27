package net.moltendorf.Bukkit.NoStatusMessages;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by moltendorf on 15/06/05.
 *
 * @author moltendorf
 */
public class NoStatusMessages extends JavaPlugin {
	// Main instance.
	private static NoStatusMessages instance = null;

	protected static NoStatusMessages getInstance() {
		return instance;
	}

	@Override
	public void onEnable() {
		instance = this;

		// Register listeners.
		getServer().getPluginManager().registerEvents(new Listeners(), this);
	}

	@Override
	public void onDisable() {
		instance = null;
	}
}
