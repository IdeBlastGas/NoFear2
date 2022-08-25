
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.leo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.leo.item.NFTheSearchItem;
import net.mcreator.leo.item.BornaBokiFluidItem;
import net.mcreator.leo.item.BornaBokiDimensionItem;
import net.mcreator.leo.LeoMod;

public class LeoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LeoMod.MODID);
	public static final RegistryObject<Item> NF_THE_SEARCH = REGISTRY.register("nf_the_search", () -> new NFTheSearchItem());
	public static final RegistryObject<Item> BORNA_BOKI_ENTITY = REGISTRY.register("borna_boki_entity_spawn_egg",
			() -> new ForgeSpawnEggItem(LeoModEntities.BORNA_BOKI_ENTITY, -1, -1, new Item.Properties().tab(LeoModTabs.TAB_NO_FEARR)));
	public static final RegistryObject<Item> BORNA_BOKI_2 = block(LeoModBlocks.BORNA_BOKI_2, LeoModTabs.TAB_NO_FEARR);
	public static final RegistryObject<Item> BORNA_BOKI_DIMENSION = REGISTRY.register("borna_boki_dimension", () -> new BornaBokiDimensionItem());
	public static final RegistryObject<Item> NO_FEAR = block(LeoModBlocks.NO_FEAR, LeoModTabs.TAB_NO_FEARR);
	public static final RegistryObject<Item> BORNA_BOKI_FLUID_BUCKET = REGISTRY.register("borna_boki_fluid_bucket", () -> new BornaBokiFluidItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
