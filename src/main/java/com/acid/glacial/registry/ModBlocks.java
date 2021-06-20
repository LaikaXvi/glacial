package com.acid.glacial.registry;

import com.acid.glacial.glacial;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block FIRN_BRICKS = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(5f, 30.0f)
            .sounds(BlockSoundGroup.NETHERRACK));

    public static final Block FIRN = new Block(FabricBlockSettings
                .of(Material.STONE)
                .breakByTool(FabricToolTags.PICKAXES, 2)
                .requiresTool()
                .strength(5f, 30f)
                .sounds(BlockSoundGroup.STONE)
    );


    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(glacial.MOD_ID, "firn_bricks"), FIRN_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(glacial.MOD_ID, "firn"), FIRN);
    }


}
