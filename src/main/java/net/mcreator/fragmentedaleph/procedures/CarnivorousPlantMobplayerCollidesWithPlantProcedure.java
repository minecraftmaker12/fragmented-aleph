package net.mcreator.fragmentedaleph.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.fragmentedaleph.FragmentedAlephMod;

import java.util.Map;
import java.util.Calendar;

public class CarnivorousPlantMobplayerCollidesWithPlantProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FragmentedAlephMod.LOGGER.warn("Failed to load dependency entity for procedure CarnivorousPlantMobplayerCollidesWithPlant!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!(Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 25 && Calendar.getInstance().get(Calendar.MONTH) == 12)) {
			entity.attackEntityFrom(DamageSource.CACTUS, (float) 1);
		}
	}
}
