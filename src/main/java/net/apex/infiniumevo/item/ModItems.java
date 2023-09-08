package net.apex.infiniumevo.item;

import net.apex.infiniumevo.InfiniumEvo;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
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

    //Resources / Infinium Ingot
    public static final RegistryObject<Item> INFINIUM = ITEMS.register("infinium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IE_ITEMS)));
    public static final RegistryObject<Item> RAWINFINIUM = ITEMS.register("raw_infinium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IE_ITEMS)));


    public static final RegistryObject<Item> EGG_CORE = ITEMS.register("egg_core",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IE_ITEMS)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
