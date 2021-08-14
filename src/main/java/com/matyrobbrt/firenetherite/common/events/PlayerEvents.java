package com.matyrobbrt.firenetherite.common.events;

import java.util.ArrayList;
import java.util.List;

import com.matyrobbrt.firenetherite.FireNetherite;
import com.matyrobbrt.firenetherite.core.config.FireNetheriteConfig;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = FireNetherite.MOD_ID, bus = Bus.FORGE)
public class PlayerEvents {

	@SubscribeEvent
	public static void netheriteArmourFireResistance(PlayerTickEvent event) {
		PlayerEntity player = event.player;
		List<Integer> armourCount = new ArrayList<>();
		armourCount.add(0, 0);
		armourCount.add(1, 0);
		armourCount.add(2, 0);
		armourCount.add(3, 0);
		if (player.inventory.getArmor(0).getItem().getRegistryName() == Items.NETHERITE_BOOTS.getRegistryName()) {
			armourCount.set(0, 1);
		}
		if (player.inventory.getArmor(1).getItem().getRegistryName() == Items.NETHERITE_LEGGINGS.getRegistryName()) {
			armourCount.set(1, 1);
		}
		if (player.inventory.getArmor(2).getItem().getRegistryName() == Items.NETHERITE_CHESTPLATE.getRegistryName()) {
			armourCount.set(2, 1);
		}
		if (player.inventory.getArmor(3).getItem().getRegistryName() == Items.NETHERITE_HELMET.getRegistryName()) {
			armourCount.set(3, 1);
		}
		
		if (armourCount.get(0) + armourCount.get(1) + armourCount.get(2) + armourCount.get(3) >= FireNetheriteConfig.ARMOUR_PIECES_NEEDED.get()) {
			player.addEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 320, 0, true, true));
		}
		
	}
	
}
