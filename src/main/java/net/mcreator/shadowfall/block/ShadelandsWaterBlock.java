
package net.mcreator.shadowfall.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.shadowfall.init.ShadowfallModFluids;

public class ShadelandsWaterBlock extends LiquidBlock {
	public ShadelandsWaterBlock() {
		super(ShadowfallModFluids.SHADELANDS_WATER, BlockBehaviour.Properties.of(Material.WATER).strength(100f).hasPostProcess((bs, br, bp) -> true)
				.emissiveRendering((bs, br, bp) -> true)

		);
		setRegistryName("shadelands_water");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
