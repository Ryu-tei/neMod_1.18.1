package com.Ryuutei.neMod.main;

import com.Ryuutei.neMod.entities.ModEntities;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModConstants.MODID)
class EntityTaihouEntityRegister {

    public EntityTaihouEntityRegister() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // ここでカスタムエンティティの登録を行う
        ModEntities.ENTITY_TAIHOU_ENTITY_ENTITY_TYPE.setRegistryName("entity_taihou_entity");
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // クライアント側の初期化処理などを行う場合はここに記述
    }
}
