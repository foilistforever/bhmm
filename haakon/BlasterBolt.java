package bhmm.haakon;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BlasterBolt extends EntityThrowable {
	
	private float explosionRadius = 0.3f;

	public BlasterBolt(World par1World) {
		super(par1World);
		// TODO Auto-generated constructor stub
	}

	public BlasterBolt(World par1World, EntityLivingBase par2EntityLivingBase) {
		super(par1World, par2EntityLivingBase);
		// TODO Auto-generated constructor stub
	}

	public BlasterBolt(World par1World, double par2, double par4, double par6) {
		super(par1World, par2, par4, par6);
		// TODO Auto-generated constructor stub
	}
	
	//public void init(){
		//this.on
	//}

	@Override
	protected void onImpact(MovingObjectPosition movingobjectposition) {
		this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float) this.explosionRadius, true);
		this.setDead();
	}

	@Override
	public EntityItem dropItem(int par1, int par2) {
		
		return new EntityItem(this.worldObj, this.posX, this.posY, this.posZ, new ItemStack(Item.redstone));
	}

}
