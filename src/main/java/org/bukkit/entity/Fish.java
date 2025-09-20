package org.bukkit.entity;

/**
 * Represents a Fish.
 */
public interface Fish extends Projectile {

    default EntityType getType() {
        return EntityType.FISHING_HOOK;
    }
}
