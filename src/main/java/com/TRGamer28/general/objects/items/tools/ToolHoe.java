package com.TRGamer28.general.objects.items.tools;
import com.TRGamer28.coppermod.init.CopperModItems;
import com.TRGamer28.general.Main;
import com.TRGamer28.general.init.ModItems;
import com.TRGamer28.general.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel {

 public ToolHoe (String name, ToolMaterial material)
 {
	 super(material);
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
