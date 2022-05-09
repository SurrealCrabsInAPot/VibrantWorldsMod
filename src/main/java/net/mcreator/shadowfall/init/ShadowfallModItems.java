
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shadowfall.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.shadowfall.item.SweetObsidianDaggerItem;
import net.mcreator.shadowfall.item.ShadelandsWaterItem;
import net.mcreator.shadowfall.item.ShadelandsKeyItem;
import net.mcreator.shadowfall.item.ShadelandsDimItem;
import net.mcreator.shadowfall.ShadowfallMod;

public class ShadowfallModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ShadowfallMod.MODID);
	public static final RegistryObject<Item> CARFUNGAL = REGISTRY.register("carfungal_spawn_egg",
			() -> new ForgeSpawnEggItem(ShadowfallModEntities.CARFUNGAL, -13434829, -16764109, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SHADELANDS_DIM = REGISTRY.register("shadelands_dim", () -> new ShadelandsDimItem());
	public static final RegistryObject<Item> SHADELANDS_KEY = REGISTRY.register("shadelands_key", () -> new ShadelandsKeyItem());
	public static final RegistryObject<Item> SWEET_OBSIDIAN_DAGGER = REGISTRY.register("sweet_obsidian_dagger", () -> new SweetObsidianDaggerItem());
	public static final RegistryObject<Item> SHADELANDS_WATER_BUCKET = REGISTRY.register("shadelands_water_bucket", () -> new ShadelandsWaterItem());
	public static final RegistryObject<Item> SHADELING = REGISTRY.register("shadeling_spawn_egg",
			() -> new ForgeSpawnEggItem(ShadowfallModEntities.SHADELING, -16737895, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SOUL_ECHO = block(ShadowfallModBlocks.SOUL_ECHO, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SHADE_SHALE = block(ShadowfallModBlocks.SHADE_SHALE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PURSHROOM = block(ShadowfallModBlocks.PURSHROOM, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SHADE_AIR = REGISTRY.register("shade_air", () -> new ShadeAirItem());
	public static final RegistryObject<Item> SHADEMOSS_COVERED_SLATE = block(ShadowfallModBlocks.SHADEMOSS_COVERED_SLATE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
