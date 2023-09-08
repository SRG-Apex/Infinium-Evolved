package net.apex.infiniumevo.item;

import net.apex.infiniumevo.InfiniumEvo;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InfiniumEvo.MOD_ID);



    // Template Item------------------------------------------
    public static final RegistryObject<Item> TESTITEM = ITEMS.register("testitem",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DEV_TAB)));

    // -------------------------------------------------------
    // Define your Items Here

    //Resources


    // Crystalite
    public static final RegistryObject<Item> CRYSTALITE = ITEMS.register("crystalite",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
            ));
    public static final RegistryObject<Item> CRYSTALITEPICK = ITEMS.register("crystalite_pickaxe",
            ()-> new PickaxeItem(ModToolTiers.T5, 5, -1.5f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)


            ));
    // Infinium Ingot
    public static final RegistryObject<Item> INFINIUM = ITEMS.register("infinium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IE_ITEMS)));
    public static final RegistryObject<Item> RAWINFINIUM = ITEMS.register("raw_infinium",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.IE_ITEMS)
            ));

    // Infinium Tools
    public static final RegistryObject<Item> INFINIUMSWORD = ITEMS.register("infinium_sword",
            () -> new SwordItem(ModToolTiers.T6,13,0f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> INFINIUMPICK = ITEMS.register("infinium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.T6,8,-1.5f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));

    public static final RegistryObject<Item> INFINIUMAXE = ITEMS.register("infinium_axe",
            () -> new AxeItem(ModToolTiers.T6,19,-2f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));
    public static final RegistryObject<Item> INFINIUMSPADE = ITEMS.register("infinium_spade",
            () -> new ShovelItem(ModToolTiers.T6,5,-1f, new Item.Properties()
                    .tab(ModCreativeModeTab.IE_TOOLS)
            ));

    public static final RegistryObject<Item> INFINIUMHOE = ITEMS.register("infinium_hoe",
            () -> new HoeItem(ModToolTiers.T6,5,-1f, new Item.Properties()
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
                    .stacksTo(1)
            ));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
