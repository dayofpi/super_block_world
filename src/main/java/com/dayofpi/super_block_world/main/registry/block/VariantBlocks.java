package com.dayofpi.super_block_world.main.registry.block;

import com.dayofpi.super_block_world.main.common.block.building.cloud.CloudSlabBlock;
import com.dayofpi.super_block_world.main.common.block.building.cloud.CloudStairsBlock;
import com.dayofpi.super_block_world.main.registry.main.BlockInit;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;

public class VariantBlocks {
    public static final Block CLOUD_SLAB = new CloudSlabBlock(FabricBlockSettings.copyOf(BlockInit.CLOUD_BLOCK));
    public static final Block CLOUD_STAIRS = new CloudStairsBlock(FabricBlockSettings.copyOf(BlockInit.CLOUD_BLOCK));

    public static final Block BRONZE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.BRONZE_BLOCK));
    public static final Block BRONZE_STAIRS = new StairsBlock(BlockInit.BRONZE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.BRONZE_BLOCK)){};

    public static final Block GRITZY_SANDSTONE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.GRITZY_SANDSTONE));
    public static final Block GRITZY_SANDSTONE_STAIRS = new StairsBlock(BlockInit.GRITZY_SANDSTONE.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.GRITZY_SANDSTONE)){};
    public static final Block GRITZY_SANDSTONE_WALL = new WallBlock(FabricBlockSettings.copyOf(BlockInit.GRITZY_SANDSTONE));

    public static final Block AMANITA_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.AMANITA_PLANKS));
    public static final Block AMANITA_STAIRS = new StairsBlock(BlockInit.AMANITA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.AMANITA_PLANKS)){};
    public static final Block AMANITA_FENCE = new FenceBlock(FabricBlockSettings.copyOf(BlockInit.AMANITA_PLANKS));
    public static final Block AMANITA_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.copyOf(BlockInit.AMANITA_PLANKS));

    public static final Block DARK_AMANITA_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.DARK_AMANITA_PLANKS));
    public static final Block DARK_AMANITA_STAIRS = new StairsBlock(BlockInit.DARK_AMANITA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.DARK_AMANITA_PLANKS)){};
    public static final Block DARK_AMANITA_FENCE = new FenceBlock(FabricBlockSettings.copyOf(BlockInit.DARK_AMANITA_PLANKS));
    public static final Block DARK_AMANITA_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.copyOf(BlockInit.DARK_AMANITA_PLANKS));

    public static final Block SEASTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.SEASTONE_BRICKS));
    public static final Block SEASTONE_BRICK_STAIRS = new StairsBlock(BlockInit.SEASTONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.SEASTONE)){};
    public static final Block SEASTONE_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(BlockInit.SEASTONE_BRICKS));

    public static final Block TOADSTONE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.TOADSTONE));
    public static final Block TOADSTONE_STAIRS = new StairsBlock(BlockInit.TOADSTONE.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.TOADSTONE)){};
    public static final Block TOADSTONE_WALL = new WallBlock(FabricBlockSettings.copyOf(BlockInit.TOADSTONE));

    public static final Block TOADSTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.TOADSTONE_BRICKS));
    public static final Block TOADSTONE_BRICK_STAIRS = new StairsBlock(BlockInit.TOADSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.TOADSTONE_BRICKS)){};
    public static final Block TOADSTONE_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(BlockInit.TOADSTONE_BRICKS));

    public static final Block GLOOMSTONE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.GLOOMSTONE));
    public static final Block GLOOMSTONE_STAIRS = new StairsBlock(BlockInit.GLOOMSTONE.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.GLOOMSTONE)){};
    public static final Block GLOOMSTONE_WALL = new WallBlock(FabricBlockSettings.copyOf(BlockInit.GLOOMSTONE));

    public static final Block GLOOMSTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.GLOOMSTONE_BRICKS));
    public static final Block GLOOMSTONE_BRICK_STAIRS = new StairsBlock(BlockInit.GLOOMSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.GLOOMSTONE_BRICKS)){};
    public static final Block GLOOMSTONE_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(BlockInit.GLOOMSTONE_BRICKS));

    public static final Block POLISHED_HARDSTONE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.POLISHED_HARDSTONE));
    public static final Block POLISHED_HARDSTONE_STAIRS = new StairsBlock(BlockInit.POLISHED_HARDSTONE.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.POLISHED_HARDSTONE)){};
    public static final Block POLISHED_HARDSTONE_WALL = new WallBlock(FabricBlockSettings.copyOf(BlockInit.POLISHED_HARDSTONE));

    public static final Block HARDSTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.HARDSTONE_BRICKS));
    public static final Block HARDSTONE_BRICK_STAIRS = new StairsBlock(BlockInit.HARDSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.POLISHED_HARDSTONE)){};
    public static final Block HARDSTONE_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(BlockInit.HARDSTONE_BRICKS));

    public static final Block SHERBET_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.SHERBET_BRICKS));
    public static final Block SHERBET_BRICK_STAIRS = new StairsBlock(BlockInit.SHERBET_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.SHERBET_BRICKS)){};
    public static final Block SHERBET_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(BlockInit.SHERBET_BRICKS));

    public static final Block GOLDEN_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.GOLDEN_BRICKS));
    public static final Block GOLDEN_BRICK_STAIRS = new StairsBlock(BlockInit.GOLDEN_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.GOLDEN_BRICKS)){};
    public static final Block GOLDEN_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(BlockInit.GOLDEN_BRICKS));

    public static final Block CRYSTAL_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.CRYSTAL_BRICKS));
    public static final Block CRYSTAL_BRICK_STAIRS = new StairsBlock(BlockInit.CRYSTAL_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.CRYSTAL_BRICKS)){};
    public static final Block CRYSTAL_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(BlockInit.CRYSTAL_BRICKS));

    public static final Block VANILLATE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.VANILLATE));
    public static final Block VANILLATE_STAIRS = new StairsBlock(BlockInit.VANILLATE.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.VANILLATE)){};

    public static final Block VANILLATE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.VANILLATE_BRICKS));
    public static final Block VANILLATE_BRICK_STAIRS = new StairsBlock(BlockInit.VANILLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.VANILLATE_BRICKS)){};

    public static final Block FROSTY_VANILLATE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.FROSTY_VANILLATE));
    public static final Block FROSTY_VANILLATE_STAIRS = new StairsBlock(BlockInit.FROSTY_VANILLATE.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.FROSTY_VANILLATE)){};

    public static final Block FROSTY_VANILLATE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.FROSTY_VANILLATE_BRICKS));
    public static final Block FROSTY_VANILLATE_BRICK_STAIRS = new StairsBlock(BlockInit.FROSTY_VANILLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.FROSTY_VANILLATE_BRICKS)){};

    public static final Block ROYALITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.ROYALITE_BRICKS));
    public static final Block ROYALITE_BRICK_STAIRS = new StairsBlock(BlockInit.ROYALITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.ROYALITE_BRICKS)){};
    public static final Block ROYALITE_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(BlockInit.ROYALITE_BRICKS));

    public static final Block CERISE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.CERISE_BRICKS));
    public static final Block CERISE_BRICK_STAIRS = new StairsBlock(BlockInit.CERISE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.CERISE_BRICKS)){};

    public static final Block CERISE_TILE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BlockInit.CERISE_TILES));
    public static final Block CERISE_TILE_STAIRS = new StairsBlock(BlockInit.CERISE_TILES.getDefaultState(), FabricBlockSettings.copyOf(BlockInit.CERISE_TILES)){};
}
