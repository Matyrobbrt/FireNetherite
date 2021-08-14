package com.matyrobbrt.firenetherite.core.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class FireNetheriteConfig {

	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	
	public static final ForgeConfigSpec.ConfigValue<Integer> ARMOUR_PIECES_NEEDED;
	
	static {
		BUILDER.push("Fire Netherite Config");
		ARMOUR_PIECES_NEEDED = BUILDER.comment("The amount of netherite armour pieces needed to get the fire resistance effect. (1-4) (Default is 4)").define("Netherite Armour Pieces", 4);
		BUILDER.pop();
		SPEC = BUILDER.build();
	}
	
}
