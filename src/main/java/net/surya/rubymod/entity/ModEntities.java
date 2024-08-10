package net.surya.rubymod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.surya.rubymod.RubyMod;
import net.surya.rubymod.entity.custom.PorcupineEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RubyMod.MOD_ID);

    public static final RegistryObject<EntityType<PorcupineEntity>> PORCUPINE =
            ENTITY_TYPES.register("porcupine", () -> EntityType.Builder.of(PorcupineEntity::new, MobCategory.CREATURE)
                    .sized(2.5f, 2.5f).build("porcupine"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
