package org.bukkit.entity;

/**
 * Represents an egg.
 */
public interface Egg extends Projectile {

    default EntityType getType() {
        return EntityType.EGG;
    }
}
