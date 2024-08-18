package net.surya.rubymod.worldgen.tree;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.surya.rubymod.RubyMod;
import net.surya.rubymod.worldgen.tree.custom.HazelnutFoliagePlacer;

public class ModFoliagePlacers {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS =
            DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, RubyMod.MOD_ID);

    public static final RegistryObject<FoliagePlacerType<HazelnutFoliagePlacer>> HAZELNUT_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("hazelnut_foliage_placer", () -> new FoliagePlacerType<>(HazelnutFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACERS.register(eventBus);
    }
}
