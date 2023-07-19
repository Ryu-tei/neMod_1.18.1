package com.Ryuutei.neMod.regi;

import com.Ryuutei.neMod.item.Itemtest;
import com.Ryuutei.neMod.item.tool.ToolTestPickAxe;
import com.Ryuutei.neMod.main.neMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(neMod.Mod_ID)
public class neModItems {
    public static final Itemtest math_test = new Itemtest();
    public static final ToolTestPickAxe test_pickaxe = new ToolTestPickAxe();

    @Mod.EventBusSubscriber(modid = neMod.Mod_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register{

     @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event){

         final Item[] items = {
                 math_test,
                 test_pickaxe
                 //点打って二行目
         };
         event.getRegistry().registerAll(items);
     }
    }
}
