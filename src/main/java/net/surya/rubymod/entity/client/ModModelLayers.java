package net.surya.rubymod.entity.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.surya.rubymod.RubyMod;

public class ModModelLayers {
    public static final ModelLayerLocation PORCUPINE_LAYER = new ModelLayerLocation(
            new ResourceLocation(RubyMod.MOD_ID, "porcupine_layer"), "main");

    public static final ModelLayerLocation HAZELNUT_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(RubyMod.MOD_ID, "boat/hazelnut"), "main");
    public static final ModelLayerLocation HAZELNUT_CHEST_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(RubyMod.MOD_ID, "chest_boat/hazelnut"), "main");
}
