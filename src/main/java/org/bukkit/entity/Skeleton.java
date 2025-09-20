/**
 *
 */
package org.bukkit.entity;

/**
 * Represents a Skeleton.
 *
 * @author Cogito
 *
 */
public interface Skeleton extends Monster {

    default EntityType getType() {
        return EntityType.SKELETON;
    }
}
