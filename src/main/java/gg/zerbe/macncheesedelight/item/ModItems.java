package gg.zerbe.macncheesedelight.item;

import gg.zerbe.macncheesedelight.MacNCheeseDelightMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MacNCheeseDelightMod.MOD_ID);

    public static final RegistryObject<Item> CHEDDAR_CHEESE = ITEMS.register("cheddar_cheese",
            () -> new Item(new Item.Properties().food(ModFoods.CHEDDAR_CHEESE)));

    public static final RegistryObject<Item> SLICED_CHEDDAR_CHEESE = ITEMS.register("sliced_cheddar_cheese",
            () -> new Item(new Item.Properties().food(ModFoods.SLICED_CHEDDAR_CHEESE)));

//    public static final RegistryObject<Item> MOZZARELLA_CHEESE = ITEMS.register("mozzarella_cheese",
//            () -> new Item(new Item.Properties().food(ModFoods.MOZZARELLA_CHEESE)));
    public static final RegistryObject<Item> BOWL_OF_MAC_AND_CHEESE = ITEMS.register("bowl_of_mac_n_cheese",
            () -> new Item(new Item.Properties().food(ModFoods.BOWL_OF_MAC_N_CHEESE)));

    public static void register(IEventBus bus){
        ITEMS.register(bus);
    }
}
