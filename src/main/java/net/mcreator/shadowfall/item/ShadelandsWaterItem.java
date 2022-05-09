
package net.mcreator.shadowfall.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.shadowfall.init.ShadowfallModFluids;

public class ShadelandsWaterItem extends BucketItem {
	public ShadelandsWaterItem() {
		super(ShadowfallModFluids.SHADELANDS_WATER,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
