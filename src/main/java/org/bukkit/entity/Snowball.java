package org.bukkit.entity;

/**
 * Implements a snowball.
 */
public interface Snowball extends Projectile {

    default EntityType getType() {
        return EntityType.SNOWBALL;
    }
}
