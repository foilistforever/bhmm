package bhmm.dad;

import java.util.Random;

import bhmm.alan.MySimpleMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class SimpleBlock extends Block {

	@SideOnly(Side.CLIENT)
	private Icon[] icons = null;
	
	@SideOnly(Side.CLIENT)
	private Icon topTexture = null;
	
	public SimpleBlock(int par1, Material par2Material) {
		super(par1, par2Material);

		setHardness(4.0F);
		setStepSound(Block.soundSnowFootstep);
		setUnlocalizedName("simpleblock");
		setCreativeTab(CreativeTabs.tabBlock);
		//setTextureName("mysimplemod:simpleBlock");
	}

	@Override
	public int idDropped(int par1, Random par2Random, int par3) {

		return MySimpleMod.topaz.itemID;
	}

	@Override
	public int quantityDropped(Random par1Random) {
		// TODO Auto-generated method stub
		return 4;
	}


	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {

		if (side == 0 || side == 1){
			return this.topTexture;
		}
		else
			return this.blockIcon;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon("mysimplemod:simpleBlock");
		this.topTexture = reg.registerIcon("mysimplemod:tutorialBlock_top");
	}


}
