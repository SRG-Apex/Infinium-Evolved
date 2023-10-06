package net.apex.infiniumevo;

import net.apex.infiniumevo.block.ModBlocks;
import net.apex.infiniumevo.item.ModItems;
import net.apex.infiniumevo.world.biome.ModBiomes;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import net.apex.infiniumevo.world.feature.ModConfiguredFeatures;
import net.apex.infiniumevo.world.feature.ModPlacedFeatures;

// The value here should match an entry in the META-INF/mods.toml file


@Mod(InfiniumEvo.MOD_ID)
public class InfiniumEvo
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "infiniumevo";
    private static final Logger LOGGER = LogUtils.getLogger();

    public InfiniumEvo()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();




      // Register the Deferred Register to the mod event bus so items and blocks get registered
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBiomes.register(modEventBus);

        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
