// Made with Blockbench 4.1.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelfruit_spider extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer head;
	private final ModelRenderer rightleg1;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer leftleg1;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer rightleg2;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer leftleg2;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;

	public Modelfruit_spider() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 21.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-6.0F, -6.0F, -7.0F, 12.0F, 6.0F, 12.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1745F, 1.5708F, 0.0F);
		cube_r1.setTextureOffset(54, 55).addBox(-3.0F, -13.0F, 2.0F, 5.0F, 9.0F, 0.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.1745F, -1.5708F, 0.0F);
		cube_r2.setTextureOffset(54, 55).addBox(-2.0F, -13.0F, 2.0F, 5.0F, 9.0F, 0.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1745F, 3.1416F, 0.0F);
		cube_r3.setTextureOffset(52, 55).addBox(-3.0F, -13.0F, 1.0F, 6.0F, 9.0F, 0.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(52, 55).addBox(-3.0F, -13.0F, 2.0F, 6.0F, 9.0F, 0.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 18.0F, -6.0F);
		head.setTextureOffset(0, 18).addBox(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(0, 2).addBox(-3.0F, 2.0F, -6.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(1.0F, 2.0F, -6.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);

		rightleg1 = new ModelRenderer(this);
		rightleg1.setRotationPoint(-6.0F, 19.0F, -4.0F);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-5.0F, -8.0F, 0.0F);
		rightleg1.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 1.6144F);
		cube_r5.setTextureOffset(24, 24).addBox(0.277F, -0.3813F, -1.0F, 13.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 1.0F, 0.0F);
		rightleg1.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 1.0036F);
		cube_r6.setTextureOffset(24, 30).addBox(-10.0F, -1.0F, -1.0F, 10.0F, 1.0F, 2.0F, 0.0F, false);

		leftleg1 = new ModelRenderer(this);
		leftleg1.setRotationPoint(6.0F, 19.0F, -4.0F);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 1.0F, 0.0F);
		leftleg1.addChild(cube_r7);
		setRotationAngle(cube_r7, -3.1416F, 0.0F, 2.138F);
		cube_r7.setTextureOffset(0, 30).addBox(-10.0F, -1.0F, -1.0F, 10.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(5.0F, -8.0F, 0.0F);
		leftleg1.addChild(cube_r8);
		setRotationAngle(cube_r8, -3.1416F, 0.0F, 1.5272F);
		cube_r8.setTextureOffset(18, 21).addBox(0.277F, -0.3813F, -1.0F, 13.0F, 1.0F, 2.0F, 0.0F, false);

		rightleg2 = new ModelRenderer(this);
		rightleg2.setRotationPoint(-6.0F, 19.0F, 2.0F);
		setRotationAngle(rightleg2, 0.0F, 0.0F, -0.2182F);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.8152F, -7.556F, -2.0F);
		rightleg2.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 2.0071F);
		cube_r9.setTextureOffset(18, 18).addBox(0.277F, -0.3813F, 1.0F, 13.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.1848F, 0.444F, -2.0F);
		rightleg2.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 1.0036F);
		cube_r10.setTextureOffset(22, 33).addBox(-9.0F, -1.0F, 1.0F, 9.0F, 1.0F, 2.0F, 0.0F, false);

		leftleg2 = new ModelRenderer(this);
		leftleg2.setRotationPoint(6.0F, 19.0F, 2.0F);
		setRotationAngle(leftleg2, -3.1416F, 0.0F, -2.8362F);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-5.3007F, -8.0463F, 2.0F);
		leftleg2.addChild(cube_r11);
		setRotationAngle(cube_r11, -3.1416F, 0.0F, 2.0508F);
		cube_r11.setTextureOffset(24, 27).addBox(0.777F, 0.4848F, 1.0F, 12.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-0.3007F, 0.9537F, 2.0F);
		leftleg2.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 1.0036F);
		cube_r12.setTextureOffset(0, 33).addBox(-9.0F, -1.0F, -3.0F, 9.0F, 1.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg1.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}