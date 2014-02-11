package bhmm.haakon;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GreenStoneGround extends Block {

	public GreenStoneGround(int par1, Material par2Material) {
		super(par1, par2Material);
		setHardness(1.0F);
		setStepSound(Block.soundGravelFootstep);
		setUnlocalizedName("GreenStoneGround");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureName("mysimplemod:greenStoneGround");
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
	}

}
