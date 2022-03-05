
package net.mcreator.fragmentedaleph.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.fragmentedaleph.itemgroup.FragmensOfAlephItemGroup;
import net.mcreator.fragmentedaleph.FragmentedAlephModElements;

@FragmentedAlephModElements.ModElement.Tag
public class BeautifullyStrangeItem extends FragmentedAlephModElements.ModElement {
	@ObjectHolder("fragmented_aleph:beautifully_strange")
	public static final Item block = null;

	public BeautifullyStrangeItem(FragmentedAlephModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, FragmentedAlephModElements.sounds.get(new ResourceLocation("fragmented_aleph:beautifullystrange")),
					new Item.Properties().group(FragmensOfAlephItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("beautifully_strange");
		}
	}
}
