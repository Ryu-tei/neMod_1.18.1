package com.Ryuutei.neMod.client;

import com.Ryuutei.neMod.client.models.renderer.EntityTaihouEntityRenderer;
import com.Ryuutei.neMod.entities.EntityTaihouEntity;
import com.Ryuutei.neMod.entities.ModEntities;
import com.Ryuutei.neMod.main.ModConstants;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = ModConstants.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEventSubscriber {

    @SubscribeEvent
    public static void onRegisterEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        // EntityTaihouEntityのレンダラーを登録
        event.registerEntityRenderer(ModEntities.ENTITY_TAIHOU_ENTITY, EntityTaihouEntityRenderer.RenderFactory::new);
    }

    // EntityTaihouEntityRenderer内にRenderFactoryクラスを作成して、EntityRendererProviderに渡すようにする
    public static class RenderFactory implements EntityRendererProvider<EntityTaihouEntity> {
        public RenderFactory(EntityRendererProvider.Context context) {
            // コンストラクタ内でレンダラーを初期化
        }

        @Override
        public EntityRenderer<EntityTaihouEntity> create(EntityRendererProvider.Context context) {
            return new EntityTaihouEntityRenderer(context);
        }
    }
}
