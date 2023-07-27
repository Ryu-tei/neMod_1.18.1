package com.Ryuutei.neMod.client.models.renderer;

import com.Ryuutei.neMod.entities.EntityTaihouEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class EntityTaihouEntityRenderer extends EntityRenderer<EntityTaihouEntity> {

    public EntityTaihouEntityRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityTaihouEntity entity) {
        // ここでテクスチャのリソースパスを返す
        return new ResourceLocation("nemod", "textures/entity/taihou_texture.png");
    }

    // EntityTaihouEntityRenderer内にRenderFactoryクラスを作成して、EntityRendererProviderに渡すようにする
    public static class RenderFactory implements EntityRendererProvider<EntityTaihouEntity> {
        @Override
        public EntityRenderer<EntityTaihouEntity> create(Context context) {
            return new EntityTaihouEntityRenderer(context);
        }
    }
}