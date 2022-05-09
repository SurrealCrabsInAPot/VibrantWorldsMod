
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shadowfall.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.shadowfall.block.SoulEchoBlock;
import net.mcreator.shadowfall.block.ShademossCoveredSlateBlock;
import net.mcreator.shadowfall.block.ShadelandsWaterBlock;
import net.mcreator.shadowfall.block.ShadelandsDimPortalBlock;
import net.mcreator.shadowfall.block.ShadeairBlock;
import net.mcreator.shadowfall.block.ShadeShaleBlock;
import net.mcreator.shadowfall.block.PurshroomBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShadowfallModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block SHADELANDS_DIM_PORTAL = register(new ShadelandsDimPortalBlock());
	public static final Block SHADELANDS_WATER = register(new ShadelandsWaterBlock());
	public static final Block SOUL_ECHO = register(new SoulEchoBlock());
	public static final Block SHADE_SHALE = register(new ShadeShaleBlock());
	public static final Block PURSHROOM = register(new PurshroomBlock());
	public static final Block SHADEAIR = register(new ShadeairBlock());
	public static final Block SHADEMOSS_COVERED_SLATE = register(new ShademossCoveredSlateBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			SoulEchoBlock.registerRenderLayer();
			PurshroomBlock.registerRenderLayer();
			ShadeairBlock.registerRenderLayer();
		}
	}
}
