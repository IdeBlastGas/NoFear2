
package net.mcreator.nofear.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import net.mcreator.nofear.entity.TopfraggerEntity;

public class TopfraggerRenderer extends MobRenderer<TopfraggerEntity, SlimeModel<TopfraggerEntity>> {
	public TopfraggerRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TopfraggerEntity entity) {
		return new ResourceLocation("nofear:textures/entities/unknown-8c086.png");
	}
}
