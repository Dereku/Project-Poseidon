/**
 *
 */
package org.bukkit.entity;

import org.bukkit.block.BlockFace;

/**
 * Represents a Painting.
 *
 * @author Cogito
 *
 */
public interface Painting extends Entity {

    void setPainting(int id);

    int getId();

    BlockFace getAttachedFace();

    BlockFace getFacing();

    boolean setFacingDirection(BlockFace face, boolean force);

    default EntityType getType() {
        return EntityType.PAINTING;
    }
}
