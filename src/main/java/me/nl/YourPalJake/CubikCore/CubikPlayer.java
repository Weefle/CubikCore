package me.nl.YourPalJake.CubikCore;

import org.bukkit.entity.Player;

public interface CubikPlayer {

    /**
     * Returns the player instance
     *
     * @return The player
     */
    Player getPlayer();

    /**
     * Returns the player name
     *
     * @return CubikPlayer's name
     */
    String getName();

    /**
     * Sets the CubikPlayer custom name
     * This can be used for example chat format
     * Note the default is the latest CustomName
     * Defined in the Player file
     *
     * @param name The name
     */
    void setCustomName(String name);

    /**
     * Get the custom name from the CubikPlayer
     *
     * @return CubikPlayer's custom name
     */
    String getCustomName();
}
