
package net.mcreator.shadowfall.world.features.plants;

import net.minecraft.world.level.levelgen.placement.FeatureDecorator;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.HeightmapConfiguration;
import net.minecraft.world.level.levelgen.feature.blockplacers.SimpleBlockPlacer;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.DefaultFlowerFeature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.shadowfall.init.ShadowfallModBlocks;

import java.util.Set;

public class SoulEchoFeature extends DefaultFlowerFeature {
	public static final SoulEchoFeature FEATURE = (SoulEchoFeature) new SoulEchoFeature().setRegistryName("shadowfall:soul_echo");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(
					new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(ShadowfallModBlocks.SOUL_ECHO.defaultBlockState()),
							SimpleBlockPlacer.INSTANCE).tries(18)

									.build())
			.decorated(FeatureDecorator.HEIGHTMAP.configured(new HeightmapConfiguration(Heightmap.Types.MOTION_BLOCKING))).squared().rarity(32)
			.count(4);
	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("shadowfall:shadelands"),
			new ResourceLocation("mushroom_fields"), new ResourceLocation("dripstone_caves"), new ResourceLocation("end_midlands"),
			new ResourceLocation("flower_forest"), new ResourceLocation("the_end"), new ResourceLocation("nether_wastes"),
			new ResourceLocation("gravelly_mountains"), new ResourceLocation("small_end_islands"), new ResourceLocation("ice_spikes"),
			new ResourceLocation("dark_forest"), new ResourceLocation("mushroom_field_shore"), new ResourceLocation("the_void"),
			new ResourceLocation("end_highlands"), new ResourceLocation("end_barrens"));

	public SoulEchoFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (dimensionType == Level.NETHER)
			dimensionCriteria = true;
		if (dimensionType == Level.END)
			dimensionCriteria = true;
		if (dimensionType == ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("shadowfall:shadelands_dim")))
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}
}
