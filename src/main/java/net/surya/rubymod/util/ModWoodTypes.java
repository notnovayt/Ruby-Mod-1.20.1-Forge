package net.surya.rubymod.util;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.surya.rubymod.RubyMod;

public class ModWoodTypes {
    public static final WoodType HAZELNUT = WoodType.register(new WoodType(RubyMod.MOD_ID + ":hazelnut", BlockSetType.OAK));
}
