package net.surya.rubymod.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.surya.rubymod.RubyMod;
import net.surya.rubymod.entity.ModEntities;
import net.surya.rubymod.entity.custom.PorcupineEntity;

@Mod.EventBusSubscriber(modid = RubyMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.PORCUPINE.get(), PorcupineEntity.createAttributes().build());
    }
}
