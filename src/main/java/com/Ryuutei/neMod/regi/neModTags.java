package com.Ryuutei.neMod.regi;

import com.Ryuutei.neMod.main.neMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class neModTags {

    public static class Blocks{
        public static final Tags.IOptionalNamedTag NEEDS_NEMOTO_TOOL = tag("needs_nemoto_tool");

        public static final Tags.IOptionalNamedTag<Block> tag(String name){
            return BlockTags.createOptional(new ResourceLocation(neMod.Mod_ID,name));
        }

    }

    public static class Items {

        public static final Tags.IOptionalNamedTag<Item> tag(String name) {
            return ItemTags.createOptional(new ResourceLocation(neMod.Mod_ID, name));
        }
    }
}
