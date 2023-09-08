package net.apex.infiniumevo.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.apex.infiniumevo.block.ModBlocks;

public class ModCreativeModeTab {

    //Developer Tab
    public static final CreativeModeTab DEV_TAB=new CreativeModeTab("devtab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TESTITEM.get());
        }
    };

    public static final CreativeModeTab IE_BLOCKS=new CreativeModeTab("blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.INFINIUM_BLOCK.get());
        }
    };

    public static final CreativeModeTab IE_ITEMS=new CreativeModeTab("items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.INFINIUM.get());
        }
    };

    public static final CreativeModeTab IE_TOOLS = new CreativeModeTab("tools") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.INFINIUMPICK.get());
        }
    };
    public static final CreativeModeTab IE_OTHER=new CreativeModeTab("other") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TESTITEM.get());
        }
    };


}
