package com.ashu.mymod;

import com.ashu.mymod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main entrypoint for the mod.
 */
public class MyMod implements ModInitializer {
    public static final String MOD_ID = "mymod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // Register all mod items during common initialization.
        ModItems.registerModItems();
        LOGGER.info("Initialized {}", MOD_ID);
    }
}
