
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nofear.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.nofear.NofearMod;

public class NofearModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NofearMod.MODID);
	public static final RegistryObject<Item> MESSI = block(NofearModBlocks.MESSI, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TOPFRAGGER = REGISTRY.register("topfragger_spawn_egg",
			() -> new ForgeSpawnEggItem(NofearModEntities.TOPFRAGGER, -16711732, -65536, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SUS = block(NofearModBlocks.SUS, NofearModTabs.TAB_NOFEAR);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
