package com.dayofpi.super_block_world.client.models;

import com.dayofpi.super_block_world.Main;
import com.dayofpi.super_block_world.common.entities.boss.KingBooEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

@Environment(EnvType.CLIENT)
public class KingBooModel<T extends KingBooEntity> extends AnimatedGeoModel<T> {
    @Override
    public Identifier getModelResource(T entity) {
        return new Identifier(Main.MOD_ID, "geo/king_boo.geo.json");
    }

    @Override
    public Identifier getTextureResource(T entity) {
        if (entity.isWeakened())
            return new Identifier(Main.MOD_ID, "textures/entity/king_boo/weakened.png");
        return new Identifier(Main.MOD_ID, "textures/entity/king_boo/king_boo.png");
    }

    @Override
    public Identifier getAnimationResource(T entity) {
        return new Identifier(Main.MOD_ID, "animations/king_boo.animation.json");
    }
}
