package net.surya.rubymod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.surya.rubymod.RubyMod;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RubyMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RUBYMOD_TAB = CREATIVE_MODE_TABS.register("rubymod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.rubymod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RUBY.get());
                        pOutput.accept(ModItems.RAW_RUBY.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
