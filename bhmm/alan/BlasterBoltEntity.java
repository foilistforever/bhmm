package bhmm.alan;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BlasterBoltEntity extends EntityThrowable {

	// explosion radius
	private float explosionRadius = 1.0f;
	
	public BlasterBoltEntity(World par1World) {
		super(par1World);
		// TODO Auto-generated constructor stub
	}

	public BlasterBoltEntity(World par1World,
			EntityLivingBase par2EntityLivingBase) {
		super(par1World, par2EntityLivingBase);
		// TODO Auto-generated constructor stub
	}

	public BlasterBoltEntity(World par1World, double par2, double par4,
			double par6) {
		super(par1World, par2, par4, par6);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onImpact(MovingObjectPosition movingobjectposition) {
		// show an explosion
		this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)this.explosionRadius, true);
		this.setDead();
	}

}
