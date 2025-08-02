package com.mrhopro.item;

import com.mrhopro.EchoesOfDread;
import com.mrhopro.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ECHOES_OF_DREAD_ITEMS_GROUP =Registry.register(Registries.ITEM_GROUP,
            Identifier.of(EchoesOfDread.MOD_ID, "echoes_of_dread_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PORTAL_LIGHTER))
                    .displayName(Text.translatable("itemgroup.echoesofdread.echoes_of_dread_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PORTAL_LIGHTER);
                    })
                    .build());

    public static final ItemGroup ECHOES_OF_DREAD_BLOCKS_GROUP =Registry.register(Registries.ITEM_GROUP,
            Identifier.of(EchoesOfDread.MOD_ID, "echoes_of_dread_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.WEAKENED_CRYING_OBSIDIAN))
                    .displayName(Text.translatable("itemgroup.echoesofdread.echoes_of_dread_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.WEAKENED_DIRT);
                        entries.add(ModBlocks.WEAKENED_GRASS);
                        entries.add(ModBlocks.WEAKENED_CRYING_OBSIDIAN);
                    })
                    .build());

    public static void registerItemGroups(){
        EchoesOfDread.LOGGER.info("Registering Item Groups for " + EchoesOfDread.MOD_ID);
    }
}
