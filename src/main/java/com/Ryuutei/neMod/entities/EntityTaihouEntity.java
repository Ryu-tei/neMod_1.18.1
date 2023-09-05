package com.Ryuutei.neMod.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.PathfinderMob;



public class EntityTaihouEntity extends PathfinderMob  {

    public EntityTaihouEntity(EntityType<? extends Mob> entityType, Level level) {
        super((EntityType<? extends PathfinderMob>) entityType, level);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new RandomSwimmingGoal(this, 1.0D, 40));
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, AbstractFish.class, 8.0f));
        this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this, Monster.class));// エンティティがMonsterを攻撃した際に反撃する
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, AbstractFish.class, true));
    }

    // ここでエンティティの属性を設定
    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(20.0); // 最大体力を20に設定
        // 他の属性も必要に応じて設定できます
    }
}

