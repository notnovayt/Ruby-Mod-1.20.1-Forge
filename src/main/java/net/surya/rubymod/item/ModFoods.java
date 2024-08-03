package net.surya.rubymod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(3).fast()
            .saturationMod(0.25f).effect(() -> new MobEffectInstance(MobEffects.LUCK, 100), 0.25f).build();

}
