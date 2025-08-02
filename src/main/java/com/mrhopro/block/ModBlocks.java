package com.mrhopro.block;

import com.mrhopro.EchoesOfDread;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block WEAKENED_CRYING_OBSIDIAN = registerBlock("weakened_crying_obsidian",
            new Block(AbstractBlock.Settings.create().strength(50.0f, 1200.0f).
                    requiresTool().sounds(BlockSoundGroup.SOUL_SAND)));

    public static final Block WEAKENED_GRASS = registerBlock("weakened_grass",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).ticksRandomly().strength(0.6F)
                    .requiresTool().sounds(BlockSoundGroup.GRASS)));

    public static final Block WEAKENED_DIRT = registerBlock("weakened_dirt",
            new Block(AbstractBlock.Settings.create().strength(0.5F)
                    .requiresTool().sounds(BlockSoundGroup.ROOTED_DIRT)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(EchoesOfDread.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(EchoesOfDread.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        EchoesOfDread.LOGGER.info("Registering Mod Blocks Items for " + EchoesOfDread.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(WEAKENED_CRYING_OBSIDIAN);
            fabricItemGroupEntries.add(WEAKENED_GRASS);
            fabricItemGroupEntries.add(WEAKENED_DIRT);
        });
    }
}
