
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nofear.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class NofearModTabs {
	public static CreativeModeTab TAB_NOFEAR;

	public static void load() {
		TAB_NOFEAR = new CreativeModeTab("tabnofear") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(NofearModBlocks.MESSI.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
