
package net.mcreator.leo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.leo.init.LeoModTabs;
import net.mcreator.leo.init.LeoModFluids;

public class BornaBokiFluidItem extends BucketItem {
	public BornaBokiFluidItem() {
		super(LeoModFluids.BORNA_BOKI_FLUID,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC).tab(LeoModTabs.TAB_NO_FEARR));
	}
}
