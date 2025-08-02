package com.mrhopro.item;

import com.mrhopro.EchoesOfDread;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PORTAL_LIGHTER = registerItem( "portal_lighter", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(EchoesOfDread.MOD_ID, name), item);
    }

    public static void registerModItems(){
        EchoesOfDread.LOGGER.info("Registering Mod Items for " + EchoesOfDread.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PORTAL_LIGHTER);
        });
    }
}
