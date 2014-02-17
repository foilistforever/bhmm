package bhmm.alan;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.MinecraftForge;
import bhmm.dad.CoolItem;
import bhmm.dad.SimpleBlock;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "MySimpleMod", name = "Alan's Simple Mod", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MySimpleMod {

	public final static int BHMM_START_ID = 555;
	private static int idCounter = BHMM_START_ID;

	// Forge wants us to be a singleton
	@Instance(value="MySimpleMod")
	public static MySimpleMod instance;
	
	@SidedProxy(clientSide="bhmm.alan.client.ClientProxy", serverSide="bhmm.alan.CommonProxy")
	public static CommonProxy proxy;
	
	public static Item topaz;
	public static Item coolitem;
	
	public static Block firstBlock;
	public static Block simpleBlock;
	
	public static Item blaster;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		// define our item
		topaz = new GemItems(idCounter++);
		topaz.setUnlocalizedName("topaz");
		
		coolitem = new CoolItem(idCounter++);
		coolitem.setUnlocalizedName("coolitem");
		
		firstBlock = new FirstBlock(idCounter++, Material.rock);
		simpleBlock = new SimpleBlock(idCounter++, Material.snow);
		
		blaster = new BlasterRifleItem(idCounter++);
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
	
		// register the renderers through the proxy
		proxy.registerRenderers();
		
		// set names
		LanguageRegistry.addName(topaz, "Topaz");
		LanguageRegistry.addName(coolitem, "Cool Item");
		
		LanguageRegistry.addName(firstBlock, "First Block");
		MinecraftForge.setBlockHarvestLevel(firstBlock, "pickaxe", 3);
		GameRegistry.registerBlock(firstBlock);

		LanguageRegistry.addName(simpleBlock, "Simple Block");
		MinecraftForge.setBlockHarvestLevel(simpleBlock, "pickaxe", 3);
		GameRegistry.registerBlock(simpleBlock);

		LanguageRegistry.addName(blaster, "Al's Blaster");
		
		
		defineRecipies();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		// nothing to do yet
	}

	public void defineRecipies() {
		
		ItemStack dirtStack = new ItemStack(Block.dirt);
		ItemStack simpleStack = new ItemStack(simpleBlock);
		ItemStack diamondsStack = new ItemStack(Item.diamond, 64);
		ItemStack blackWoolStack = new ItemStack(Block.cloth, 42, 15);
		ItemStack gravelStack = new ItemStack(Block.gravel);
		ItemStack cobbleStack = new ItemStack(Block.cobblestone);

		GameRegistry.addShapelessRecipe(diamondsStack, dirtStack);

		GameRegistry.addShapelessRecipe(diamondsStack, dirtStack,
				dirtStack, dirtStack, dirtStack, dirtStack, dirtStack,
				new ItemStack(Block.sand), gravelStack, cobbleStack);

		GameRegistry.addRecipe(new ItemStack(Block.cobblestone), "xy",
				"yx", 'x', dirtStack, 'y', gravelStack);

		GameRegistry.addRecipe(new ItemStack(Block.stone), "xyx", "y y",
				"xyx", 'x', dirtStack, 'y', gravelStack);

		GameRegistry.addSmelting(Block.stone.blockID, new ItemStack(
				Block.stoneBrick), 0.1f);

		FurnaceRecipes.smelting().addSmelting(Block.cloth.blockID, 15,
				new ItemStack(Block.cloth, 1, 0), 0.1f);
	}

}
