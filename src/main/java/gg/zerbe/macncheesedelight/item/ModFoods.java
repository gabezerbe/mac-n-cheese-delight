package gg.zerbe.macncheesedelight.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;

public class ModFoods {

    public static final FoodProperties CHEDDAR_CHEESE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.5f)
            .build();

    public static final FoodProperties SLICED_CHEDDAR_CHEESE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.1f)
            .build();

//    public static final FoodProperties MOZZARELLA_CHEESE = new FoodProperties.Builder()
//            .nutrition(2)
//            .saturationMod(0.2f)
//            .build();

    public static final FoodProperties BOWL_OF_MAC_N_CHEESE = new FoodProperties.Builder()
            .nutrition(12)
            .saturationMod(2.4f)
            .build();
}
