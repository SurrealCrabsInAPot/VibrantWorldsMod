package net.mcreator.shadowfall.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.shadowfall.entity.ShadelingEntity;
import net.mcreator.shadowfall.client.model.ModelShadeling;

public class ShadelingRenderer extends MobRenderer<ShadelingEntity, ModelShadeling<ShadelingEntity>> {
	public ShadelingRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelShadeling(context.bakeLayer(ModelShadeling.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShadelingEntity entity) {
		return new ResourceLocation("shadowfall:textures/shadeling.png");
	}
}
