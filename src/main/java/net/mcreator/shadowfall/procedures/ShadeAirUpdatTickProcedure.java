package net.mcreator.shadowfall.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.shadowfall.init.ShadowfallModBlocks;

public class ShadeAirUpdatTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (ShadowfallModBlocks.PURSHROOM.defaultBlockState().canSurvive(world, new BlockPos((int) x, (int) y, (int) z))) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), ShadowfallModBlocks.PURSHROOM.defaultBlockState(), 3);
		} else if (ShadowfallModBlocks.SOUL_ECHO.defaultBlockState().canSurvive(world, new BlockPos((int) x, (int) y, (int) z))) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), ShadowfallModBlocks.SOUL_ECHO.defaultBlockState(), 3);
		}
	}
}
