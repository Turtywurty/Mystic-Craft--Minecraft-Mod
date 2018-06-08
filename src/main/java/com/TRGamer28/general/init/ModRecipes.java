package com.TRGamer28.general.init;



import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		
		//smelting recipes
		GameRegistry.addSmelting(ModBlocks.COPPER_ORE, new ItemStack(ModItems.COPPER_INGOT, 1), 2.0f);
	}
	
}
