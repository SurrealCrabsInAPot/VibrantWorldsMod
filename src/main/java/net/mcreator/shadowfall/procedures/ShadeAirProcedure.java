package net.mcreator.shadowfall.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.shadowfall.init.ShadowfallModBlocks;

public class ShadeAirProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xs = 0;
		double zs = 0;
		double ys = 0;
		if (y <= 40) {
			zs = -32;
			for (int index0 = 0; index0 < (int) (64); index0++) {
				xs = -32;
				for (int index1 = 0; index1 < (int) (64); index1++) {
					ys = -8;
					for (int index2 = 0; index2 < (int) (16); index2++) {
						ys = ys + 1;
						ShadeAirUpdatTickProcedure.execute(world, (x + ys), (y + ys), (z + zs));
					}
					zs = xs + 1;
				}
				ys = zs + 1;
			}
		}
		world.setBlock(new BlockPos((int) x, (int) y, (int) z), ShadowfallModBlocks.SHADE_SHALE.defaultBlockState(), 3);
	}
}
