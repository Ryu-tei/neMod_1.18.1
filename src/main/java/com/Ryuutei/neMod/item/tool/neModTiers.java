package com.Ryuutei.neMod.item.tool;

import com.Ryuutei.neMod.main.neMod;
import com.Ryuutei.neMod.regi.neModItems;
import com.Ryuutei.neMod.regi.neModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class neModTiers {

    public static final ForgeTier MEMOTO = new ForgeTier(5,99999,200F,1,25, neModTags.Blocks.NEEDS_NEMOTO_TOOL, ()->Ingredient.of(neModItems.math_test));

    static {
        TierSortingRegistry.registerTier(MEMOTO,new ResourceLocation(neMod.Mod_ID,"nemoto"), List.of(TierSortingRegistry.getName(Tiers.NETHERITE)),List.of());

    }
}
