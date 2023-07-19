package com.Ryuutei.neMod.main;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class testModTab extends CreativeModeTab {

    public testModTab() {
        super("testmod_tab");
    }

    @Override
    public ItemStack makeIcon() { return new ItemStack(Items.ANVIL); }
}
