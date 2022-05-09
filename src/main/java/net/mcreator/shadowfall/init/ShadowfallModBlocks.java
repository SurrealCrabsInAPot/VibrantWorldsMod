
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shadowfall.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.shadowfall.block.SoulEchoBlock;
import net.mcreator.shadowfall.block.ShademossCoveredSlateBlock;
import net.mcreator.shadowfall.block.ShadelandsWaterBlock;
import net.mcreator.shadowfall.block.ShadelandsDimPortalBlock;
import net.mcreator.shadowfall.block.ShadeShaleBlock;
import net.mcreator.shadowfall.block.PurshroomBlock;
import net.mcreator.shadowfall.ShadowfallMod;

public class ShadowfallModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ShadowfallMod.MODID);
	public static final RegistryObject<Block> SHADELANDS_DIM_PORTAL = REGISTRY.register("shadelands_dim_portal",
			() -> new ShadelandsDimPortalBlock());
	public static final RegistryObject<Block> SHADELANDS_WATER = REGISTRY.register("shadelands_water", () -> new ShadelandsWaterBlock());
	public static final RegistryObject<Block> SOUL_ECHO = REGISTRY.register("soul_echo", () -> new SoulEchoBlock());
	public static final RegistryObject<Block> SHADE_SHALE = REGISTRY.register("shade_shale", () -> new ShadeShaleBlock());
	public static final RegistryObject<Block> PURSHROOM = REGISTRY.register("purshroom", () -> new PurshroomBlock());
	public static final RegistryObject<Block> SHADE_AIR = REGISTRY.register("shade_air", () -> new ShadeAirBlock());
	public static final RegistryObject<Block> SHADEMOSS_COVERED_SLATE = REGISTRY.register("shademoss_covered_slate",
			() -> new ShademossCoveredSlateBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			SoulEchoBlock.registerRenderLayer();
			PurshroomBlock.registerRenderLayer();
		}
	}
}
