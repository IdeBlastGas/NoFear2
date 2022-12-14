
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.leo.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class LeoModTabs {
	public static CreativeModeTab TAB_NO_FEARR;

	public static void load() {
		TAB_NO_FEARR = new CreativeModeTab("tabno_fearr") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(LeoModItems.NF_THE_SEARCH.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
