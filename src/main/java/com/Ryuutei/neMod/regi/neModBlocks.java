package com.Ryuutei.neMod.regi;

import com.Ryuutei.neMod.block.BlockneModBlock;
import com.Ryuutei.neMod.block.BlocktestBlock;
import com.Ryuutei.neMod.main.neMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(neMod.Mod_ID)
public class neModBlocks {

    public static final BlockneModBlock NEMOD_BLOCK = null;
    public static final BlocktestBlock TEST_BLOCK = null;

    @Mod.EventBusSubscriber(modid = neMod.Mod_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register {

        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {
            final Block[] blocks = {
                    new BlockneModBlock(),
                    new BlocktestBlock()
            };
            event.getRegistry().registerAll(blocks);
        }


        @SubscribeEvent
        public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
            final BlockItem[] blockItems = {
                    new BlockItem(NEMOD_BLOCK, new Item.Properties().tab(neMod.NEMOD_TAB)),
                    new BlockItem(TEST_BLOCK, new Item.Properties().tab(neMod.NEMOD_TAB))
            };
            for (BlockItem item : blockItems) {
                final Block block = item.getBlock();
                final ResourceLocation registryName = block.getRegistryName();
                event.getRegistry().register(item.setRegistryName(registryName));
            }
        }
    }
}