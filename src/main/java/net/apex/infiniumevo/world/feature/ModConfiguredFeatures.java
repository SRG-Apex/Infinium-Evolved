package net.apex.infiniumevo.world.feature;

import com.google.common.base.Suppliers;
import net.apex.infiniumevo.InfiniumEvo;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.apex.infiniumevo.block.ModBlocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, InfiniumEvo.MOD_ID);
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_STEEL_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.STEEL_ORE.get().defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> STEEL_ORE = CONFIGURED_FEATURES.register("steel_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_STEEL_ORES.get(),12)));


    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }

}
