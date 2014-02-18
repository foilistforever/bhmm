package bhmm.Duncan;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SECRET extends Item {

	public SECRET(int par1) {
		super(par1);
		
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName("SECRET");
	// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World world,
			EntityPlayer player) {
		
		if (player.capabilities.isCreativeMode
		|| player.inventory.consumeInventoryItem(Item.stick.itemID))
		world.playSoundAtEntity(player, "randon.bow" , 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		if (!world.isRemote)
			world.spawnEntityInWorld(new EntityWitherSkull(world, player, 0, 0, 0));
		
		return par1ItemStack;
			
			
			

	}

}
