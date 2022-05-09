
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shadowfall.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.shadowfall.world.features.plants.SoulEchoFeature;
import net.mcreator.shadowfall.world.features.plants.PurshroomFeature;
import net.mcreator.shadowfall.world.features.lakes.ShadelandsWaterFeature;
import net.mcreator.shadowfall.ShadowfallMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class ShadowfallModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ShadowfallMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> SHADELANDS_WATER = register("shadelands_water", ShadelandsWaterFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, ShadelandsWaterFeature.GENERATE_BIOMES, ShadelandsWaterFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SOUL_ECHO = register("soul_echo", SoulEchoFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, SoulEchoFeature.GENERATE_BIOMES, SoulEchoFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PURSHROOM = register("purshroom", PurshroomFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PurshroomFeature.GENERATE_BIOMES, PurshroomFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
