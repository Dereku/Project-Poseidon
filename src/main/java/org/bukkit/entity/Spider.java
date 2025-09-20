/**
 *
 */
package org.bukkit.entity;

/**
 * Represents a Spider.
 *
 * @author Cogito
 *
 */
public interface Spider extends Monster {

    default EntityType getType() {
        return EntityType.SPIDER;
    }
}
