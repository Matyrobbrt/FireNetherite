package com.matyrobbrt.firenetherite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.matyrobbrt.firenetherite.core.config.FireNetheriteConfig;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("firenetherite")
public class FireNetherite
{
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "firenetherite";

    public FireNetherite() {
		@SuppressWarnings("unused")
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ModLoadingContext.get().registerConfig(Type.SERVER, FireNetheriteConfig.SPEC, "firenetherite-server.toml");
        MinecraftForge.EVENT_BUS.register(this);
    }

}
