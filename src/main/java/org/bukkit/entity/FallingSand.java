/**
 *
 */
package org.bukkit.entity;

/**
 * Represents Falling Sand.
 *
 * @author Cogito
 *
 */
public interface FallingSand extends Entity {

    default EntityType getType() {
        return EntityType.FALLING_BLOCK;
    }
}
