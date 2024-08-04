package gg.zerbe.macncheesedelight;

import com.mojang.logging.LogUtils;
import gg.zerbe.macncheesedelight.block.ModBlocks;
import gg.zerbe.macncheesedelight.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;
import java.lang.reflect.*;
import java.lang.annotation.*;

@Mod(MacNCheeseDelightMod.MOD_ID)
public class MacNCheeseDelightMod {

        // Defines Mod ID
        public static final String MOD_ID = "macncheesedelight";
        // Directly Referecnes the logger
        private static final Logger LOGGER = LogUtils.getLogger();

        public MacNCheeseDelightMod()
        {
                IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

                // Register our items from the ModItems class
                ModItems.register(modEventBus);
                // Register out custom blocks from the ModBlocks class
                ModBlocks.register(modEventBus);


                MinecraftForge.EVENT_BUS.register(this);
                modEventBus.addListener(this::addCreative);
        }

        public void commonSetup(final FMLCommonSetupEvent event)
        {

        }

        public void addCreative(BuildCreativeModeTabContentsEvent event)
        {
                if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){

                        // Items
                        event.accept(ModItems.CHEDDAR_CHEESE);
                        event.accept(ModItems.SLICED_CHEDDAR_CHEESE);
                        event.accept(ModItems.BOWL_OF_MAC_AND_CHEESE);

                        // Blocks
                        event.accept(ModBlocks.CHEDDAR_CHEESE_BLOCK);
                        event.accept(ModBlocks.POT_OF_CHEDDAR_MAC_AND_CHEESE);
                }
        }

        public void onServerStarting(ServerStartingEvent event)
        {

        }

        @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
        public static class ClientModEvents
        {
            @SubscribeEvent
            public static void onClientSetup(FMLClientSetupEvent event)
            {

            }
        }
}