package bhmm.haakon;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class NewBlaster extends Item {

	public NewBlaster(int par1) {
		super(par1);
		
		setCreativeTab(CreativeTabs.tabCombat);
		
		
		setMaxStackSize(1);
		
		
		setUnlocalizedName("NewBlaster");
		
		setTextureName("mysimplemod:BLASTER");
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
		
		if (par3EntityPlayer.capabilities.isCreativeMode
				|| par3EntityPlayer.inventory.consumeInventoryItem(Item.redstone.itemID)){
			par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5f, 0.4f / (itemRand.nextFloat() * 0.4f + 0.8f));
			if (!par2World.isRemote) {
				par2World.spawnEntityInWorld(new EntityArrow(par2World, par3EntityPlayer, 10));
			}
		}
		return par1ItemStack;
	}
		
}


