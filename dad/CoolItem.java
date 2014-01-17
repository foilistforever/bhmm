package bhmm.dad;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CoolItem extends Item {

	public CoolItem(int par1) {
		super(par1);
		
		setCreativeTab(CreativeTabs.tabTools);
		
		// set max stack size
		setMaxStackSize(64);
		
		// set language independent name
		setUnlocalizedName("coolitem");
		
		setTextureName("mysimplemod:coolitem");
}

}
