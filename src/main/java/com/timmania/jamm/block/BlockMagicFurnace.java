package com.timmania.jamm.block;

import com.timmania.jamm.Jamm;

import com.timmania.jamm.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;

import java.util.Random;


public class BlockMagicFurnace extends Block {

    public static final PropertyDirection FACING = BlockHorizontal.FACING;
    private final boolean isBurning;
    private static boolean keepInventory;

    public BlockMagicFurnace(Boolean isBurning, String name) {
        super(Material.ROCK);

        this.setUnlocalizedName(Jamm.MODID + "." + name);
        this.setRegistryName(name);
        this.setCreativeTab(Jamm.JAMM_TAB);
        this.setSoundType(SoundType.STONE);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        this.isBurning = isBurning;
    }

    public Item getItemDropped(IBlockState state, Random rand, int i2){
        return Item.getItemFromBlock(ModBlocks.MAGIC_FURNACE);
    }
}
