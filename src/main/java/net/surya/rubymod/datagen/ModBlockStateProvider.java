package net.surya.rubymod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.surya.rubymod.RubyMod;
import net.surya.rubymod.block.ModBlocks;
import net.surya.rubymod.block.custom.CornCropBlock;
import net.surya.rubymod.block.custom.TomatoCropBlock;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, RubyMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.RAW_RUBY_BLOCK);

        blockWithItem(ModBlocks.RUBY_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockWithItem(ModBlocks.END_STONE_RUBY_ORE);
        blockWithItem(ModBlocks.NETHER_RUBY_ORE);

        blockWithItem(ModBlocks.SOUND_BLOCK);

        stairsBlock(((StairBlock) ModBlocks.RUBY_STAIRS.get()), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.RUBY_SLAB.get()), blockTexture(ModBlocks.RUBY_BLOCK.get()), blockTexture(ModBlocks.RUBY_BLOCK.get()));

        buttonBlock(((ButtonBlock) ModBlocks.RUBY_BUTTON.get()), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.RUBY_PRESSURE_PLATE.get()), blockTexture(ModBlocks.RUBY_BLOCK.get()));

        fenceBlock(((FenceBlock) ModBlocks.RUBY_FENCE.get()), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.RUBY_FENCE_GATE.get()), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.RUBY_WALL.get()), blockTexture(ModBlocks.RUBY_BLOCK.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.RUBY_DOOR.get()), modLoc("block/ruby_door_bottom"), modLoc("block/ruby_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.RUBY_TRAPDOOR.get()), modLoc("block/ruby_trapdoor"), true, "cutout");

        makeTomatoCrop((CropBlock) ModBlocks.TOMATO_CROP.get(), "tomato_crop_stage", "tomato_crop_stage");
        makeCornCrop((CropBlock) ModBlocks.CORN_CROP.get(), "corn_crop_stage", "corn_crop_stage");

        simpleBlockWithItem(ModBlocks.DAHLIA.get(), models().cross(blockTexture(ModBlocks.DAHLIA.get()).getPath(),
                blockTexture(ModBlocks.DAHLIA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_DAHLIA.get(), models().singleTexture("potted_dahlia", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.DAHLIA.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.GEM_POLISHING_STATION.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/gem_polishing_station")));

        logBlock(((RotatedPillarBlock) ModBlocks.HAZELNUT_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.HAZELNUT_WOOD.get()), blockTexture(ModBlocks.HAZELNUT_LOG.get()), blockTexture(ModBlocks.HAZELNUT_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_HAZELNUT_LOG.get()), blockTexture(ModBlocks.STRIPPED_HAZELNUT_LOG.get()),
                new ResourceLocation(RubyMod.MOD_ID, "block/stripped_hazelnut_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_HAZELNUT_WOOD.get()), blockTexture(ModBlocks.STRIPPED_HAZELNUT_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_HAZELNUT_LOG.get()));

        blockItem(ModBlocks.HAZELNUT_LOG);
        blockItem(ModBlocks.HAZELNUT_WOOD);
        blockItem(ModBlocks.STRIPPED_HAZELNUT_LOG);
        blockItem(ModBlocks.STRIPPED_HAZELNUT_WOOD);

        blockWithItem(ModBlocks.HAZELNUT_PLANKS);

        leavesBlock(ModBlocks.HAZELNUT_LEAVES);

        signBlock(((StandingSignBlock) ModBlocks.HAZELNUT_SIGN.get()), ((WallSignBlock) ModBlocks.HAZELNUT_WALL_SIGN.get()),
                blockTexture(ModBlocks.HAZELNUT_PLANKS.get()));

        hangingSignBlock(ModBlocks.HAZELNUT_HANGING_SIGN.get(), ModBlocks.HAZELNUT_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.HAZELNUT_PLANKS.get()));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(RubyMod.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    public void makeTomatoCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> tomatoStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] tomatoStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((TomatoCropBlock) block).getAgeProperty()),
                new ResourceLocation(RubyMod.MOD_ID, "block/" + textureName + state.getValue(((TomatoCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    public void makeCornCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> cornStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] cornStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((CornCropBlock) block).getAgeProperty()),
                new ResourceLocation(RubyMod.MOD_ID, "block/" + textureName + state.getValue(((CornCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
