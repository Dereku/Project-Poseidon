/**
 *
 */
package org.bukkit.entity;

/**
 * Represents a Painting.
 *
 * @author Cogito
 *
 */
public interface Painting extends Entity {

    default EntityType getType() {
        return EntityType.PAINTING;
    }
}
