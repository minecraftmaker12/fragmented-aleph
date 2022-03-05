package net.mcreator.fragmentedaleph.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.fragmentedaleph.FragmentedAlephMod;

import java.util.Map;

public class BurntBushMobplayerCollidesWithPlantProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FragmentedAlephMod.LOGGER.warn("Failed to load dependency entity for procedure BurntBushMobplayerCollidesWithPlant!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 15);
	}
}
