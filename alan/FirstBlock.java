package bhmm.alan;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class FirstBlock extends Block {

	@SideOnly(Side.CLIENT)
	private Icon[] icons = null;
	
	public FirstBlock(int par1, Material par2Material) {
		super(par1, par2Material);

		setHardness(4.0F);
		setStepSound(Block.soundSnowFootstep);
		setUnlocalizedName("firstblock");
		setCreativeTab(CreativeTabs.tabBlock);
		//setTextureName("mysimplemod:tutorialBlock");
	}

	@Override
	public int idDropped(int par1, Random par2Random, int par3) {

		return MySimpleMod.topaz.itemID;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {

		if (icons == null)
			icons = new Icon[4];

		icons[0] = par1IconRegister.registerIcon("mysimplemod:tutorialBlock");
		icons[1] = par1IconRegister.registerIcon("mysimplemod:tutorialBlock_top");
		icons[2] = par1IconRegister.registerIcon("mysimplemod:tutorialBlock_bottom");
		icons[3] = par1IconRegister.registerIcon("mysimplemod:tutorialBlock_side");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2) {

		switch(par2){
		case 0:
			return icons[0];
		case 1:
		{
			switch(par2) {
			case 0:
				return icons[1];
			case 1:
				return icons[2];
			default:
				return icons[3];
				
			}
		}
		default:
		{
			System.out.print("Invalid metadata for " + this.getUnlocalizedName());
			return icons[0];
		}
		}
	}

}
