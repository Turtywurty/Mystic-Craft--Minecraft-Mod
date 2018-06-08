package com.TRGamer28.general.objects.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHandSide;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ElytraEntity extends Entity
{

	public ElytraEntity(World worldIn) {
		super(worldIn);
		
		if(this.world.isRemote)
        {
            
            onClientInit();
        }
		
	}
	
	@SideOnly(Side.CLIENT)
    public void onClientInit() {}
	
	 @Override
	    public boolean attackEntityFrom(DamageSource source, float amount) 
	 {
		 return false;
	 }
	
	
	 @Override
	    public void onUpdate()
	    {
	      
	        prevPosX = posX;
	        prevPosY = posY;
	        prevPosZ = posZ;

	      


	        /* Checks for block collisions */
	        this.doBlockCollisions();

	      
	      /* Checks for collisions with any other vehicles */
	        /**  
	        List<Entity> list = this.world.getEntitiesInAABBexcluding(this, this.getEntityBoundingBox(), entity -> entity instanceof EntityBumperCar);
	        if (!list.isEmpty())
	        {
	            for(Entity entity : list)
	            {
	                this.applyEntityCollision(entity);
	            }
	        } **/
	    }

	@Override
	protected void entityInit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound compound) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound compound) {
		// TODO Auto-generated method stub
		
	}

	

}
