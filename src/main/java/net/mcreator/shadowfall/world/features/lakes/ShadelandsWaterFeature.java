
package net.mcreator.shadowfall.world.features.lakes;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.EnvironmentScanPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.LakeFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;
import net.minecraft.core.Direction;

import net.mcreator.shadowfall.init.ShadowfallModBlocks;

import java.util.Set;
import java.util.List;

public class ShadelandsWaterFeature extends LakeFeature {
	public static ShadelandsWaterFeature FEATURE = null;
	public static Holder<ConfiguredFeature<LakeFeature.Configuration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new ShadelandsWaterFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("shadowfall:shadelands_water", FEATURE, new LakeFeature.Configuration(
				BlockStateProvider.simple(ShadowfallModBlocks.SHADELANDS_WATER.get()), BlockStateProvider.simple(Blocks.AIR)));
		PLACED_FEATURE = PlacementUtils.register("shadowfall:shadelands_water", CONFIGURED_FEATURE,
				List.of(RarityFilter.onAverageOnceEvery(3), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT,
						EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.not(BlockPredicate.ONLY_IN_AIR_PREDICATE), 32),
						BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("shadowfall:shadelands"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set
			.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("shadowfall:shadelands_dim")), Level.OVERWORLD);

	public ShadelandsWaterFeature() {
		super(LakeFeature.Configuration.CODEC);
	}

	@Override
	public boolean place(FeaturePlaceContext<LakeFeature.Configuration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
