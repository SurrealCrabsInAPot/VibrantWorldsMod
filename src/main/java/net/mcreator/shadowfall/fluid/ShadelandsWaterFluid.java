
package net.mcreator.shadowfall.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.BlockPos;

import net.mcreator.shadowfall.init.ShadowfallModItems;
import net.mcreator.shadowfall.init.ShadowfallModFluids;
import net.mcreator.shadowfall.init.ShadowfallModBlocks;

public abstract class ShadelandsWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(ShadowfallModFluids.SHADELANDS_WATER,
			ShadowfallModFluids.FLOWING_SHADELANDS_WATER,
			FluidAttributes
					.builder(new ResourceLocation("shadowfall:blocks/umberroot_log_side"),
							new ResourceLocation("shadowfall:blocks/umberroot_log_side"))
					.luminosity(15)

					.temperature(265)

	).explosionResistance(100f).canMultiply().tickRate(3)

			.slopeFindDistance(7).bucket(ShadowfallModItems.SHADELANDS_WATER_BUCKET)
			.block(() -> (LiquidBlock) ShadowfallModBlocks.SHADELANDS_WATER.get());

	private ShadelandsWaterFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.SOUL;
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(1.5);
	}

	public static class Source extends ShadelandsWaterFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends ShadelandsWaterFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
