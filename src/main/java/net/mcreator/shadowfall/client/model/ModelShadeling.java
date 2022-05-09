package net.mcreator.shadowfall.client.model;

import org.spongepowered.asm.mixin.Shadow;

import net.minecraft.world.entity.Entity;
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
public class ModelShadeling<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("shadowfall", "model_shadeling"), "main");
	public final ModelPart hitbox;
	public final ModelPart Sprout;
	public final ModelPart Shadow;
	public final ModelPart bb_main;

	public ModelShadeling(ModelPart root) {
		this.hitbox = root.getChild("hitbox");
		this.Sprout = root.getChild("Sprout");
		this.Shadow = root.getChild("Shadow");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition hitbox = partdefinition.addOrReplaceChild("hitbox", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition hitbox_r1 = hitbox.addOrReplaceChild("hitbox_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(2.0F, -6.0F, 2.0F, -4.0F, 0.0F, -3.0F, new CubeDeformation(5.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition Sprout = partdefinition.addOrReplaceChild("Sprout", CubeListBuilder.create(), PartPose.offset(-1.0F, 14.0F, 1.0F));
		PartDefinition LeafAccent_r1 = Sprout.addOrReplaceChild("LeafAccent_r1",
				CubeListBuilder.create().texOffs(27, 4).addBox(-4.0F, -13.0F, 1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-2.0F, -14.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 28)
						.addBox(-3.0F, -14.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 28).addBox(-2.0F, -13.0F, 1.0F, 1.0F,
								3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 10.0F, -1.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition Shadow = partdefinition.addOrReplaceChild("Shadow", CubeListBuilder.create(), PartPose.offset(0.0F, 17.0F, 0.0F));
		PartDefinition Shadowlayer1_r1 = Shadow.addOrReplaceChild("Shadowlayer1_r1",
				CubeListBuilder.create().texOffs(0, 32).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Eye_r1 = bb_main.addOrReplaceChild("Eye_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -9.0F, 3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-2.0F, -9.0F, 3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition Body_r1 = bb_main.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(22, 8).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition LeftLeg_r1 = bb_main.addOrReplaceChild("LeftLeg_r1",
				CubeListBuilder.create().texOffs(21, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -4.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition RightLeg_r1 = bb_main.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(26, 26).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -4.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		hitbox.render(poseStack, buffer, packedLight, packedOverlay);
		Sprout.render(poseStack, buffer, packedLight, packedOverlay);
		Shadow.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
