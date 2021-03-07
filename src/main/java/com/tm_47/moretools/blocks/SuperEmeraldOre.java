package com.tm_47.moretools.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class SuperEmeraldOre extends OreBlock {
    public SuperEmeraldOre() {
        super(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(8.0F, 1000.0F)
                    .sound(SoundType.METAL)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE));
    }
    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch){
        return 1;
    }
}
