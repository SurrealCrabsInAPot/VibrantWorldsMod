
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shadowfall.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.shadowfall.entity.ShadelingEntity;
import net.mcreator.shadowfall.entity.CarfungalEntity;
import net.mcreator.shadowfall.ShadowfallMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShadowfallModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, ShadowfallMod.MODID);
	public static final RegistryObject<EntityType<CarfungalEntity>> CARFUNGAL = register("carfungal",
			EntityType.Builder.<CarfungalEntity>of(CarfungalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CarfungalEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<ShadelingEntity>> SHADELING = register("shadeling",
			EntityType.Builder.<ShadelingEntity>of(ShadelingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShadelingEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CarfungalEntity.init();
			ShadelingEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CARFUNGAL.get(), CarfungalEntity.createAttributes().build());
		event.put(SHADELING.get(), ShadelingEntity.createAttributes().build());
	}
}
