package gg.zerbe.macncheesedelight.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class ModFoods {

    public static final FoodProperties CHEDDAR_CHEESE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.5f)
            .build();

    public static final FoodProperties SLICED_CHEDDAR_CHEESE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.1f)
            .build();

    public static final FoodProperties BOWL_OF_MAC_N_CHEESE = new FoodProperties.Builder()
            .nutrition(12)
            .saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 2400, 0), 1.0f)
            .build();
}
