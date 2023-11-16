package net.apex.infiniumevo.util;

import net.apex.infiniumevo.InfiniumEvo;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_T5_TOOL
                = tag("needs_t5_tool");
        public static final TagKey<Block> NEEDS_T6_TOOL
                = tag("needs_t6_tool");
        public static final TagKey<Block> NEEDS_T7_TOOL
                = tag("needs_t7_tool");
        public static final TagKey<Block> NEEDS_T8_TOOL
                = tag("needs_t8_tool");



        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(InfiniumEvo.MOD_ID, name));
        }


        private static TagKey<Block> forgeTag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
