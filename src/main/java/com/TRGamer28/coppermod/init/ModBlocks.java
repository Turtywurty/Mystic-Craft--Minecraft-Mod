package com.TRGamer28.coppermod.init;

import java.util.ArrayList;
import java.util.List;

import com.TRGamer28.coppermod.blocks.BlockBase;
import com.TRGamer28.coppermod.blocks.BlockOres;
import com.TRGamer28.coppermod.blocks.BlockRicePlant;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ModBlocks {

	public static final  List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON);
	public static final Block BRONZE_BLOCK = new BlockBase("bronze_block", Material.IRON);
	public static final Block STEEL_BLOCK = new BlockBase("steel_block", Material.IRON);
	public static final Block TIN_BLOCK = new BlockBase("tin_block", Material.IRON);
	public static final Block SILVER_BLOCK = new BlockBase("silver_block", Material.IRON);
	public static final Block LIMESTONE = new BlockBase("limestone", Material.ROCK);
	public static final Block CHISELED_LIMESTONE = new BlockBase("chiseled_limestone", Material.ROCK);
	public static final Block MARBLE = new BlockBase("marble_block", Material.ROCK);

	public static final Block ORE_END = new BlockOres("ore_end", "end");
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
	 public static final Block RICE_PLANT = new BlockRicePlant("rice_plant");
	 
	 
}

