package net.surya.rubymod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.surya.rubymod.RubyMod;
import net.surya.rubymod.block.ModBlocks;
import net.surya.rubymod.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, RubyMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS)
                .add(ModBlocks.RUBY_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.RAW_RUBY_BLOCK.get(),

                        ModBlocks.RUBY_ORE.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                        ModBlocks.NETHER_RUBY_ORE.get(),
                        ModBlocks.END_STONE_RUBY_ORE.get(),

                        ModBlocks.RUBY_DOOR.get(),
                        ModBlocks.RUBY_TRAPDOOR.get(),

                        ModBlocks.RUBY_STAIRS.get(),
                        ModBlocks.RUBY_SLAB.get(),
                        ModBlocks.RUBY_BUTTON.get(),
                        ModBlocks.RUBY_PRESSURE_PLATE.get(),

                        ModBlocks.RUBY_FENCE.get(),
                        ModBlocks.RUBY_FENCE_GATE.get(),
                        ModBlocks.RUBY_WALL.get());


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.RAW_RUBY_BLOCK.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.NETHER_RUBY_ORE.get())
                .add(ModBlocks.END_STONE_RUBY_ORE.get())

                .add(ModBlocks.RUBY_DOOR.get())
                .add(ModBlocks.RUBY_TRAPDOOR.get())

                .add(ModBlocks.RUBY_STAIRS.get())
                .add(ModBlocks.RUBY_SLAB.get())
                .add(ModBlocks.RUBY_BUTTON.get())
                .add(ModBlocks.RUBY_PRESSURE_PLATE.get())

                .add(ModBlocks.RUBY_FENCE.get())
                .add(ModBlocks.RUBY_FENCE_GATE.get())
                .add(ModBlocks.RUBY_WALL.get());

        this.tag(ModTags.Blocks.NEEDS_RUBY_TOOL)
                .add(ModBlocks.SOUND_BLOCK.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.RUBY_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.RUBY_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.RUBY_WALL.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.HAZELNUT_LOG.get())
                .add(ModBlocks.HAZELNUT_WOOD.get())
                .add(ModBlocks.STRIPPED_HAZELNUT_LOG.get())
                .add(ModBlocks.STRIPPED_HAZELNUT_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.HAZELNUT_PLANKS.get());
    }
}
