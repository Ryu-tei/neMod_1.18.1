package com.Ryuutei.neMod.item;

import com.Ryuutei.neMod.main.neMod;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;

import static net.minecraft.world.food.Foods.CHICKEN;

public class Itemtest extends Item {

    public Itemtest() {
        super(new Properties().tab(neMod.NEMOD_TAB).fireResistant().stacksTo(100).food(Foods.ROTTEN_FLESH));
    this.setRegistryName("math_test");
    }

}
