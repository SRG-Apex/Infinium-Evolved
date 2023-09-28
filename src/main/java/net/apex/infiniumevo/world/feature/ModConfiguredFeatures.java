package net.apex.infiniumevo.world.feature;

import com.google.common.base.Suppliers;
import net.apex.infiniumevo.InfiniumEvo;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.apex.infiniumevo.block.ModBlocks;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, InfiniumEvo.MOD_ID);
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ALUMINIUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ALUMINIUM_ORE.get().defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ALUMINIUM_ORE = CONFIGURED_FEATURES.register("aluminium_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ALUMINIUM_ORES.get(),12)));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ENDERITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.ENDERITE_ORE.get().defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ENDERITE_ORE = CONFIGURED_FEATURES.register("enderite_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ENDERITE_ORES.get(),7)));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TITANIUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.TITANIUM_ORE.get().defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> TITANIUM_ORE = CONFIGURED_FEATURES.register("titanium_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TITANIUM_ORES.get(),7)));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_CRYSTALITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.CRYSTALITE_ORE.get().defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> CRYSTALITE_ORE = CONFIGURED_FEATURES.register("crystalite_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_CRYSTALITE_ORES.get(),7)));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ENDERITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.ENDERITE_ORE.get().defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ENDERITE_ORE = CONFIGURED_FEATURES.register("enderite_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ENDERITE_ORES.get(),7)));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TITANIUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.TITANIUM_ORE.get().defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> TITANIUM_ORE = CONFIGURED_FEATURES.register("titanium_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TITANIUM_ORES.get(),7)));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_CRYSTALITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.CRYSTALITE_ORE.get().defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> CRYSTALITE_ORE = CONFIGURED_FEATURES.register("crystalite_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_CRYSTALITE_ORES.get(),7)));


    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }

}
