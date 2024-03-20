package net.apex.infiniumevo.item;
import net.apex.infiniumevo.InfiniumEvo;
import net.apex.infiniumevo.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static Tier CRYSTALITE_TIER;
    public static Tier INFINIUM_TIER;

    public static Tier REALITY_TIER;

    // public static Tier VOID_TIER;




    static {
        CRYSTALITE_TIER = TierSortingRegistry.registerTier(
                new ForgeTier(5, 2500, 80f, 3f, 24,
                        ModTags.Blocks.NEEDS_T5_TOOL, () -> Ingredient.of(ModItems.CRYSTALITE.get())),
                new ResourceLocation(InfiniumEvo.MOD_ID, "crystalite"), List.of(Tiers.NETHERITE), List.of());

        INFINIUM_TIER = TierSortingRegistry.registerTier(
                new ForgeTier(6, 5000, 110f, 3f, 24,
                        ModTags.Blocks.NEEDS_T6_TOOL, () -> Ingredient.of(ModItems.INFINIUM.get())),
                new ResourceLocation(InfiniumEvo.MOD_ID, "infinium"), List.of(Tiers.NETHERITE), List.of());

        REALITY_TIER = TierSortingRegistry.registerTier(
                new ForgeTier(7, 10000, 150f, 3f, 24,
                        ModTags.Blocks.NEEDS_T7_TOOL, () -> Ingredient.of(ModItems.REALITY_GEM.get())),
                new ResourceLocation(InfiniumEvo.MOD_ID, "reality"), List.of(Tiers.NETHERITE), List.of());
/*
        VOID_TIER = TierSortingRegistry.registerTier(
                new ForgeTier(6, 15000, 150f, 3f, 24,
                        ModTags.Blocks.NEEDS_T7_TOOL, () -> Ingredient.of(ModItems.REALITY_GEM.get())),
                new ResourceLocation(InfiniumEvo.MOD_ID, "void"), List.of(Tiers.NETHERITE), List.of());
*/



    }
}
