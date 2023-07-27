package com.Ryuutei.neMod.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.ObjectHolder;

public class ModEntities {

    public static final String MODID = "nemod";

    @ObjectHolder(MODID)
    public static final EntityType<EntityTaihouEntity> ENTITY_TAIHOU_ENTITY = null;

    public static final EntityType<EntityTaihouEntity> ENTITY_TAIHOU_ENTITY_ENTITY_TYPE = EntityType.Builder.<EntityTaihouEntity>of(EntityTaihouEntity::new, MobCategory.MISC)
            .sized(0.6f, 1.8f) // エンティティのサイズを指定
            .build(new ResourceLocation(MODID, "entity_taihou_entity").toString()); // ユニークなIDを指定
}
