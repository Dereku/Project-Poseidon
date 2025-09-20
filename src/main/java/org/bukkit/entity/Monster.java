/**
 *
 */
package org.bukkit.entity;

/**
 * Represents a Monster.
 *
 * @author Cogito
 *
 */
public interface Monster extends Creature {

    default EntityType getType() {
        return EntityType.MONSTER;
    }
}
