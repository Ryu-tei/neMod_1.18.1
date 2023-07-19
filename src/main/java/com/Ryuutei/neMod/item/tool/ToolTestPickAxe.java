package com.Ryuutei.neMod.item.tool;

import com.Ryuutei.neMod.main.neMod;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ToolTestPickAxe extends PickaxeItem {

    public ToolTestPickAxe() {
        super(neModTiers.MEMOTO,1,-0.0F,new Properties().tab(neMod.NEMOD_TAB).food(Foods.COOKED_CHICKEN));
        this.setRegistryName("test_pickaxe");
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if (player.isSteppingCarefully()){
            player.startUsingItem(hand);
            modeChange(stack);
            player.displayClientMessage(new TextComponent("Mode" + modeName(stack)),true);

            return InteractionResultHolder.consume(stack);
        }
        return InteractionResultHolder.pass(stack);
    }

    public void modeChange(ItemStack stack){
        if (stack.getTag()==null){
            stack.setTag(new CompoundTag());
        }
        stack.getTag().putInt("mode",modeInt(stack) < 1 ? modeInt(stack) + 1 :0);
    }

    public int modeInt(ItemStack stack){
        if (stack.getTag()==null){
            return 0;
        }
        return stack.getTag().getInt("mode");
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        return switch (modeInt(stack)){
          case 0 -> BlockTags.MINEABLE_WITH_PICKAXE.contains(state.getBlock())?neModTiers.MEMOTO.getSpeed() :100.0F;
          case 1 -> BlockTags.MINEABLE_WITH_PICKAXE.contains(state.getBlock())?neModTiers.MEMOTO.getSpeed()*200000 :70000.0F;
            default -> 0F;
        };
    }

    public String modeName(ItemStack stack){
        return switch (modeInt(stack)) {
            case 0 -> "nomal";
            case 1 -> "作業厨";
            default -> "unknown";
        };
    }

            @Override
            public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> list, TooltipFlag tooltipFlag) {
               list.add(new TextComponent("Mode" + modeName(stack)));
        }
    }