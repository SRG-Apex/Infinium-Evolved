package net.apex.infiniumevo.block;

import net.apex.infiniumevo.item.ModCreativeModeTab;
import net.apex.infiniumevo.item.ModItems;
import net.apex.infiniumevo.InfiniumEvo;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, InfiniumEvo.MOD_ID);
    // template block---------------------
    public static final RegistryObject<Block> TEST_BLOCK = registerBlock("test_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .instabreak()
            ),
            ModCreativeModeTab.DEV_TAB);

    //add actual blocks here
    public static final RegistryObject<Block> INFINIUM_BLOCK = registerBlock("infinium_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f)
            ),
            ModCreativeModeTab.IE_BLOCKS);
    //handlers
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
       RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
       return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
