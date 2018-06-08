package com.TRGamer28.coppermod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CopperModRecipes {

	public static void init() {
		GameRegistry.addSmelting(CopperModBlocks.COPPER_ORE, new ItemStack(CopperModItems.COPPER_INGOT, 1), 2.0f);
		
	}
	
}
