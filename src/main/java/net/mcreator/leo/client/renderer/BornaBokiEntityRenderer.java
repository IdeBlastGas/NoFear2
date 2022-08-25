
package net.mcreator.leo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.leo.entity.BornaBokiEntityEntity;
import net.mcreator.leo.client.model.Modelcustom_model;

public class BornaBokiEntityRenderer extends MobRenderer<BornaBokiEntityEntity, Modelcustom_model<BornaBokiEntityEntity>> {
	public BornaBokiEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BornaBokiEntityEntity entity) {
		return new ResourceLocation("leo:textures/entities/test3.png");
	}
}
