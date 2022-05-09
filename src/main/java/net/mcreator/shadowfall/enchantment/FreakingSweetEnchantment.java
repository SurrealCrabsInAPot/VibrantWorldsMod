
package net.mcreator.shadowfall.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.shadowfall.init.ShadowfallModItems;

public class FreakingSweetEnchantment extends Enchantment {
	public FreakingSweetEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == ShadowfallModItems.SWEET_OBSIDIAN_DAGGER)
			return true;
		if (stack.getItem() == Items.WOODEN_SWORD)
			return true;
		if (stack.getItem() == Items.WOODEN_AXE)
			return true;
		if (stack.getItem() == Items.WOODEN_HOE)
			return true;
		if (stack.getItem() == Items.STONE_SWORD)
			return true;
		if (stack.getItem() == Items.STONE_PICKAXE)
			return true;
		if (stack.getItem() == Items.STONE_AXE)
			return true;
		if (stack.getItem() == Items.STONE_HOE)
			return true;
		if (stack.getItem() == Items.IRON_SWORD)
			return true;
		if (stack.getItem() == Items.IRON_AXE)
			return true;
		if (stack.getItem() == Items.IRON_HOE)
			return true;
		if (stack.getItem() == Items.GOLDEN_SWORD)
			return true;
		if (stack.getItem() == Items.GOLDEN_AXE)
			return true;
		if (stack.getItem() == Items.GOLDEN_HOE)
			return true;
		if (stack.getItem() == Items.DIAMOND_SWORD)
			return true;
		if (stack.getItem() == Items.DIAMOND_AXE)
			return true;
		if (stack.getItem() == Items.DIAMOND_HOE)
			return true;
		if (stack.getItem() == Items.NETHERITE_SWORD)
			return true;
		if (stack.getItem() == Items.NETHERITE_AXE)
			return true;
		if (stack.getItem() == Items.NETHERITE_HOE)
			return true;
		if (stack.getItem() == Items.STICK)
			return true;
		if (stack.getItem() == Items.BONE)
			return true;
		if (stack.getItem() == Items.BLAZE_ROD)
			return true;
		return false;
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
