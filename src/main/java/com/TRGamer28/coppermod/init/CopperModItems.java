package com.TRGamer28.coppermod.init;

import java.util.ArrayList;
import java.util.List;

import com.TRGamer28.general.objects.items.ItemBase;
import com.TRGamer28.general.objects.items.tools.ToolAxe;
import com.TRGamer28.general.objects.items.tools.ToolBow;
import com.TRGamer28.general.objects.items.tools.ToolHoe;
import com.TRGamer28.general.objects.items.tools.ToolPickaxe;
import com.TRGamer28.general.objects.items.tools.ToolSpade;
import com.TRGamer28.general.objects.items.tools.ToolSword;

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

public class CopperModItems {
	
     //Materials
	public static final ToolMaterial MATERIAL_COPPER = EnumHelper.addToolMaterial("material_copper", 1, 131, 6.0F, 2.0F, 10);
	public static final ToolMaterial MATERIAL_SILVER = EnumHelper.addToolMaterial("material_silver", 1, 131, 6.0F, 2.0F, 10);
	public static final ToolMaterial MATERIAL_BRONZE = EnumHelper.addToolMaterial("material_bronze", 1, 131, 6.0F, 2.0F, 10);
	public static final ToolMaterial MATERIAL_TIN = EnumHelper.addToolMaterial("material_tin", 1, 131, 6.0F, 2.0F, 10);
	
	
	//Items
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item COPPER_NUGGET = new ItemBase("copper_nugget");
	public static final Item SILVER_INGOT = new ItemBase("silver_ingot");
        public static final Item SILVER_NUGGET = new ItemBase("silver_nugget");
	public static final Item BRONZE_INGOT = new ItemBase("bronze_ingot");
	public static final Item BRONZE_NUGGET = new ItemBase("bronze_nugget");
	public static final Item TIN_INGOT = new ItemBase("tin_ingot");
        public static final Item TIN_NUGGET = new ItemBase("tin_nugget");

	//Tools
	 public static final ItemSword COPPER_INGOT_SWORD = new ToolSword("copper_ingot_sword", MATERIAL_COPPER);
	 public static final ItemSpade COPPER_INGOT_SHOVEL = new ToolSpade("copper_ingot_shovel", MATERIAL_COPPER);
	 public static final ItemPickaxe COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", MATERIAL_COPPER);
	 public static final ItemAxe COPPER_INGOT_AXE = new ToolAxe("copper_ingot_axe", MATERIAL_COPPER);
	 public static final ItemHoe COPPER_INGOT_HOE = new ToolHoe("copper_ingot_hoe", MATERIAL_COPPER);
	 public static final ToolBow COPPERBOW = new ToolBow("copperbow", MATERIAL_COPPER);

}
