
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shadowfall.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.shadowfall.enchantment.FreakingSweetEnchantment;
import net.mcreator.shadowfall.ShadowfallMod;

public class ShadowfallModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ShadowfallMod.MODID);
	public static final RegistryObject<Enchantment> FREAKING_SWEET = REGISTRY.register("freaking_sweet", () -> new FreakingSweetEnchantment());
}
