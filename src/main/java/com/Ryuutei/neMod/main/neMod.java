package com.Ryuutei.neMod.main;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.common.Mod;

@Mod("nemod")
public class neMod {

    public static final String Mod_ID = "nemod";

    public static final CreativeModeTab NEMOD_TAB = new neModTab();
    public static final CreativeModeTab TESTMOD_TAB = new testModTab();
}
