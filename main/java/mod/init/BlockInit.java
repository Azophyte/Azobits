package mod.init;

import java.util.List;
import java.util.ArrayList;

import mod.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SUMMONING_STONE = new BlockBase("summoning_stone", Material.ROCK);
}
