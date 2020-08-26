package me.NoChance.PvPManager.Dependencies;

import org.bukkit.entity.Player;

public interface DisguiseDependency extends Dependency {

	public boolean isDisguised(Player player);

	public void unDisguise(Player player);

}
