package com.raoulvdberge.refinedstorage.api.network.readerwriter;

import com.raoulvdberge.refinedstorage.api.network.node.INetworkNode;
import net.minecraft.util.EnumFacing;

/**
 * Represents a writer block in the world.
 */
public interface IWriter extends INetworkNode {
    /**
     * @return the redstone strength this writer block is emitting
     */
    int getRedstoneStrength();

    /**
     * @param strength the redstone strength to set to be emitted
     */
    void setRedstoneStrength(int strength);

    /**
     * @return the direction of the writer
     */
    EnumFacing getDirection();

    /**
     * @return the channel
     */
    String getChannel();

    /**
     * @param channel the channel
     */
    void setChannel(String channel);
}
