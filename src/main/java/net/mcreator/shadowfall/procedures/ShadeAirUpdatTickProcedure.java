package net.mcreator.shadowfall.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.shadowfall.init.ShadowfallModBlocks;

public class ShadeAirUpdatTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (ShadowfallModBlocks.PURSHROOM.get().defaultBlockState().canSurvive(world, new BlockPos(x, y, z))) {
			world.setBlock(new BlockPos(x, y, z), ShadowfallModBlocks.PURSHROOM.get().defaultBlockState(), 3);
		} else if (ShadowfallModBlocks.SOUL_ECHO.get().defaultBlockState().canSurvive(world, new BlockPos(x, y, z))) {
			world.setBlock(new BlockPos(x, y, z), ShadowfallModBlocks.SOUL_ECHO.get().defaultBlockState(), 3);
		}
	}
}
