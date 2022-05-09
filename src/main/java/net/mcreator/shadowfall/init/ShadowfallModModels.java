
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shadowfall.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.shadowfall.client.model.ModelShadeling;
import net.mcreator.shadowfall.client.model.ModelCarfungle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ShadowfallModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelCarfungle.LAYER_LOCATION, ModelCarfungle::createBodyLayer);
		event.registerLayerDefinition(ModelShadeling.LAYER_LOCATION, ModelShadeling::createBodyLayer);
	}
}
