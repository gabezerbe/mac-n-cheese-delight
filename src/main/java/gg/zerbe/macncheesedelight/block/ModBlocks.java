package gg.zerbe.macncheesedelight.block;

import gg.zerbe.macncheesedelight.MacNCheeseDelightMod;
import gg.zerbe.macncheesedelight.block.custom.PotOfMacAndCheeseBlock;
import gg.zerbe.macncheesedelight.item.ModItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MacNCheeseDelightMod.MOD_ID);

    public static final RegistryObject<Block> CHEDDAR_CHEESE_BLOCK = registerBlock("cheddar_cheese_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK)));

    //Custom Block Types for the pots of Mac and Cheese
    public static final RegistryObject<Block> POT_OF_CHEDDAR_MAC_AND_CHEESE = registerBlock("pot_of_cheddar_mac_n_cheese",
            () -> new PotOfMacAndCheeseBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK), ModItems.BOWL_OF_MAC_AND_CHEESE, false));
    //Helper methods
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
