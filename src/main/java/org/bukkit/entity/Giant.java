/**
 *
 */
package org.bukkit.entity;

/**
 * Represents a Giant.
 *
 * @author Cogito
 *
 */
public interface Giant extends Monster {

    default EntityType getType() {
        return EntityType.GIANT;
    }
}
