package com.Ryuutei.neMod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class BlocktestBlock extends Block {

    public BlocktestBlock() {
        super(Properties.of(Material.GLASS, MaterialColor.GRASS)
                .strength(0.2F, 1F)
                .sound(SoundType.GLASS)
                .lightLevel(value -> 30));

        this.setRegistryName("test_block");
       }
    }