package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityPainting;
import net.minecraft.server.EnumArt;
import net.minecraft.server.WorldServer;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.entity.Painting;

public class CraftPainting extends CraftEntity implements Painting {

    public CraftPainting(CraftServer server, EntityPainting entity) {
        super(server, entity);
    }

    @Override
    public String toString() {
        return "CraftPainting";
    }

    @Override
    public void setPainting(int id) {
        EntityPainting painting = (EntityPainting) this.entity;
        painting.e = this.idToEnum(id);
    }

    @Override
    public int getId() {
        return getHandle().e.id;
    }

    public BlockFace getAttachedFace() {
        return getFacing().getOppositeFace();
    }

    public void setFacingDirection(BlockFace face) {
        setFacingDirection(face, false);
    }

    public boolean setFacingDirection(BlockFace face, boolean force) {
        Block block = getLocation().getBlock().getRelative(getAttachedFace()).getRelative(face.getOppositeFace()).getRelative(getFacing());
        EntityPainting painting = getHandle();
        int x = (int) painting.locX, y = (int) painting.locY, z = (int) painting.locZ, dir = painting.a;
        painting.locX = block.getX();
        painting.locY = block.getY();
        painting.locZ = block.getZ();
        switch (face) {
            case EAST:
            default:
                getHandle().b(0);
                break;
            case NORTH:
                getHandle().b(1);
                break;
            case WEST:
                getHandle().b(2);
                break;
            case SOUTH:
                getHandle().b(3);
                break;
        }
        if (!force && !painting.h()) {
            // Revert painting since it doesn't fit
            painting.locX = x;
            painting.locY = y;
            painting.locZ = z;
            painting.b(dir);
            return false;
        }
        this.update();
        return true;
    }

    private void update() {
        WorldServer world = ((CraftWorld) getWorld()).getHandle();
        EntityPainting painting = new EntityPainting(world);
        painting.locX = getHandle().locX;
        painting.locY = getHandle().locY;
        painting.locZ = getHandle().locZ;
        painting.a = getHandle().a;
        painting.b(getHandle().a);
        getHandle().die();
        getHandle().velocityChanged = true; // because this occurs when the painting is broken, so it might be important
        world.addEntity(painting);
        this.entity = painting;
    }

    public BlockFace getFacing() {
        switch (this.getHandle().a) {
            case 0:
            default:
                return BlockFace.EAST;
            case 1:
                return BlockFace.NORTH;
            case 2:
                return BlockFace.WEST;
            case 3:
                return BlockFace.SOUTH;
        }
    }

    private EnumArt idToEnum(int number) {
        return EnumArt.getById(number);
    }

    public EntityPainting getHandle() {
        return (EntityPainting) entity;
    }
}
