package com.apex.infiniumevo.item;

import com.apex.infiniumevo.InfiniumEvo;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InfiniumEvo.MOD_ID);

    // Define your Items Here

    // Template Item------------------------------------------
    public static final RegistryObject<Item> TESTITEM = ITEMS.register("testitem",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DEV_TAB)));

    // -------------------------------------------------------



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
