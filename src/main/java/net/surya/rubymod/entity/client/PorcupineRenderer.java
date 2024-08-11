package net.surya.rubymod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.surya.rubymod.RubyMod;
import net.surya.rubymod.entity.custom.PorcupineEntity;

public class PorcupineRenderer extends MobRenderer<PorcupineEntity, PorcupineModel<PorcupineEntity>> {
    public PorcupineRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new PorcupineModel<>(pContext.bakeLayer(ModModelLayers.PORCUPINE_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(PorcupineEntity porcupineEntity) {
        return new ResourceLocation(RubyMod.MOD_ID, "textures/entity/porcupine.png");
    }

    @Override
    public void render(PorcupineEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
