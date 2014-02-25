package bhmm.haakon;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GreenStone extends Item {

	public GreenStone(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub

		// tell the game what tab the item goes on
		setCreativeTab(CreativeTabs.tabRedstone);
		
		// set max stack size
		setMaxStackSize(64);
		
		// set language independent name
		setUnlocalizedName("GreenStone");
		
		setTextureName("mysimplemod:stickyixcf");
	}

}
