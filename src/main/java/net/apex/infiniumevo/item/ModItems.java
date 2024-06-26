package net.apex.infiniumevo.item;

import net.apex.infiniumevo.InfiniumEvo;
import net.apex.infiniumevo.entity.ModEntities;
import net.apex.infiniumevo.item.custom.MultiToolItem;
import net.apex.infiniumevo.item.custom.ReaperScytheItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InfiniumEvo.MOD_ID);



     //Template Item------------------------------------------

    public static final RegistryObject<Item> TESTITEM = ITEMS.register("testitem",
            () -> new Item(new Item.Properties()
            ));



    public static final RegistryObject<Item> ALUMINIUMINGOT = ITEMS.register("aluminium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
            ));
    public static final RegistryObject<Item> ALUMINIUMFRAME = ITEMS.register("aluminium_machine_frame",
            () -> new Item(new Item.Properties()
                    //.tab(ModCreativeModeTab.IE_OTHER)
            ));
    public static final RegistryObject<Item> RAWALUMINIUM = ITEMS.register("raw_aluminium",
            ()-> new Item (new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)

            ));
    public static final RegistryObject<Item> ENDERITE = ITEMS.register("enderite_dust",
            ()-> new Item (new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
            ));

// enderite Tools
    public static final RegistryObject<Item> ENDERITESWORD = ITEMS.register("enderite_sword",
            () -> new SwordItem(Tiers.NETHERITE,8,0f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> ENDERITEPICK = ITEMS.register("enderite_pickaxe",
            () -> new PickaxeItem(Tiers.NETHERITE,4,-1.5f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));

    public static final RegistryObject<Item> ENDERITEAXE = ITEMS.register("enderite_axe",
            () -> new AxeItem(Tiers.NETHERITE,8,-2f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> ENDERITESPADE = ITEMS.register("enderite_spade",
            () -> new ShovelItem(Tiers.NETHERITE,3,-1f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));

    public static final RegistryObject<Item> ENDERITEHOE = ITEMS.register("enderite_hoe",
            () -> new HoeItem(Tiers.NETHERITE,1,-1f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));

    public static final RegistryObject<Item> ENDERITEHELM = ITEMS.register("enderite_helmet",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> ENDERITECHEST = ITEMS.register("enderite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> ENDERITELEGS = ITEMS.register("enderite_leggings",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> ENDERITEBOOTS = ITEMS.register("enderite_boots",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));

    public static final RegistryObject<Item> DREADSTEEL = ITEMS.register("dreadsteel_ingot",
            ()-> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)

            ));

    public static final RegistryObject<Item> GRIMDUST = ITEMS.register("grim_dust",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
            ));


    public static final RegistryObject<Item> DREADSTEELPICK = ITEMS.register("dreadsteel_pickaxe",
            () -> new PickaxeItem(Tiers.NETHERITE,7,-1.5f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));

    public static final RegistryObject<Item> DREADSTEELAXE = ITEMS.register("dreadsteel_axe",
            () -> new AxeItem(Tiers.NETHERITE,10,-2f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> DREADSTEELSPADE = ITEMS.register("dreadsteel_spade",
            () -> new ShovelItem(Tiers.NETHERITE,3,-1f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));

    public static final RegistryObject<Item> DREADSTEELHOE = ITEMS.register("dreadsteel_hoe",
            () -> new HoeItem(Tiers.NETHERITE,3,-1f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));

    public static final RegistryObject<Item> DREADSTEELHELM = ITEMS.register("dreadsteel_helmet",
            () -> new ArmorItem(ModArmorMaterials.DREADSTEEL, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> DREADSTEELCHEST = ITEMS.register("dreadsteel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DREADSTEEL, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> DREADSTEELLEGS = ITEMS.register("dreadsteel_leggings",
            () -> new ArmorItem(ModArmorMaterials.DREADSTEEL, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> DREADSTEELBOOTS = ITEMS.register("dreadsteel_boots",
            () -> new ArmorItem(ModArmorMaterials.DREADSTEEL, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));


    public static final RegistryObject<Item> TITANIUMINGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
            ));
    public static final RegistryObject<Item> TITANIUMFRAME = ITEMS.register("titanium_machine_frame",
            () -> new Item(new Item.Properties()
                   //.tab(ModCreativeModeTab.IE_OTHER)
            ));
    public static final RegistryObject<Item> RAWTITANIUM = ITEMS.register("raw_titanium",
            ()-> new Item (new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)

            ));

    // Crystalite
    public static final RegistryObject<Item> CRYSTALITE = ITEMS.register("crystalite",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
            ));
    public static final RegistryObject<Item> CRYSTALITEPICK = ITEMS.register("crystalite_pickaxe",
            ()-> new PickaxeItem(ModToolTiers.CRYSTALITE_TIER, 5, -1.5f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)

            ));

    // crystalite Tools
    public static final RegistryObject<Item> CRYSTALITESWORD = ITEMS.register("crystalite_sword",
            () -> new SwordItem(ModToolTiers.CRYSTALITE_TIER,16,0f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));

    public static final RegistryObject<Item> CRYSTALITEAXE = ITEMS.register("crystalite_axe",
            () -> new AxeItem(ModToolTiers.CRYSTALITE_TIER,15,-2f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> CRYSTALITESPADE = ITEMS.register("crystalite_spade",
            () -> new ShovelItem(ModToolTiers.CRYSTALITE_TIER,5,-1f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));

    public static final RegistryObject<Item> CRYSTALITEHOE = ITEMS.register("crystalite_hoe",
            () -> new HoeItem(ModToolTiers.CRYSTALITE_TIER,4,-1f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));

    public static final RegistryObject<Item> CRYSTALITEHELM = ITEMS.register("crystalite_helmet",
            () -> new ArmorItem(ModArmorMaterials.CRYSTALITE, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> CRYSTALITECHEST = ITEMS.register("crystalite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CRYSTALITE, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> CRYSTALITELEGS = ITEMS.register("crystalite_leggings",
            () -> new ArmorItem(ModArmorMaterials.CRYSTALITE, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> CRYSTALITEBOOTS = ITEMS.register("crystalite_boots",
            () -> new ArmorItem(ModArmorMaterials.CRYSTALITE, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));

    public static final RegistryObject<Item> INFINIUM = ITEMS.register("infinium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IE_ITEMS)));
    public static final RegistryObject<Item> RAWINFINIUM = ITEMS.register("raw_infinium",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
            ));

    // Infinium Tools
    public static final RegistryObject<Item> INFINIUMSWORD = ITEMS.register("infinium_sword",
            () -> new SwordItem(ModToolTiers.INFINIUM_TIER,24,0f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> INFINIUMPICK = ITEMS.register("infinium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.INFINIUM_TIER,8,-1.5f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));

    public static final RegistryObject<Item> INFINIUMAXE = ITEMS.register("infinium_axe",
            () -> new AxeItem(ModToolTiers.INFINIUM_TIER,16,-2f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> INFINIUMSPADE = ITEMS.register("infinium_spade",
            () -> new ShovelItem(ModToolTiers.INFINIUM_TIER,5,-1f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));

    public static final RegistryObject<Item> INFINIUMHOE = ITEMS.register("infinium_hoe",
            () -> new HoeItem(ModToolTiers.INFINIUM_TIER,5,-1f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));

    public static final RegistryObject<Item> INFINIUMHELM = ITEMS.register("infinium_helmet",
            () -> new ArmorItem(ModArmorMaterials.INFINIUM, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> INFINIUMCHEST = ITEMS.register("infinium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.INFINIUM, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> INFINIUMLEGS = ITEMS.register("infinium_leggings",
            () -> new ArmorItem(ModArmorMaterials.INFINIUM, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> INFINIUMBOOTS = ITEMS.register("infinium_boots",
            () -> new ArmorItem(ModArmorMaterials.INFINIUM, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> EGG_CORE = ITEMS.register("egg_core",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
                    .stacksTo(16)
            ));
    public static final RegistryObject<Item> ADVANCED_TOOL_HANDLE = ITEMS.register("advanced_tool_handle",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
            ));

    public static final RegistryObject<Item> REAPER_SCYTHE = ITEMS.register("reaper_scythe", () -> new ReaperScytheItem());
    public static final RegistryObject<Item> REAPER_SPAWN_EGG = ITEMS.register("reaper_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.REAPER, -6710887, -10066330, new Item.Properties().tab(ModCreativeModeTab.IE_OTHER)));

    // 1.1.0 items
    public static final RegistryObject<Item> REALITY_GEM = ITEMS.register("reality_gem",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)    ));

    public static final RegistryObject<Item> BLAZE_ESSENCE = ITEMS.register("blaze_essence",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)    ));

    public static final RegistryObject<Item> AQUA_ESSENCE = ITEMS.register("aqua_essence",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)    ));

    public static final RegistryObject<Item> TERRA_ESSENCE = ITEMS.register("terra_essence",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)    ));

    public static final RegistryObject<Item> AERO_ESSENCE = ITEMS.register("aero_essence",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)    ));

    public static final RegistryObject<Item> GODLY_TOOL_HANDLE = ITEMS.register("godly_tool_handle",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
            ));

    // Infinium Tools
    public static final RegistryObject<Item> REALITY_KATAR = ITEMS.register("reality_katar",
            () -> new SwordItem(ModToolTiers.REALITY_TIER,30,0f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<MultiToolItem> REALITY_MORNINGSTAR = ITEMS.register("reality_morningstar",
            () -> new MultiToolItem(ModToolTiers.REALITY_TIER, new Item.Properties().tab(ModCreativeModeTab.IE_TOOLS))
            );

    public static final RegistryObject<Item> REALITY_HELM = ITEMS.register("reality_helmet",
            () -> new ArmorItem(ModArmorMaterials.REALITY, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> REALITY_CHEST = ITEMS.register("reality_chestplate",
            () -> new ArmorItem(ModArmorMaterials.REALITY, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> REALITY_LEGS = ITEMS.register("reality_leggings",
            () -> new ArmorItem(ModArmorMaterials.REALITY, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> REALITY_BOOTS = ITEMS.register("reality_boots",
            () -> new ArmorItem(ModArmorMaterials.REALITY, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));

    public static final RegistryObject<Item> ESSENCE_BASE = ITEMS.register("essence_base",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
    ));

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Void
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*
    StarMaterial ingot
    Star Material Raw
    Singularity Essence
    Self Contained Sigularity
    Gravitas Essence
    Jungle Essence
    Unstable Sigularity
    Void Fragment
    Void Ingot
    Condensed Star Material
    Condensed Gravitas Essence
     */

    public static final RegistryObject<Item> StarMaterialIngot = ITEMS.register("star_material_ingot",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
            ));
    public static final RegistryObject<Item> StarMaterialRaw = ITEMS.register("raw_star_material",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
            ));
    public static final RegistryObject<Item> STABLE_SINGULARITY = ITEMS.register("stable_singularity",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
            ));
    public static final RegistryObject<Item> UNSTABLE_SINGULARITY = ITEMS.register("unstable_singularity",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
            ));

    public static final RegistryObject<Item> GRAVITAS_ESSENCE = ITEMS.register("gravitas_essence",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
            ));


    public static final RegistryObject<Item> JUNGLE_ESSENCE = ITEMS.register("jungle_essence",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
            ));


    public static final RegistryObject<Item> VOID_FRAGMENT = ITEMS.register("void_fragment",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
            ));


    public static final RegistryObject<Item> VOID_INGOT = ITEMS.register("void_ingot",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
            ));
    public static final RegistryObject<Item> CONDENSED_STAR_MAT = ITEMS.register("condensed_star_material",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
            ));


    public static final RegistryObject<Item> CONDENSED_GRAV_ESSENCE = ITEMS.register("condensed_gravitas_essence",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
            ));




    // Register function to add items to regestry
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
