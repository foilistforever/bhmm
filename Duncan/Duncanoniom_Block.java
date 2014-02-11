package bhmm.Duncan;

import java.util.Random;

import bhmm.alan.MySimpleMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Duncanoniom_Block extends Block {

	public Duncanoniom_Block(int par1, Material par2Material) {
		super(par1, par2Material);
		setHardness(4.0F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("Duncanoniom_Block");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureName("mysimplemod:BLOCK");
		// TODO Auto-generated constructor stub
	}

	@Override
	public int quantityDropped(Random par1Random) {
return 64;
		
	}

	@Override
	public int quantityDroppedWithBonus(int par1, Random par2Random) {
		// TODO Auto-generated method stub
		return super.quantityDroppedWithBonus(par1, par2Random);
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
		// TODO Auto-generated method stub
		return super.quantityDropped(meta, fortune, random);
	}

	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
	return MySimpleMod.DuncansITEM.itemID;
	}


}
