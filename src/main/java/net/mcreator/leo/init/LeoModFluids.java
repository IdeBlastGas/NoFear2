
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.leo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.leo.fluid.BornaBokiFluidFluid;
import net.mcreator.leo.LeoMod;

public class LeoModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, LeoMod.MODID);
	public static final RegistryObject<Fluid> BORNA_BOKI_FLUID = REGISTRY.register("borna_boki_fluid", () -> new BornaBokiFluidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_BORNA_BOKI_FLUID = REGISTRY.register("flowing_borna_boki_fluid",
			() -> new BornaBokiFluidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(BORNA_BOKI_FLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_BORNA_BOKI_FLUID.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
