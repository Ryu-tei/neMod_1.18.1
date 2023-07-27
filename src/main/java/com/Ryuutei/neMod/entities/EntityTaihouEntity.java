package com.Ryuutei.neMod.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;

public class EntityTaihouEntity extends Mob {

    public EntityTaihouEntity(EntityType<? extends EntityTaihouEntity> entityType, Level world) {
        super(entityType, world);
    }
}