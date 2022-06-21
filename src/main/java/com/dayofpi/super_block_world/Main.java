package com.dayofpi.super_block_world;

import com.dayofpi.super_block_world.audio.Sounds;
import com.dayofpi.super_block_world.common.entities.effects.StarPowerEffect;
import com.dayofpi.super_block_world.registry.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class Main implements ModInitializer {
    public static final String MOD_ID = "super_block_world";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier(MOD_ID, "general")).icon(() -> new ItemStack(ModBlocks.QUESTION_BLOCK)).build();
    public static final StatusEffect STAR_POWER = new StarPowerEffect().addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, UUID.randomUUID().toString(), 0.3D, EntityAttributeModifier.Operation.MULTIPLY_TOTAL).addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, UUID.randomUUID().toString(), 3.0, EntityAttributeModifier.Operation.ADDITION);

    @Override
    public void onInitialize() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Main.MOD_ID, "star_power"), STAR_POWER);
        Sounds.initSounds();
        ModParticles.register();
        ModEntities.register();
        ModFluids.register();
        ModBlocks.register();
        ModBlockEntities.register();
        ModItems.register();
        ModTags.register();
        WorldInit.initialize();
        ModCriteria.register();
        DispenserBehaviors.register();
        LOGGER.info("Mod initialized");
    }
}
