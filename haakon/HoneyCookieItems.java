package bhmm.haakon;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HoneyCookieItems extends ItemFood {

	public HoneyCookieItems(int par1, int par2, boolean par3) {
		super(par1, par2, par3);
	init();
	}

	public HoneyCookieItems(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
		init();
	}

	public void init() {
		//super(par1, par2, alwaysEdible);
		// tell the game what tab the item goes on
		setCreativeTab(CreativeTabs.tabFood);
		
		// set max stack size
		setMaxStackSize(64);
		
		// set language independent name
		setUnlocalizedName("HoneyCookieItem");
		
		setTextureName("mysimplemod:HoneyCookie");
		
		
		
    }
}


