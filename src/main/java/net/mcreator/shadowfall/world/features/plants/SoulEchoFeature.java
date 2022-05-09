
package net.mcreator.shadowfall.world.features.plants;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.shadowfall.init.ShadowfallModBlocks;

import java.util.Set;
import java.util.List;

public class SoulEchoFeature extends RandomPatchFeature {
	public static SoulEchoFeature FEATURE = null;
	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new SoulEchoFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("shadowfall:soul_echo", FEATURE, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
				new SimpleBlockConfiguration(BlockStateProvider.simple(ShadowfallModBlocks.SOUL_ECHO.get().defaultBlockState())), List.of(), 18));
		PLACED_FEATURE = PlacementUtils.register("shadowfall:soul_echo", CONFIGURED_FEATURE, List.of(CountPlacement.of(4),
				RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("shadowfall:shadelands"),
			new ResourceLocation("mushroom_fields"), new ResourceLocation("dripstone_caves"), new ResourceLocation("end_midlands"),
			new ResourceLocation("flower_forest"), new ResourceLocation("the_end"), new ResourceLocation("nether_wastes"),
			new ResourceLocation("small_end_islands"), new ResourceLocation("ice_spikes"), new ResourceLocation("dark_forest"),
			new ResourceLocation("the_void"), new ResourceLocation("windswept_gravelly_hills"), new ResourceLocation("end_highlands"),
			new ResourceLocation("end_barrens"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD, Level.OVERWORLD, Level.NETHER, Level.END,
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("shadowfall:shadelands_dim")));

	public SoulEchoFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
