package org.bukkit.entity;

/**
 * Represents a Zombie.
 *
 * @author Cogito
 *
 */
public interface Zombie extends Monster {

    default EntityType getType() {
        return EntityType.ZOMBIE;
    }
}
