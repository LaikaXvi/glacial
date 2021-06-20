package com.acid.glacial;

import com.acid.glacial.registry.ModBlocks;
import com.acid.glacial.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class glacial implements ModInitializer {

    public static final String MOD_ID = "glacial";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "glacial"),
            () -> new ItemStack(ModItems.FROZEN_SNOWBALL)
    );

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}