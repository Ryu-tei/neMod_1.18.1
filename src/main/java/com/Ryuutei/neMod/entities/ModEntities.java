package com.Ryuutei.neMod.entities;

import com.Ryuutei.neMod.main.ModConstants;
import net.minecraft.world.entity.EntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ModConstants.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities {

    public static final EntityType<EntityTaihouEntity> ENTITY_TAIHOU_ENTITY = EntityType.Builder.<EntityTaihouEntity>of(EntityTaihouEntity::new, MobCategory.MISC)
            .sized(0.6f, 1.8f) // エンティティのサイズを指定
            .build(new ResourceLocation(ModConstants.MODID, "entity_taihou_entity").toString()); // ユニークなIDを指定

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
        // エンティティを登録
        event.getRegistry().register(ENTITY_TAIHOU_ENTITY.setRegistryName(new ResourceLocation(ModConstants.MODID, "entity_taihou_entity")));
    }

    public static void registerEntityTypes() {
    }
}
