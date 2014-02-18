package bhmm.alan;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GemItems extends Item {

	public GemItems(int par1) {
		super(par1);
		// tell the game what tab the item goes on
		setCreativeTab(CreativeTabs.tabMaterials);
		
		// set max stack size
		setMaxStackSize(64);
		
		// set language independent name
		setUnlocalizedName("topaz");
		
		setTextureName("mysimplemod:topaz");
	}

}
