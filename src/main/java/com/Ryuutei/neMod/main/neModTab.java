package com.Ryuutei.neMod.main;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class neModTab extends CreativeModeTab {

    public neModTab() {
        super("nemod_tab");
    }

    @Override
    public ItemStack makeIcon() { return new ItemStack(Items.DAMAGED_ANVIL); }
}
