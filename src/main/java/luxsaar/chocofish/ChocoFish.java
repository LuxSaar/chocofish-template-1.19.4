package luxsaar.chocofish;

import luxsaar.chocofish.block.ModBlocks;
import luxsaar.chocofish.item.ModItemGroup;
import luxsaar.chocofish.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChocoFish implements ModInitializer {
	public static final String MOD_ID = "chocofish";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("chocofish");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}