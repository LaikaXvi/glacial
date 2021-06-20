package com.acid.glacial.registry;

import com.acid.glacial.glacial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final BlockItem FIRN_BRICKS = new BlockItem(ModBlocks.FIRN_BRICKS, new Item.Settings().group(glacial.ITEM_GROUP));
    public static final BlockItem FIRN = new BlockItem(ModBlocks.FIRN, new Item.Settings().group(glacial.ITEM_GROUP));
    public static final Item FROZEN_SNOWBALL = new Item(new Item.Settings().group(glacial.ITEM_GROUP));

    public static void registerItems() {
       Registry.register(Registry.ITEM, new Identifier(glacial.MOD_ID, "firn_bricks"), FIRN_BRICKS);
       Registry.register(Registry.ITEM, new Identifier(glacial.MOD_ID, "frozen_snowball"), FROZEN_SNOWBALL);
       Registry.register(Registry.ITEM, new Identifier(glacial.MOD_ID, "firn"), FIRN);
    }



}
