package net.apex.infiniumevo.block;

import net.apex.infiniumevo.block.custom.ModFlammablePillar;
import net.apex.infiniumevo.item.ModCreativeModeTab;
import net.apex.infiniumevo.item.ModItems;
import net.apex.infiniumevo.InfiniumEvo;
import net.apex.infiniumevo.world.feature.tree.WillowTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, InfiniumEvo.MOD_ID);



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


    public static final RegistryObject<DropExperienceBlock> ENDERITE_ORE = registerBlock("enderite_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops()
                    //Add other Properties Here
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> ENDERITE_BLOCK = registerBlock("enderite_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    //Add other Properties Here
            ),
            ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> ALUMINIUM_ORE = registerBlock("aluminium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops()
                    //Add other Properties Here
            ),
            ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> ALUMINIUM_BLOCK = registerBlock("aluminium_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f)
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
                    .strength(2f)
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

    public static final RegistryObject<Block> WILLOW_LOG = registerBlock("willow_log", ()-> new ModFlammablePillar(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log", ()-> new ModFlammablePillar(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> WILLOW_WOOD = registerBlock("willow_wood", ()-> new ModFlammablePillar(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood", ()-> new ModFlammablePillar(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> WILLOW_LEAVES = registerBlock("willow_leaves", ()-> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)
                    .requiresCorrectToolForDrops()
            ){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            },
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> WILLOW_SAPLING = registerBlock("willow_sapling", ()-> new SaplingBlock(new WillowTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> WILLOW_PLANKS = registerBlock("willow_planks", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .requiresCorrectToolForDrops()
            ){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            },
            ModCreativeModeTab.IE_BLOCKS);


    public static final RegistryObject<Block> DENSE_JUNGLE_LOG = registerBlock("dense_jungle_log", ()-> new Block(BlockBehaviour.Properties.of(Material.WOOD)
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> DENSE_JUNGLE_PLANKS = registerBlock("dense_jungle_planks", ()-> new Block(BlockBehaviour.Properties.of(Material.WOOD)
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> DENSE_JUNGLE_LEAVES = registerBlock("dense_jungle_leaves", () -> new Block(BlockBehaviour.Properties.of(Material.LEAVES)
            ),
            ModCreativeModeTab.IE_BLOCKS);


    public static final RegistryObject<Block> ENCHANTED_LOG = registerBlock("enchanted_log", ()-> new Block(BlockBehaviour.Properties.of(Material.WOOD)
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> ENCHANTED_PLANKS = registerBlock("enchanted_planks", ()-> new Block(BlockBehaviour.Properties.of(Material.WOOD)
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> ENCHANTED_LEAVES = registerBlock("enchanted_leaves", () -> new Block(BlockBehaviour.Properties.of(Material.LEAVES)
            ),
            ModCreativeModeTab.IE_BLOCKS);


    //handlers
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
       RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
       return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name,
                                                                            RegistryObject<T> block,
                                                                            CreativeModeTab tab
    ){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
