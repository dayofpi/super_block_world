package com.dayofpi.super_block_world.main.registry.world.feature.configured;

import com.dayofpi.super_block_world.main.registry.main.BlockInit;
import com.dayofpi.super_block_world.main.registry.block.PlantBlocks;
import com.dayofpi.super_block_world.main.registry.world.feature.FeatureRegistry;
import com.dayofpi.super_block_world.main.registry.world.feature.placed.PlacedPlants;
import com.dayofpi.super_block_world.main.registry.world.feature.utility.BlockLists;
import com.dayofpi.super_block_world.main.registry.world.feature.utility.DataPools;
import com.dayofpi.super_block_world.main.registry.world.feature.utility.PlacementModifiers;
import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.VerticalSurfaceType;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.decorator.BlockFilterPlacementModifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;

import java.util.List;

public class ConfiguredPlants {
    public static final ConfiguredFeature<?, ?> AMANITA_CARPET = FeatureRegistry.AMANITA_CARPET.configure(new GlowLichenFeatureConfig(50, true, true, true, 1.0f, List.of(BlockInit.TOADSTOOL_GRASS, BlockInit.AMANITA_LEAVES, BlockInit.AMANITA_LOG, BlockInit.SHOREGRASS, BlockInit.GRASSY_TOADSTONE, BlockInit.FRUITING_AMANITA_LEAVES)));
    public static final ConfiguredFeature<?, ?> HORSETAIL = Feature.BLOCK_COLUMN.configure(new BlockColumnFeatureConfig((BlockLists.HORSETAIL), Direction.UP, BlockPredicate.IS_AIR, true));
    public static final ConfiguredFeature<?, ?> HORSETAIL_PATCH = Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig(64, 7, 3, () -> HORSETAIL.withPlacement(BlockFilterPlacementModifier.of(BlockPredicate.allOf(BlockPredicate.IS_AIR, BlockPredicate.matchingBlockTag(BlockTags.DIRT, new Vec3i(0, -1, 0)))))));
    public static final ConfiguredFeature<?, ?> STUMP = Feature.BLOCK_COLUMN.configure(new BlockColumnFeatureConfig(List.of(BlockColumnFeatureConfig.createLayer(UniformIntProvider.create(1, 4), BlockStateProvider.of(BlockInit.AMANITA_LOG))), Direction.UP, BlockPredicate.IS_AIR, false));
    public static final ConfiguredFeature<?, ?> STUMP_PATCH = Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig(16, 14, 3, () -> STUMP.withPlacement(BlockFilterPlacementModifier.of(BlockPredicate.allOf(BlockPredicate.IS_AIR, BlockPredicate.hasSturdyFace(new Vec3i(0, -1, 0), Direction.UP))))));
    public static final ConfiguredFeature<?, ?> CACTUS = Feature.BLOCK_COLUMN.configure(new BlockColumnFeatureConfig(List.of(BlockColumnFeatureConfig.createLayer(UniformIntProvider.create(1, 2), BlockStateProvider.of(Blocks.CACTUS))), Direction.UP, BlockPredicate.IS_AIR, false));
    public static final ConfiguredFeature<?, ?> CACTUS_PATCH = Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig(64, 7, 3, () -> PlacedPlants.CACTUS));
    public static final ConfiguredFeature<?, ?> PIT_PLANT = Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(PlantBlocks.PIT_PLANT.getDefaultState())));
    public static final ConfiguredFeature<?, ?> MUNCHER = Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig(32, 7, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(PlantBlocks.MUNCHER.getDefaultState()))).withPlacement(BlockFilterPlacementModifier.of(BlockPredicate.IS_AIR))));
    public static final ConfiguredFeature<?, ?> FROZEN_MUNCHER = Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig(32, 7, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(PlantBlocks.FROZEN_MUNCHER.getDefaultState()))).withPlacement(BlockFilterPlacementModifier.of(BlockPredicate.allOf(BlockPredicate.IS_AIR, BlockPredicate.matchingBlocks(List.of(BlockInit.SNOWY_SHERBET_SOIL, Blocks.ICE), new Vec3i(0, -1, 0)))))));
    public static final ConfiguredFeature<?, ?> FLOWERBED = Feature.VEGETATION_PATCH.configure(new VegetationPatchFeatureConfig(new Identifier("super_block_world:apply_flowerbed_to"), BlockStateProvider.of(BlockInit.TOADSTOOL_GRASS.getDefaultState()), () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(DataPools.FLOWERBED))).withPlacement(), VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0, 5, 0.7F, UniformIntProvider.create(4, 7), 0.3F));
    public static final ConfiguredFeature<?, ?> FUZZBUSH = Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig(16, 1, 1, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(PlantBlocks.FUZZBUSH.getDefaultState()))).withPlacement(BlockFilterPlacementModifier.of(BlockPredicate.bothOf(BlockPredicate.IS_AIR, BlockPredicate.wouldSurvive(PlantBlocks.FUZZBUSH.getDefaultState(), BlockPos.ORIGIN))))));
    public static final ConfiguredFeature<?, ?> PIRANHA_LILY = Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, 7, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(PlantBlocks.PIRANHA_LILY.getDefaultState()))).withPlacement(BlockFilterPlacementModifier.of(BlockPredicate.bothOf(BlockPredicate.IS_AIR, BlockPredicate.wouldSurvive(PlantBlocks.AMANITA_SAPLING.getDefaultState(), BlockPos.ORIGIN))))));
    public static final ConfiguredFeature<?, ?> WATER_PLANTS = Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, 7, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(DataPools.FLOWER_WATER))).withPlacement(BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(Blocks.LILY_PAD.getDefaultState(), Vec3i.ZERO)))));
    public static final ConfiguredFeature<?, ?> GRASSLAND_PLANTS = Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig(40, 7, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(DataPools.PLANT_GRASSLAND))).withPlacement(BlockFilterPlacementModifier.of(BlockPredicate.IS_AIR))));
    public static final ConfiguredFeature<?, ?> GRASSLAND_FLOWERS = Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, 7, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(DataPools.FLOWER_GRASSLAND))).withPlacement(BlockFilterPlacementModifier.of(BlockPredicate.IS_AIR))));
    public static final ConfiguredFeature<?, ?> GRASSLAND_MUSHROOMS = Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig(64, 7, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(DataPools.MUSHROOM_GRASSLAND))).withPlacement(BlockFilterPlacementModifier.of(BlockPredicate.IS_AIR))));
    public static final ConfiguredFeature<?, ?> FOSSIL_FALLS_PLANTS = Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig(40, 7, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(DataPools.PLANT_FOSSIL_FALLS))).withPlacement(BlockFilterPlacementModifier.of(BlockPredicate.IS_AIR))));
    public static final ConfiguredFeature<?, ?> FOSSIL_FALLS_FLOWERS = Feature.FLOWER.configure(new RandomPatchFeatureConfig(90, 5, 1, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(Blocks.CORNFLOWER))).withPlacement(BlockFilterPlacementModifier.of(BlockPredicate.IS_AIR))));
    public static final ConfiguredFeature<?, ?> MUSHROOM_GORGE_PLANTS = Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig(32, 7, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(DataPools.PLANT_MUSHROOM_GORGE))).withPlacement(BlockFilterPlacementModifier.of(BlockPredicate.IS_AIR))));
    public static final ConfiguredFeature<?, ?> MUSHROOM_GORGE_FLOWERS = Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, 7, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(PlantBlocks.PINK_SONGFLOWER))).withPlacement(BlockFilterPlacementModifier.of(BlockPredicate.IS_AIR))));
    public static final ConfiguredFeature<?, ?> REEF_FLOWERS = Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, 7, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(DataPools.FLOWER_CHEEP_CHEEP_REEF))).withPlacement(BlockFilterPlacementModifier.of(BlockPredicate.IS_AIR))));
    public static final ConfiguredFeature<?, ?> AMANITA_FOREST_MUSHROOMS = Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig(64, 7, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(DataPools.MUSHROOM_AMANITA_FOREST))).withPlacement(BlockFilterPlacementModifier.of(BlockPredicate.IS_AIR))));
    public static final ConfiguredFeature<?, ?> FOREST_OF_ILLUSION_FLOWERS = Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, 7, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(DataPools.FLOWER_FOREST_OF_ILLUSION))).withPlacement(BlockFilterPlacementModifier.of(BlockPredicate.IS_AIR))));
    public static final ConfiguredFeature<?, ?> AUTUMN_FOREST_PLANTS = Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig(30, 7, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(DataPools.PLANT_GRASSLAND))).withPlacement(PlacementModifiers.ON_SOIL_AND_LEAVES)));
    public static final ConfiguredFeature<?, ?> AUTUMN_FOREST_MUSHROOMS = Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig(64, 7, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(DataPools.MUSHROOM_AUTUMN_FOREST))).withPlacement(BlockFilterPlacementModifier.of(BlockPredicate.IS_AIR))));
    public static final ConfiguredFeature<?, ?> DESERT_PLANTS = Feature.RANDOM_PATCH.configure(new RandomPatchFeatureConfig(40, 7, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(DataPools.PLANT_DRY_DRY_DESERT))).withPlacement(BlockFilterPlacementModifier.of(BlockPredicate.IS_AIR))));
}


