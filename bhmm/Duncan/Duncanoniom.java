package bhmm.Duncan;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Duncanoniom extends Item {

	public Duncanoniom(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
	setCreativeTab(CreativeTabs.tabBlock); 
	
	// set max stack size
	setMaxStackSize(999);
	
	// set language independent name
	setUnlocalizedName("Duncanoniom");
	
	setTextureName("mysimplemod:DuncansITEM");
}

}



