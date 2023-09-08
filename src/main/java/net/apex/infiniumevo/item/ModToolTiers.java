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
    public static Tier T5;
    public static Tier T6;
//    public static Tier T7;
//
//    public static Tier T8;


    static {
        T5 = TierSortingRegistry.registerTier(
                new ForgeTier(5, 2500, 9f, 3f, 24,
                        ModTags.Blocks.NEEDS_T5_TOOL, () -> Ingredient.of(ModItems.CRYSTALITE.get())),
                new ResourceLocation(InfiniumEvo.MOD_ID, "crystalite"), List.of(Tiers.NETHERITE), List.of());

        T6 = TierSortingRegistry.registerTier(
                new ForgeTier(6, 5000, 9f, 3f, 24,
                        ModTags.Blocks.NEEDS_T5_TOOL, () -> Ingredient.of(ModItems.INFINIUM.get())),
                new ResourceLocation(InfiniumEvo.MOD_ID, "infinium"), List.of(Tiers.NETHERITE), List.of());

//        T7 = TierSortingRegistry.registerTier(
//                new ForgeTier(7, 10000, 9f, 3f, 24,
//                        ModTags.Blocks.NEEDS_T5_TOOL, () -> Ingredient.of(ModItems.REALITY.get())),
//                new ResourceLocation(InfiniumEvo.MOD_ID, "reality"), List.of(Tiers.NETHERITE), List.of());
//
//        T8 = TierSortingRegistry.registerTier(
//                new ForgeTier(8, 100000, 9f, 3f, 24,
//                        ModTags.Blocks.NEEDS_T5_TOOL, () -> Ingredient.of(ModItems.VOID.get())),
//                new ResourceLocation(InfiniumEvo.MOD_ID, "void"), List.of(Tiers.NETHERITE), List.of());



    }
}
