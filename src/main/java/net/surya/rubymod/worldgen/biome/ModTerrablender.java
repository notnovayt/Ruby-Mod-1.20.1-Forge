package net.surya.rubymod.worldgen.biome;

import net.minecraft.resources.ResourceLocation;
import net.surya.rubymod.RubyMod;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(RubyMod.MOD_ID, "overworld"), 5));
    }
}
