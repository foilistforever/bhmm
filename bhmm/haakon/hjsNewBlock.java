package bhmm.haakon;

import java.util.Random;

import bhmm.alan.MySimpleMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class hjsNewBlock extends Block {

	public hjsNewBlock(int par1, Material par2Material) {
		super(par1, par2Material);
		// TODO Auto-generated constructor stub
		
		setHardness(2.0F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("hjsNewBlock");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureName("mysimplemod:firstblock");
		
	
	}

	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return MySimpleMod.honeyCookieItems.itemID;
	}

}
