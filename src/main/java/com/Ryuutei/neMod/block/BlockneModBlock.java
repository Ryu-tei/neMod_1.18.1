package com.Ryuutei.neMod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class BlockneModBlock extends Block {

    public BlockneModBlock() {
        super(Properties.of(Material.GLASS,MaterialColor.GRASS)
                .strength(80F, 80F)
                .sound(SoundType.GLASS)
                .lightLevel(value -> 30));

        this.setRegistryName("nemod_block");
       }
    }