
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shadowfall.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.shadowfall.item.SweetObsidianDaggerItem;
import net.mcreator.shadowfall.item.ShadelandsWaterItem;
import net.mcreator.shadowfall.item.ShadelandsKeyItem;
import net.mcreator.shadowfall.item.ShadelandsDimItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShadowfallModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item CARFUNGAL = register(
			new SpawnEggItem(ShadowfallModEntities.CARFUNGAL, -13434829, -16764109, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("carfungal_spawn_egg"));
	public static final Item SHADELANDS_DIM = register(new ShadelandsDimItem());
	public static final Item SHADELANDS_KEY = register(new ShadelandsKeyItem());
	public static final Item SWEET_OBSIDIAN_DAGGER = register(new SweetObsidianDaggerItem());
	public static final Item SHADELANDS_WATER_BUCKET = register(new ShadelandsWaterItem());
	public static final Item SHADELING = register(
			new SpawnEggItem(ShadowfallModEntities.SHADELING, -16737895, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("shadeling_spawn_egg"));
	public static final Item SOUL_ECHO = register(ShadowfallModBlocks.SOUL_ECHO, CreativeModeTab.TAB_DECORATIONS);
	public static final Item SHADE_SHALE = register(ShadowfallModBlocks.SHADE_SHALE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item PURSHROOM = register(ShadowfallModBlocks.PURSHROOM, CreativeModeTab.TAB_DECORATIONS);
	public static final Item SHADEAIR = register(ShadowfallModBlocks.SHADEAIR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SHADEMOSS_COVERED_SLATE = register(ShadowfallModBlocks.SHADEMOSS_COVERED_SLATE, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
