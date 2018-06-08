package com.TRGamer28.general.init;

import java.util.ArrayList; 
import java.util.List;

import com.TRGamer28.general.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ModBlocks {

	public static final  List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON);
	public static final Block COPPER_ORE = new BlockBase("copper_ore", Material.IRON);
	public static final Block SILVER_BLOCK = new BlockBase("silver_block", Material.IRON);
	public static final Block SILVER_ORE = new BlockBase("silver_ore", Material.IRON);
	public static final Block TIN_BLOCK = new BlockBase("tin_block", Material.IRON);
	public static final Block TIN_ORE = new BlockBase("tin_ore", Material.IRON);
	public static final Block BRONZE_BLOCK = new BlockBase("bronze_block", Material.IRON);
	
}

