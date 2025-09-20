package org.bukkit.craftbukkit.block;

import net.minecraft.server.TileEntityMobSpawner;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.EntityType;

public class CraftCreatureSpawner extends CraftBlockState implements CreatureSpawner {
    private final CraftWorld world;
    private final TileEntityMobSpawner spawner;

    public CraftCreatureSpawner(final Block block) {
        super(block);

        world = (CraftWorld) block.getWorld();
        spawner = (TileEntityMobSpawner) world.getTileEntityAt(getX(), getY(), getZ());
    }

    public CreatureType getCreatureType() {
        return CreatureType.fromName(spawner.mobName);
    }

    public void setCreatureType(CreatureType creatureType) {
        spawner.mobName = creatureType.getName();
    }

    public String getCreatureTypeId() {
        return spawner.mobName;
    }

    public void setCreatureTypeId(String creatureType) {
        // Verify input
        CreatureType type = CreatureType.fromName(creatureType);
        if (type == null) {
            return;
        }
        spawner.mobName = type.getName();
    }

    public EntityType getSpawnedType() {
        return EntityType.fromName(spawner.mobName);
    }

    public void setSpawnedType(EntityType creatureType) {
        if (!creatureType.isAlive() || !creatureType.isSpawnable()) {
            throw new IllegalArgumentException("Can't spawn non-living entities from mob spawners!");
        }

        spawner.mobName = creatureType.getName();
    }

    public int getDelay() {
        return spawner.spawnDelay;
    }

    public void setDelay(int delay) {
        spawner.spawnDelay = delay;
    }

}
