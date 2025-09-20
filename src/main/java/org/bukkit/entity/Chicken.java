/**
 *
 */
package org.bukkit.entity;

/**
 * Represents a Chicken.
 *
 * @author Cogito
 *
 */
public interface Chicken extends Animals {

    default EntityType getType() {
        return EntityType.CHICKEN;
    }
}
