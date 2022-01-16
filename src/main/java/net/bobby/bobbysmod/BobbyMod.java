package net.bobby.bobbymod;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BobbyMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("bobbymod");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
