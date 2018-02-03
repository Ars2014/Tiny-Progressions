package com.kashdeya.tinyprogressions.util;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PlacementUtil {
	
	@Nullable
	public static BlockPos BlockPos(World world, int x, int z) {
		final BlockPos topPos = world.getHeight(new BlockPos(x, 0, z));
		if (topPos.getY() == 0) {
			return null;
		}

		final BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos(topPos);

		IBlockState blockState = world.getBlockState(pos);
		while (isTreeBlock(blockState, world, pos) || canReplace(blockState, world, pos)) {
			pos.move(EnumFacing.DOWN);
			if (pos.getY() <= 0) {
				return null;
			}
			blockState = world.getBlockState(pos);
		}

		return pos.up();
	}

	public static boolean isTreeBlock(IBlockState blockState, World world, BlockPos pos) {
		Block block = blockState.getBlock();
		return block.isLeaves(blockState, world, pos) || block.isWood(world, pos);
	}

	public static boolean canReplace(IBlockState blockState, World world, BlockPos pos) {
		Block block = blockState.getBlock();
		return block.isReplaceable(world, pos) && !blockState.getMaterial().isLiquid();
	}
}
