
package net.mcreator.shadowfall.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.shadowfall.entity.CarfungalEntity;
import net.mcreator.shadowfall.client.model.ModelCarfungle;

public class CarfungalRenderer extends MobRenderer<CarfungalEntity, ModelCarfungle<CarfungalEntity>> {
	public CarfungalRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCarfungle(context.bakeLayer(ModelCarfungle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CarfungalEntity entity) {
		return new ResourceLocation("shadowfall:textures/carfungle.png");
	}
}
