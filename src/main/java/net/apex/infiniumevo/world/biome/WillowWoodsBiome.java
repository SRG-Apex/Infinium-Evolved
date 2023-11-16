package net.apex.infiniumevo.world.biome;

import net.apex.infiniumevo.block.ModBlocks;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;

import java.util.List;

public class WillowWoodsBiome {

    public static final List<Climate.ParameterPoint> PARAMETER_POINTS = List.of(
            new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.point(0.0f), Climate.Parameter.span(-1f, 1f),
                    0),
            new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.point(1.0f), Climate.Parameter.span(-1f, 1f),
                    0));

    public static Biome createBiome() {
        BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder()
                .fogColor(12638463)
                .waterColor(4159204)
                .waterFogColor(329011)
                .skyColor(7972607)
                .foliageColorOverride(-10040320)
                .grassColorOverride(-13395712)
                .build();


            BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
            biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
                    PlacementUtils.register("infiniumevo:tree_willow_woods",
                            FeatureUtils.register("infiniumevo:willow_enchanted_woods", Feature.TREE,
                                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.WILLOW_LOG.get()), new ForkingTrunkPlacer(7, 2, 2), BlockStateProvider.simple(ModBlocks.WILLOW_LEAVES.get().defaultBlockState()),
                                            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4), new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build()),
                            List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome())));
            BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
            BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
            BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
        BiomeDefaultFeatures.addJungleGrass(biomeGenerationSettings);
        BiomeDefaultFeatures.addForestFlowers(biomeGenerationSettings);
        BiomeDefaultFeatures.addDefaultFlowers(biomeGenerationSettings);

        MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
            return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).temperature(0.5f).downfall(0.5f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
        }

}

