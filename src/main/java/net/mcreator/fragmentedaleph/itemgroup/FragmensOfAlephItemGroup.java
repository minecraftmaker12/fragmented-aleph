
package net.mcreator.fragmentedaleph.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.fragmentedaleph.item.FragmentedAlephItem;
import net.mcreator.fragmentedaleph.FragmentedAlephModElements;

@FragmentedAlephModElements.ModElement.Tag
public class FragmensOfAlephItemGroup extends FragmentedAlephModElements.ModElement {
	public FragmensOfAlephItemGroup(FragmentedAlephModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabfragmens_of_aleph") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(FragmentedAlephItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
