
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.leo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.leo.block.NoFearBlock;
import net.mcreator.leo.block.BornaBokiFluidBlock;
import net.mcreator.leo.block.BornaBokiDimensionPortalBlock;
import net.mcreator.leo.block.BornaBoki2Block;
import net.mcreator.leo.LeoMod;

public class LeoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LeoMod.MODID);
	public static final RegistryObject<Block> BORNA_BOKI_2 = REGISTRY.register("borna_boki_2", () -> new BornaBoki2Block());
	public static final RegistryObject<Block> BORNA_BOKI_DIMENSION_PORTAL = REGISTRY.register("borna_boki_dimension_portal",
			() -> new BornaBokiDimensionPortalBlock());
	public static final RegistryObject<Block> NO_FEAR = REGISTRY.register("no_fear", () -> new NoFearBlock());
	public static final RegistryObject<Block> BORNA_BOKI_FLUID = REGISTRY.register("borna_boki_fluid", () -> new BornaBokiFluidBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			BornaBoki2Block.registerRenderLayer();
		}
	}
}
