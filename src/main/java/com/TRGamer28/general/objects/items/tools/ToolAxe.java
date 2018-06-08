package com.TRGamer28.general.objects.items.tools;


import com.TRGamer28.general.Main;
import com.TRGamer28.general.init.ModItems;
import com.TRGamer28.general.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {

 public ToolAxe (String name, ToolMaterial material)
 {
	 super(material,6.0F,-3.2F);
	 setUnlocalizedName(name);
	 setRegistryName(name);
	 setCreativeTab(CreativeTabs.TOOLS);
	
	ModItems.ITEMS.add(this);
	 
	 
 }
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}