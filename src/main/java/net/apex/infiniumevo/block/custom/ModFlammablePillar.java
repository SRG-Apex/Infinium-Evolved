package net.apex.infiniumevo.block.custom;

import net.apex.infiniumevo.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class ModFlammablePillar extends RotatedPillarBlock {
    public ModFlammablePillar(Properties pProperties) {
        super(pProperties);
    }

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


    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {

            // Stripping
            if(state.is(ModBlocks.WILLOW_LOG.get())) {
                return ModBlocks.STRIPPED_WILLOW_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            // --

            if(state.is(ModBlocks.WILLOW_WOOD.get())) {
                return ModBlocks.STRIPPED_WILLOW_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            // Stripping
            if(state.is(ModBlocks.ENCHANTED_LOG.get())) {
                return ModBlocks.STRIPPED_ENCHANTED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            // --

            if(state.is(ModBlocks.ENCHANTED_WOOD.get())) {
                return ModBlocks.STRIPPED_ENCHANTED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));}

                // Stripping
            if(state.is(ModBlocks.DENSE_JUNGLE_LOG.get())) {
                return ModBlocks.STRIPPED_DENSE_JUNGLE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
                // --

            if(state.is(ModBlocks.DENSE_JUNGLE_WOOD.get())) {
                return ModBlocks.STRIPPED_DENSE_JUNGLE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }

}
