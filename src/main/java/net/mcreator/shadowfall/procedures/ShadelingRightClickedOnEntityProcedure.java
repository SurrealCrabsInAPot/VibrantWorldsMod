package net.mcreator.shadowfall.procedures;

import net.minecraft.world.entity.Entity;

public class ShadelingRightClickedOnEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		entity.startRiding(sourceentity);
	}
}
