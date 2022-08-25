
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nofear.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NofearModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("nofear", "pavle"), new SoundEvent(new ResourceLocation("nofear", "pavle")));
		REGISTRY.put(new ResourceLocation("nofear", "aughhhh"), new SoundEvent(new ResourceLocation("nofear", "aughhhh")));
		REGISTRY.put(new ResourceLocation("nofear", "jaojao"), new SoundEvent(new ResourceLocation("nofear", "jaojao")));
		REGISTRY.put(new ResourceLocation("nofear", "staosinamene"), new SoundEvent(new ResourceLocation("nofear", "staosinamene")));
		REGISTRY.put(new ResourceLocation("nofear", "stroking"), new SoundEvent(new ResourceLocation("nofear", "stroking")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
