package net.apex.infiniumevo.block;

import net.apex.infiniumevo.InfiniumEvo;
import net.apex.infiniumevo.block.custom.ModFlammablePillar;
import net.apex.infiniumevo.item.ModCreativeModeTab;
import net.apex.infiniumevo.item.ModItems;
import net.apex.infiniumevo.world.feature.tree.DenseJungleTreeGrower;
import net.apex.infiniumevo.world.feature.tree.EnchantedTreeGrower;
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

    public static final RegistryObject<Block> REALITY_BLOCK = registerBlock("reality_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
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

    public static final RegistryObject<Block> willow_FENCE = registerBlock("willow_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                    .requiresCorrectToolForDrops()){
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
            }, ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> willow_FENCE_GATE = registerBlock("willow_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .requiresCorrectToolForDrops()){
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
            }, ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> willow_SLAB = registerBlock("willow_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)
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

    public static final RegistryObject<Block> willow_STAIRS = registerBlock("willow_stairs", ()-> new StairBlock(()-> ModBlocks.DENSE_JUNGLE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).requiresCorrectToolForDrops()
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

    public static final RegistryObject<Block> DENSE_JUNGLE_LOG = registerBlock("dense_jungle_log", ()-> new ModFlammablePillar(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_DENSE_JUNGLE_LOG = registerBlock("stripped_dense_jungle_log", ()-> new ModFlammablePillar(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> DENSE_JUNGLE_WOOD = registerBlock("dense_jungle_wood", ()-> new ModFlammablePillar(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_DENSE_JUNGLE_WOOD = registerBlock("stripped_dense_jungle_wood", ()-> new ModFlammablePillar(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> DENSE_JUNGLE_LEAVES = registerBlock("dense_jungle_leaves", ()-> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)
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
    public static final RegistryObject<Block> DENSE_JUNGLE_SAPLING = registerBlock("dense_jungle_sapling", ()-> new SaplingBlock(new DenseJungleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> DENSE_JUNGLE_PLANKS = registerBlock("dense_jungle_planks", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
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

    /*

    public static final RegistryObject<Block> DENSE_JUNGLE_DOOR = registerBlock("dense_jungle_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> DENSE_JUNGLE_TRAPDOOR = registerBlock("dense_jungle_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.IE_BLOCKS);


     */

    public static final RegistryObject<Block> DENSE_JUNGLE_SLAB = registerBlock("dense_jungle_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)
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



    public static final RegistryObject<Block> DENSE_JUNGLE_STAIRS = registerBlock("dense_jungle_stairs", ()-> new StairBlock(()-> ModBlocks.DENSE_JUNGLE_PLANKS.get().defaultBlockState(),
            BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).requiresCorrectToolForDrops()
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

    public static final RegistryObject<Block> DENSE_JUNGLE_FENCE = registerBlock("dense_jungle_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                    .requiresCorrectToolForDrops()){
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
            }, ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> DENSE_JUNGLE_FENCE_GATE = registerBlock("dense_jungle_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                   .requiresCorrectToolForDrops()){
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
            }, ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> ENCHANTED_LOG = registerBlock("enchanted_log", ()-> new ModFlammablePillar(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_ENCHANTED_LOG = registerBlock("stripped_enchanted_log", ()-> new ModFlammablePillar(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> ENCHANTED_WOOD = registerBlock("enchanted_wood", ()-> new ModFlammablePillar(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_ENCHANTED_WOOD = registerBlock("stripped_enchanted_wood", ()-> new ModFlammablePillar(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .requiresCorrectToolForDrops()
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> ENCHANTED_LEAVES = registerBlock("enchanted_leaves", ()-> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)
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
    public static final RegistryObject<Block> ENCHANTED_SAPLING = registerBlock("enchanted_sapling", ()-> new SaplingBlock(new EnchantedTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            ),
            ModCreativeModeTab.IE_BLOCKS);
    public static final RegistryObject<Block> ENCHANTED_PLANKS = registerBlock("enchanted_planks", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
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

    public static final RegistryObject<Block> enchanted_FENCE = registerBlock("enchanted_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                    .requiresCorrectToolForDrops()){
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
            }, ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> enchanted_FENCE_GATE = registerBlock("enchanted_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .requiresCorrectToolForDrops()){
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
            }, ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> enchanted_STAIRS = registerBlock("enchanted_stairs", ()-> new StairBlock(()-> ModBlocks.DENSE_JUNGLE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).requiresCorrectToolForDrops()
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

    public static final RegistryObject<Block> enchanted_SLAB = registerBlock("enchanted_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)
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

    public static final RegistryObject<Block> JUNGLE_BRICK_CRACKED = registerBlock("cracked_jungle_infused_brick", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
            ),
    ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> JUNGLE_BRICK = registerBlock("jungle_infused_brick", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
            ),
            ModCreativeModeTab.IE_BLOCKS);

    public static final RegistryObject<Block> JUNGLE_STONE = registerBlock("jungle_infused_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
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
