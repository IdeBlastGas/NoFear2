
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nofear.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.nofear.block.SusBlock;
import net.mcreator.nofear.block.MessiBlock;
import net.mcreator.nofear.NofearMod;

public class NofearModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NofearMod.MODID);
	public static final RegistryObject<Block> MESSI = REGISTRY.register("messi", () -> new MessiBlock());
	public static final RegistryObject<Block> SUS = REGISTRY.register("sus", () -> new SusBlock());
}
