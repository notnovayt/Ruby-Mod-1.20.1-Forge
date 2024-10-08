package net.surya.rubymod.item;

import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.surya.rubymod.RubyMod;
import net.surya.rubymod.block.ModBlocks;
import net.surya.rubymod.entity.ModEntities;
import net.surya.rubymod.entity.custom.ModBoatEntity;
import net.surya.rubymod.item.custom.*;
import net.surya.rubymod.sound.ModSounds;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RubyMod.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(64)));

    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(ModFoods.TOMATO)));
    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TOMATO_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> RUBY_STAFF = ITEMS.register("ruby_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> COAL_BRIQUETTE = ITEMS.register("coal_briquette",
            () -> new FuelItem(new Item.Properties(), 200));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModToolTiers.RUBY, 5, 3, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RUBY, 2, 2, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModToolTiers.RUBY, 3, 1, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModToolTiers.RUBY, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModToolTiers.RUBY, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CORN_SEEDS = ITEMS.register("corn_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CORN_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> CORN = ITEMS.register("corn",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KAIKAIKITAN_MUSIC_DISC = ITEMS.register("kaikaikitan_music_disc",
            () -> new RecordItem(7, ModSounds.KAIKAIKITAN, new Item.Properties().stacksTo(1), 8920));

    public static final RegistryObject<Item> PORCUPINE_SPAWN_EGG = ITEMS.register("porcupine_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.PORCUPINE, 0xa86518, 0x3b260f, new Item.Properties()));

    public static final RegistryObject<Item> HAZELNUT_SIGN = ITEMS.register("hazelnut_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.HAZELNUT_SIGN.get(), ModBlocks.HAZELNUT_WALL_SIGN.get()));
    public static final RegistryObject<Item> HAZELNUT_HANGING_SIGN = ITEMS.register("hazelnut_hanging_sign",
            () -> new HangingSignItem(ModBlocks.HAZELNUT_HANGING_SIGN.get(), ModBlocks.HAZELNUT_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> HAZELNUT_BOAT = ITEMS.register("hazelnut_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.HAZELNUT, new Item.Properties()));
    public static final RegistryObject<Item> HAZELNUT_CHEST_BOAT = ITEMS.register("hazelnut_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.HAZELNUT, new Item.Properties()));

    public static final RegistryObject<Item> DICE = ITEMS.register("dice",
            () -> new DiceItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
