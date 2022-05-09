
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shadowfall.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.shadowfall.fluid.ShadelandsWaterFluid;
import net.mcreator.shadowfall.ShadowfallMod;

public class ShadowfallModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, ShadowfallMod.MODID);
	public static final RegistryObject<Fluid> SHADELANDS_WATER = REGISTRY.register("shadelands_water", () -> new ShadelandsWaterFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_SHADELANDS_WATER = REGISTRY.register("flowing_shadelands_water",
			() -> new ShadelandsWaterFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(SHADELANDS_WATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SHADELANDS_WATER.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
