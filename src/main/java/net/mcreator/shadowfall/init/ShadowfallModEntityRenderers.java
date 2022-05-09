
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shadowfall.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.shadowfall.client.renderer.ShadelingRenderer;
import net.mcreator.shadowfall.client.renderer.CarfungalRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ShadowfallModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ShadowfallModEntities.CARFUNGAL.get(), CarfungalRenderer::new);
		event.registerEntityRenderer(ShadowfallModEntities.SHADELING.get(), ShadelingRenderer::new);
	}
}
