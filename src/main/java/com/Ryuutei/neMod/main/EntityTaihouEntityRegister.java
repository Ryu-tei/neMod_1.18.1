package com.Ryuutei.neMod.main;

import com.Ryuutei.neMod.entities.ModEntities;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(ModConstants.MODID)
public class EntityTaihouEntityRegister {

    public EntityTaihouEntityRegister() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // ここでカスタムエンティティの登録を行う
        ModEntities.registerEntityTypes();
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // クライアント側の初期化処理などを行う場合はここに記述
    }
}
