/**
 *
 */
package org.bukkit.entity;

/**
 * Represents a Cow.
 *
 * @author Cogito
 *
 */
public interface Cow extends Animals {

    default EntityType getType() {
        return EntityType.COW;
    }
}
