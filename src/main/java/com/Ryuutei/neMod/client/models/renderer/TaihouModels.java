package com.Ryuutei.neMod.client.models.renderer;
// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class TaihouModels<T extends Entity> extends EntityModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("nemod", "taihou"), "main");
    private final ModelPart bone;


    public TaihouModels(ModelPart root) {
        this.bone = root.getChild("bone");
    }


    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition housin = bone.addOrReplaceChild("housin", CubeListBuilder.create().texOffs(52, 34).addBox(8.1522F, -17.2346F, -5.0F, 2.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(10.1522F, -14.2346F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 24).addBox(-32.8478F, -17.2346F, -5.0F, 21.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-11.8478F, -18.2346F, -6.0F, 20.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

        PartDefinition syarin = bone.addOrReplaceChild("syarin", CubeListBuilder.create().texOffs(16, 65).addBox(7.0F, -13.0F, -35.0F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 62).addBox(-4.0F, -2.0F, -35.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(58, 60).addBox(-4.0F, -15.0F, -35.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 65).addBox(1.5F, -8.5F, -35.0F, 5.5F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(64, 64).addBox(-5.0F, -8.5F, -35.0F, 5.5F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 68).addBox(0.5F, -14.0F, -35.0F, 1.0F, 5.5F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(66, 67).addBox(0.5F, -7.5F, -35.0F, 1.0F, 5.5F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(48, 66).addBox(-6.0F, -13.0F, -35.0F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 23.0F));

        PartDefinition cube_r1 = syarin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(70, 41).addBox(-1.4284F, 7.55F, -1.0F, 2.8284F, 0.9706F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(70, 13).addBox(-1.4284F, -8.45F, -1.0F, 2.8284F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9851F, -8.035F, -34.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition cube_r2 = syarin.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(6, 68).addBox(-1.3789F, 7.5289F, -1.0F, 2.8284F, 1.0211F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0208F, -8.0707F, -34.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition cube_r3 = syarin.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(68, 20).addBox(-1.3789F, -8.4711F, -1.0F, 2.8284F, 1.0211F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9851F, -8.035F, -34.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition cube_r4 = syarin.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 65).addBox(-7.0F, -8.5F, -33.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition cube_r5 = syarin.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 50).addBox(-0.5F, -7.5F, -2.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(66, 34).addBox(-0.5F, 0.5F, -2.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -8.0F, -33.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition cube_r6 = syarin.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(30, 62).addBox(5.0495F, -15.2176F, -12.0F, 1.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5508F, 1.399F, -23.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition syarin2 = bone.addOrReplaceChild("syarin2", CubeListBuilder.create().texOffs(64, 10).addBox(-8.0F, -13.0F, -13.0F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(44, 57).addBox(-6.0F, -2.0F, -13.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(44, 54).addBox(-6.0F, -15.0F, -13.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(50, 63).addBox(-7.0F, -8.5F, -13.0F, 5.5F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(36, 62).addBox(-0.5F, -8.5F, -13.0F, 5.5F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(60, 66).addBox(-1.5F, -14.0F, -13.0F, 1.0F, 5.5F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(54, 66).addBox(-1.5F, -7.5F, -13.0F, 1.0F, 5.5F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(10, 48).addBox(5.0F, -13.0F, -13.0F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 23.0F));

        PartDefinition cube_r7 = syarin2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(70, 16).addBox(-1.4F, 7.55F, -47.0F, 2.8284F, 0.9706F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(70, 10).addBox(-1.4F, -8.45F, -47.0F, 2.8284F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9851F, -8.035F, 34.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition cube_r8 = syarin2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 8).addBox(-1.4495F, 7.5289F, -47.0F, 2.8284F, 1.0211F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0208F, -8.0707F, 34.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition cube_r9 = syarin2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(66, 55).addBox(-1.4495F, -8.4711F, -47.0F, 2.8284F, 1.0211F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9851F, -8.035F, 34.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition cube_r10 = syarin2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 44).addBox(3.0F, -8.5F, -15.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition cube_r11 = syarin2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -7.5F, -46.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(44, 44).addBox(-0.5F, 0.5F, -46.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -8.0F, 33.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition cube_r12 = syarin2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(24, 62).addBox(-1.8069F, -10.975F, -36.0F, 1.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5508F, -4.601F, 23.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition houdai = bone.addOrReplaceChild("houdai", CubeListBuilder.create().texOffs(0, 44).addBox(-7.8794F, -6.316F, -8.0F, 14.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(52, 0).addBox(-7.8794F, -14.316F, 6.0F, 14.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(52, 24).addBox(-7.8794F, -14.316F, -8.0F, 14.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(T p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_) {

    }

    @Override
    public void renderToBuffer(PoseStack p_103111_, VertexConsumer p_103112_, int p_103113_, int p_103114_, float p_103115_, float p_103116_, float p_103117_, float p_103118_) {

    }
}