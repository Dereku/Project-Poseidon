/**
 *
 */
package org.bukkit.entity;

/**
 * Represents a Squid.
 *
 * @author Cogito
 *
 */
public interface Squid extends WaterMob {

    default EntityType getType() {
        return EntityType.SQUID;
    }
}
