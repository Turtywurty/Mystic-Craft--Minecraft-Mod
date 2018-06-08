package com.TRGamer28.coppermod.init;

import java.util.ArrayList;
import java.util.List;

import com.TRGamer28.coppermod.items.ItemBase;
import com.TRGamer28.coppermod.items.tools.ToolAxe;
import com.TRGamer28.coppermod.items.tools.ToolBow;
import com.TRGamer28.coppermod.items.tools.ToolHoe;
import com.TRGamer28.coppermod.items.tools.ToolPickaxe;
import com.TRGamer28.coppermod.items.tools.ToolSpade;
import com.TRGamer28.coppermod.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import scala.tools.nsc.settings.Final;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
     //Materials
	public static final ToolMaterial MATERIAL_COPPER = EnumHelper.addToolMaterial("material_copper", 1, 131, 6.0F, 2.0F, 10);
	
	
	//Items
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item COPPER_NUGGET = new ItemBase("copper_nugget");
	
	//Tools
	 public static final ItemSword COPPER_INGOT_SWORD = new ToolSword("copper_ingot_sword", MATERIAL_COPPER);
	 public static final ItemSpade COPPER_INGOT_SHOVEL = new ToolSpade("copper_ingot_shovel", MATERIAL_COPPER);
	 public static final ItemPickaxe COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", MATERIAL_COPPER);
	 public static final ItemAxe COPPER_INGOT_AXE = new ToolAxe("copper_ingot_axe", MATERIAL_COPPER);
	 public static final ItemHoe COPPER_INGOT_HOE = new ToolHoe("copper_ingot_hoe", MATERIAL_COPPER);
	 public static final ToolBow COPPERBOW = new ToolBow("copperbow", MATERIAL_COPPER);

}
