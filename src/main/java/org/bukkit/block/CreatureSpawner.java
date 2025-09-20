package org.bukkit.block;

import org.bukkit.entity.CreatureType;
import org.bukkit.entity.EntityType;

/**
 * Represents a creature spawner.
 *
 * @author sk89q
 * @author Cogito
 */
public interface CreatureSpawner extends BlockState {

    /**
     * Get the spawner's creature type.
     *
     * @return
     */
    public CreatureType getCreatureType();

    /**
     * Set the spawner creature type.
     *
     * @param mobType
     */
    public void setCreatureType(CreatureType creatureType);

    /**
     * Get the spawner's creature type.
     *
     * @return
     */
    public String getCreatureTypeId();

    /**
     * Set the spawner mob type.
     *
     * @param creatureType
     */
    public void setCreatureTypeId(String creatureType);

    /**
     * Get the spawner's creature type.
     *
     * @return The creature type.
     */
    public EntityType getSpawnedType();

    /**
     * Set the spawner's creature type.
     *
     * @param creatureType The creature type.
     */
    public void setSpawnedType(EntityType creatureType);

    /**
     * Get the spawner's delay.
     *
     * @return
     */
    public int getDelay();

    /**
     * Set the spawner's delay.
     *
     * @param delay
     */
    public void setDelay(int delay);
}
