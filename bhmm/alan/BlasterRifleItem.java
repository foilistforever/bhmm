package bhmm.alan;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlasterRifleItem extends Item {

	public BlasterRifleItem(int par1) {
		super(par1);
		
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName("BlasterRifle");
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itmStck, World world,
			EntityPlayer player) {

		if (player.capabilities.isCreativeMode
				|| player.inventory.consumeInventoryItem(Item.redstone.itemID)) {
			world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
			if (!world.isRemote) {
				world.spawnEntityInWorld(new BlasterBoltEntity(world, player));
			}
		}
		return itmStck;
	}

}
