package net.surya.rubymod.worldgen.tree;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.surya.rubymod.RubyMod;
import net.surya.rubymod.worldgen.tree.custom.HazelnutTrunkPlacer;

public class ModTrunkPlacerTypes {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACER =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, RubyMod.MOD_ID);

    public static final RegistryObject<TrunkPlacerType<HazelnutTrunkPlacer>> HAZELNUT_TRUNK_PLACER =
            TRUNK_PLACER.register("hazelnut_trunk_placer", () -> new TrunkPlacerType<>(HazelnutTrunkPlacer.CODEC));

    public static void register(IEventBus eventBus) {
        TRUNK_PLACER.register(eventBus);
    }
}
