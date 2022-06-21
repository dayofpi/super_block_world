package com.dayofpi.super_block_world.audio;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

public class SoundGroups {
    public static final BlockSoundGroup BELL_CAP;
    public static final BlockSoundGroup ICY_SOIL;
    public static final BlockSoundGroup ICY_STONE;
    public static final BlockSoundGroup TOADSTONE;

    static {
        BELL_CAP = new BlockSoundGroup(1.0F, 1.0F, SoundEvents.BLOCK_AZALEA_LEAVES_BREAK, Sounds.BLOCK_BELL_CAP_STEP, SoundEvents.BLOCK_AZALEA_LEAVES_PLACE, Sounds.BLOCK_BELL_CAP_HIT, Sounds.BLOCK_BELL_CAP_FALL);
        ICY_SOIL = new BlockSoundGroup(1.0F, 1.0F, Sounds.BLOCK_ICY_SOIL_BREAK, Sounds.BLOCK_ICY_SOIL_STEP, Sounds.BLOCK_ICY_SOIL_PLACE, Sounds.BLOCK_ICY_SOIL_HIT, Sounds.BLOCK_ICY_SOIL_FALL);
        ICY_STONE = new BlockSoundGroup(1.0F, 1.0F, Sounds.BLOCK_ICY_STONE_BREAK, Sounds.BLOCK_ICY_STONE_STEP, Sounds.BLOCK_ICY_STONE_PLACE, Sounds.BLOCK_ICY_STONE_HIT, Sounds.BLOCK_ICY_STONE_FALL);
        TOADSTONE = new BlockSoundGroup(1.0F, 1.0F, Sounds.BLOCK_TOADSTONE_BREAK, Sounds.BLOCK_TOADSTONE_STEP, Sounds.BLOCK_TOADSTONE_PLACE, Sounds.BLOCK_TOADSTONE_HIT, Sounds.BLOCK_TOADSTONE_FALL);
    }
}
