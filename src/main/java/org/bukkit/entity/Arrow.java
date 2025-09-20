package org.bukkit.entity;

/**
 * Represents an arrow.
 */
public interface Arrow extends Projectile {

    default EntityType getType() {
        return EntityType.ARROW;
    }
}
