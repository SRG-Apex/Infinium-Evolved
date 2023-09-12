package net.apex.infiniumevo.block;

import net.apex.infiniumevo.item.ModCreativeModeTab;
import net.apex.infiniumevo.item.ModItems;
import net.apex.infiniumevo.InfiniumEvo;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FallingBlock;
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
    public static final RegistryObject<Block> CRYSTALITE_BLOCK = registerBlock("crystalite_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f)
                    .requiresCorrectToolForDrops()

            ),
            ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> CRYSTALITE_ORE = registerBlock("crystalite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f)
                    .requiresCorrectToolForDrops()

            ),
            ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> INFINIUM_BLOCK = registerBlock("infinium_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> INFINIUM_ORE = registerBlock("infinium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f)
                    .requiresCorrectToolForDrops()

            ),
            ModCreativeModeTab.IE_BLOCKS);


    public static final RegistryObject<Block> ENDERITE_ORE = registerBlock("enderite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops()
                    //Add other Properties Here
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> ENDERITE_BLOCK = registerBlock("enderite_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops()
                    //Add other Properties Here
            ),
            ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> STEEL_ORE = registerBlock("steel_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops()
                    //Add other Properties Here
            ),
            ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops()
                    //Add other Properties Here
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops()
                    //Add other Properties Here
            ),
            ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops()
                    //Add other Properties Here
            ),
            ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> DREADSTEEL_BLOCK = registerBlock("dreadsteel_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops()
                    //Add other Properties Here
            ),
            ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> REDROCK = registerBlock("redrock", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops()
                    //Add other Properties Here
            ),
            ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> REDROCK_BRICK = registerBlock("redrock_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops()
                    //Add other Properties Here
            ),
            ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> REDROCK_MOSSY = registerBlock("mossy_redrock_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops()
                    //Add other Properties Here
            ),
            ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> REDROCK_CRACKED = registerBlock("cracked_redrock_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops()
                    //Add other Properties Here
            ),
            ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> BLUE_SAND = registerBlock("blue_sand", () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND)
                    .requiresCorrectToolForDrops()
                    //Add other Properties Here
            ),
            ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> BLUE_SANDSTONE = registerBlock("blue_sandstone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops()
                    //Add other Properties Here
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_BLUE_SANDSTONE = registerBlock("smooth_blue_sandstone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops()
                    //Add other Properties Here
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
