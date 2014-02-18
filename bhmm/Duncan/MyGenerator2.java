package bhmm.Duncan;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class MyGenerator2 implements IWorldGenerator {

	public MyGenerator2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub

		switch (world.provider.dimensionId){
		case -1:
		
			generateNether(world, random, chunkX * 16, 16,chunkZ * 16);
				break;
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private void generateEnd(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void generateSurface(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void generateNether(World world, Random random, int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}

}
