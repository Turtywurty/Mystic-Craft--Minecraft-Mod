package com.TRGamer28.general.blocks;

import com.TRGamer28.coppermod.init.CopperModBlocks; 
import com.TRGamer28.coppermod.init.CopperModItems;
import com.TRGamer28.general.Main;
import com.TRGamer28.general.init.ModBlocks;
import com.TRGamer28.general.init.ModItems;
import com.TRGamer28.general.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import javax.annotation.Nullable; 

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockBase extends Block implements IHasModel
{
	
	
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	
	
	//method to override block rendering, for glass or and other transparent blocks.
	/**
	@Override
    public boolean shouldSideBeRendered(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
        return !(world.getBlockState(pos.offset(side)).getBlock() == this);
    } **/
	
	//method for overwriting opaqueness
	/**
	@Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
	 **/
	
	//method for overwriting fullBlocks, for glass
	
	/**
	 @Override
	 public boolean isFullCube(){
	 	return false;
	 }
	 **/
	
	//method for overwriting drops when harvested so shears return a full block
	
	/**
	 public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, @Nullable ItemStack stack)
    {
        if (!worldIn.isRemote && stack != null && stack.getItem() == Items.SHEARS)
        {
            player.addStat(StatList.getBlockStats(this));
            spawnAsEntity(worldIn, pos, new ItemStack(Item.getItemFromBlock(this), 1));
        }
        else
        {
            super.harvestBlock(worldIn, player, pos, state, te, stack);
        }
    } **/
	 
	 
}
