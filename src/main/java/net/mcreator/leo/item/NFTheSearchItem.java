
package net.mcreator.leo.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.leo.init.LeoModTabs;
import net.mcreator.leo.init.LeoModSounds;

public class NFTheSearchItem extends RecordItem {
	public NFTheSearchItem() {
		super(0, LeoModSounds.REGISTRY.get(new ResourceLocation("leo:nflost")),
				new Item.Properties().tab(LeoModTabs.TAB_NO_FEARR).stacksTo(1).rarity(Rarity.RARE));
	}
}
