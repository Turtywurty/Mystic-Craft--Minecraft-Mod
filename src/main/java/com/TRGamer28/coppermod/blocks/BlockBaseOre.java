package com.TRGamer28.coppermod.blocks;

import java.util.Random;

import com.TRGamer28.coppermod.init.ModBlocks;
import com.TRGamer28.coppermod.init.ModItems;
import com.TRGamer28.coppermod.items.ItemBase;
import com.TRGamer28.coppermod.util.IHasModel;
import com.TRGamer28.mysticcraft.Main;

import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBaseOre extends BlockOre implements IHasModel
{
	
	public BlockBaseOre(String name)
	   {
		   	setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
			
			ModBlocks.BLOCKS.add(this);
			ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	   }
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		
		return null; 
		/**
		 specify item and block  to be returned by its STATIC NAME 
		 in your init.ModBlocks and init.ModItems(or other name)
		 **/
		//ex: if (this == ModBlocks.RUBY_ORE) {return ModItems.RUBY;}
       
	}
	
	/**
     * Get the quantity dropped based on the given fortune level
     */
	@Override
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
        {
            int i = random.nextInt(fortune + 2) - 1;

            if (i < 0)
            {
                i = 0;
            }

            return this.quantityDropped(random) * (i + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }
	
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
	
}
