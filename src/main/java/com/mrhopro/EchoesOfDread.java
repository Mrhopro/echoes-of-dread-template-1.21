package com.mrhopro;

import com.mrhopro.block.ModBlocks;
import com.mrhopro.item.ModItemGroups;
import com.mrhopro.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EchoesOfDread implements ModInitializer {
	public static final String MOD_ID = "echoesofdread";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}