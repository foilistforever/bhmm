package bhmm.haakon;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class HAsBlockGenrate implements IWorldGenerator {

	public HAsBlockGenrate() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		
		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, random, chunkX * 1, chunkZ * 1);
			break;
		
		case 0:
			generateSurface(world, random, chunkX * 1, chunkZ * 1);
			break;
			
		case 1:
			generateEnd(world, random, chunkX * 1, chunkZ * 1);
			break;
		}
	}

	private void generateEnd(World world, Random random, int chunkX, int chunkZ) {
		// TODO Auto-generated method stub
		
	}

	private void generateNether(World world, Random random, int chunkX, int chunkZ) {
		// TODO Auto-generated method stub

			
			
			
			
		
		
	}

	private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
		for(int k = 0; k < 10; k++){
			int firstBlockXCoord = chunkX + random.nextInt(16);
			int firstBlockYCoord = random.nextInt();
			int firstBlockZCoord = chunkZ + random.nextInt(16);
		}
			
	}

}
