package net.surya.rubymod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.surya.rubymod.RubyMod;
import net.surya.rubymod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RubyMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RUBYMOD_TAB = CREATIVE_MODE_TABS.register("rubymod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.rubymod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RUBY.get());
                        pOutput.accept(ModItems.RAW_RUBY.get());

                        pOutput.accept(ModItems.METAL_DETECTOR.get());

                        pOutput.accept(ModItems.TOMATO.get());
                        pOutput.accept(ModItems.TOMATO_SEEDS.get());

                        pOutput.accept(ModItems.COAL_BRIQUETTE.get());

                        pOutput.accept(ModItems.RUBY_STAFF.get());

                        pOutput.accept(ModItems.CORN.get());
                        pOutput.accept(ModItems.CORN_SEEDS.get());

                        pOutput.accept(ModItems.RUBY_SWORD.get());
                        pOutput.accept(ModItems.RUBY_PICKAXE.get());
                        pOutput.accept(ModItems.RUBY_AXE.get());
                        pOutput.accept(ModItems.RUBY_SHOVEL.get());
                        pOutput.accept(ModItems.RUBY_HOE.get());

                        pOutput.accept(ModItems.RUBY_HELMET.get());
                        pOutput.accept(ModItems.RUBY_CHESTPLATE.get());
                        pOutput.accept(ModItems.RUBY_LEGGINGS.get());
                        pOutput.accept(ModItems.RUBY_BOOTS.get());

                        pOutput.accept(ModItems.KAIKAIKITAN_MUSIC_DISC.get());

                        pOutput.accept(ModItems.PORCUPINE_SPAWN_EGG.get());

                        pOutput.accept(ModItems.HAZELNUT_SIGN.get());
                        pOutput.accept(ModItems.HAZELNUT_HANGING_SIGN.get());

                        pOutput.accept(ModItems.HAZELNUT_BOAT.get());
                        pOutput.accept(ModItems.HAZELNUT_CHEST_BOAT.get());

                        pOutput.accept(ModItems.DICE.get());

                        pOutput.accept(ModBlocks.RUBY_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_RUBY_BLOCK.get());

                        pOutput.accept(ModBlocks.RUBY_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_RUBY_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_RUBY_ORE.get());

                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());

                        pOutput.accept(ModBlocks.RUBY_STAIRS.get());
                        pOutput.accept(ModBlocks.RUBY_SLAB.get());
                        pOutput.accept(ModBlocks.RUBY_BUTTON.get());
                        pOutput.accept(ModBlocks.RUBY_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.RUBY_FENCE.get());
                        pOutput.accept(ModBlocks.RUBY_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.RUBY_WALL.get());

                        pOutput.accept(ModBlocks.RUBY_DOOR.get());
                        pOutput.accept(ModBlocks.RUBY_TRAPDOOR.get());

                        pOutput.accept(ModBlocks.DAHLIA.get());

                        pOutput.accept(ModBlocks.GEM_POLISHING_STATION.get());

                        pOutput.accept(ModBlocks.HAZELNUT_LOG.get());
                        pOutput.accept(ModBlocks.HAZELNUT_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_HAZELNUT_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_HAZELNUT_WOOD.get());

                        pOutput.accept(ModBlocks.HAZELNUT_PLANKS.get());
                        pOutput.accept(ModBlocks.HAZELNUT_LEAVES.get());

                        pOutput.accept(ModBlocks.HAZELNUT_SAPLING.get());

                        pOutput.accept(ModBlocks.MOD_PORTAL.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
