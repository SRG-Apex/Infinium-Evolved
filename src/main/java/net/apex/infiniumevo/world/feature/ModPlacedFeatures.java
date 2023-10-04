package net.apex.infiniumevo.world.feature;

import net.apex.infiniumevo.InfiniumEvo;
import net.apex.infiniumevo.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, InfiniumEvo.MOD_ID);


    public static final RegistryObject<PlacedFeature> ALUMINIUM_ORE_PLACED = PLACED_FEATURES.register("aluminium_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ALUMINIUM_ORE.getHolder().get(),
                    commonOrePlacement(12, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(5), VerticalAnchor.belowTop(70)))));

    public static final RegistryObject<PlacedFeature> ENDERITE_ORE_PLACED = PLACED_FEATURES.register("enderite_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ENDERITE_ORE.getHolder().get(),
                    commonOrePlacement(12,
                            HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(50)))));

    public static final RegistryObject<PlacedFeature> TITANIUM_ORE_PLACED = PLACED_FEATURES.register("titanium_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.TITANIUM_ORE.getHolder().get(),
                    commonOrePlacement(8,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.belowTop(-10)))));

    public static final RegistryObject<PlacedFeature> CRYSTALITE_ORE_PLACED = PLACED_FEATURES.register("crystalite_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.CRYSTALITE_ORE.getHolder().get(),
                    commonOrePlacement(10,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.belowTop(-40)))));

    public static final RegistryObject<PlacedFeature> WILLOW_CHECKED = PLACED_FEATURES.register("willow_checked",
            () -> new PlacedFeature(ModConfiguredFeatures.WILLOW.getHolder().get(),
                    List.of(PlacementUtils.filteredByBlockSurvival(ModBlocks.WILLOW_SAPLING.get()))));

    public static final RegistryObject<PlacedFeature> WILLOW_PLACED = PLACED_FEATURES.register("willow_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.WILLOW_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2))));
    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}