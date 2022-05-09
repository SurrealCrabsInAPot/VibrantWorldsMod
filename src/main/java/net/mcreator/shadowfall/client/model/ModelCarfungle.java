package net.mcreator.shadowfall.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelCarfungle<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("shadowfall", "model_carfungle"), "main");
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart Mushroom;
	public final ModelPart Tail;
	public final ModelPart Head;
	public final ModelPart Body;

	public ModelCarfungle(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.Mushroom = root.getChild("Mushroom");
		this.Tail = root.getChild("Tail");
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -10.0F, 4.0F, 4.0F, 4.0F, -6.0F, new CubeDeformation(0.0F)).texOffs(36, 56)
						.addBox(-8.0F, -6.0F, -2.0F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(92, 24)
						.addBox(-4.0F, -2.0F, 10.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 92)
						.addBox(-8.0F, -2.0F, 10.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 90)
						.addBox(-6.0F, -2.0F, 14.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-6.0F, -4.0F, 10.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, 24.0F, -10.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -10.0F, 4.0F, 4.0F, 4.0F, -6.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(-2.0F, -6.0F, -2.0F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(90, 56)
						.addBox(0.0F, -2.0F, 14.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 90)
						.addBox(-2.0F, -2.0F, 10.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(0.0F, -4.0F, 10.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 12)
						.addBox(4.0F, -2.0F, 5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 0)
						.addBox(-26.0F, -2.0F, 5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 90)
						.addBox(2.0F, -2.0F, 10.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.0F, 24.0F, -10.0F));
		PartDefinition Mushroom = partdefinition.addOrReplaceChild("Mushroom", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Stem = Mushroom.addOrReplaceChild("Stem",
				CubeListBuilder.create().texOffs(52, 88).addBox(-4.0F, -18.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 88)
						.addBox(-6.0F, -16.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 68)
						.addBox(-4.0F, -14.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 88)
						.addBox(-4.0F, -20.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Cap = Mushroom.addOrReplaceChild("Cap",
				CubeListBuilder.create().texOffs(64, 80).addBox(-6.0F, -20.0F, 12.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 64)
						.addBox(-6.0F, -20.0F, 4.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 48)
						.addBox(-6.0F, -22.0F, 6.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Cap.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(76, 30).addBox(6.0F, -20.0F, 4.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 26)
						.addBox(6.0F, -20.0F, -4.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition ForeheadBloom = Mushroom.addOrReplaceChild(
				"ForeheadBloom", CubeListBuilder.create().texOffs(54, 18).addBox(-11.0F, -20.0F, 12.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(60, 56).addBox(-11.0F, -22.0F, 6.0F, 12.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 8.0F, 13.0F));
		PartDefinition cube_r2 = ForeheadBloom.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(76, 22).addBox(5.0F, -20.0F, -4.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 64)
						.addBox(5.0F, -20.0F, 10.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail",
				CubeListBuilder.create().texOffs(38, 84).addBox(-4.0F, -12.0F, -14.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 84)
						.addBox(2.0F, -12.0F, -14.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 0)
						.addBox(-9.0F, -14.0F, 10.0F, 18.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(76, 80)
						.addBox(-10.0F, -15.0F, 17.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 0)
						.addBox(9.0F, -15.0F, 17.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition eyesocket_r1 = Tail.addOrReplaceChild("eyesocket_r1",
				CubeListBuilder.create().texOffs(0, 34).addBox(8.0F, -26.0F, 2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(-8.0F, -26.0F, 2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Tailbase2 = Tail.addOrReplaceChild("Tailbase2",
				CubeListBuilder.create().texOffs(58, 34).addBox(-6.0F, -8.0F, -18.0F, 12.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(90, 48)
						.addBox(2.0F, -10.0F, -16.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 90)
						.addBox(-4.0F, -10.0F, -16.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 90)
						.addBox(2.0F, -8.0F, -20.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(90, 28)
						.addBox(-4.0F, -8.0F, -20.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition TailMid = Tail.addOrReplaceChild("TailMid",
				CubeListBuilder.create().texOffs(14, 84).addBox(1.0F, -10.0F, -22.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 84)
						.addBox(-5.0F, -10.0F, -22.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(90, 18)
						.addBox(-5.0F, -8.0F, -24.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 68)
						.addBox(-5.0F, -6.0F, -24.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(20, 90)
						.addBox(1.0F, -8.0F, -24.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 0.0F, 0.0F));
		PartDefinition LowerJaw = Tail.addOrReplaceChild("LowerJaw", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Tailspikesmall8_r1 = LowerJaw.addOrReplaceChild("Tailspikesmall8_r1",
				CubeListBuilder.create().texOffs(68, 86).addBox(10.0F, -13.0F, 7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 74)
						.addBox(10.0F, -15.0F, 9.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 86)
						.addBox(10.0F, -13.0F, 11.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(62, 84)
						.addBox(11.0F, -13.0F, 14.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 74)
						.addBox(11.0F, -15.0F, 16.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 84)
						.addBox(11.0F, -13.0F, 18.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 86)
						.addBox(-8.0F, -13.0F, 18.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 74)
						.addBox(-8.0F, -15.0F, 16.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 88)
						.addBox(-8.0F, -13.0F, 14.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 34)
						.addBox(-8.0F, -13.0F, 7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 74)
						.addBox(-8.0F, -15.0F, 9.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 88)
						.addBox(-8.0F, -13.0F, 11.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 34).addBox(-9.0F, -12.0F, 6.0F, 22.0F,
								8.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition Tailspikesmall9_r1 = LowerJaw.addOrReplaceChild("Tailspikesmall9_r1",
				CubeListBuilder.create().texOffs(46, 84).addBox(20.0F, -11.0F, -8.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 56)
						.addBox(20.0F, -13.0F, -6.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(82, 80).addBox(20.0F, -11.0F, -4.0F, 1.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -1.5765F, -1.3092F, 1.5651F));
		PartDefinition Tailspiketall6_r1 = LowerJaw.addOrReplaceChild("Tailspiketall6_r1",
				CubeListBuilder.create().texOffs(24, 56).addBox(20.0F, -13.0F, 1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(82, 18)
						.addBox(20.0F, -11.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 64).addBox(20.0F, -11.0F, 3.0F, 1.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, -1.5765F, -1.3092F, 1.5651F));
		PartDefinition Tailend = Tail.addOrReplaceChild("Tailend",
				CubeListBuilder.create().texOffs(24, 56).addBox(-4.0F, -2.0F, -8.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(74, 88)
						.addBox(-2.0F, -4.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 90)
						.addBox(-4.0F, -4.0F, -6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 90)
						.addBox(-2.0F, -4.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 82)
						.addBox(-4.0F, -4.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, -2.0F, -24.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -12.0F, -12.0F, 16.0F, 12.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(48, 74)
						.addBox(-14.0F, -16.0F, 2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 74)
						.addBox(-14.0F, -18.0F, -4.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(32, 74)
						.addBox(-14.0F, -16.0F, -6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 74)
						.addBox(-4.0F, -16.0F, -6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -18.0F, -4.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-4.0F, -16.0F, 2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 24.0F, 0.0F));
		PartDefinition LeftBodySpikes = Body.addOrReplaceChild("LeftBodySpikes", CubeListBuilder.create(), PartPose.offset(-10.0F, 0.0F, 0.0F));
		PartDefinition RightBodySpikes = Body.addOrReplaceChild("RightBodySpikes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		LeftLeg.render(poseStack, buffer, packedLight, packedOverlay);
		RightLeg.render(poseStack, buffer, packedLight, packedOverlay);
		Mushroom.render(poseStack, buffer, packedLight, packedOverlay);
		Tail.render(poseStack, buffer, packedLight, packedOverlay);
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		Body.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
