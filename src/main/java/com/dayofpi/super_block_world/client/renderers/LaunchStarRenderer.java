package com.dayofpi.super_block_world.client.renderers;

import com.dayofpi.super_block_world.Main;
import com.dayofpi.super_block_world.client.models.LaunchStarModel;
import com.dayofpi.super_block_world.client.registry.ModModelLayers;
import com.dayofpi.super_block_world.common.entities.misc.LaunchStarEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3f;

@Environment(EnvType.CLIENT)
public class LaunchStarRenderer<T extends LaunchStarEntity> extends EntityRenderer<T> {
    private final EntityModel<T> model;

    public LaunchStarRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
        this.shadowRadius = 0.5f;
        this.model = new LaunchStarModel<>(ctx.getPart(ModModelLayers.LAUNCH_STAR));
    }
    @Override
    public Identifier getTexture(T entity) {
        return new Identifier(Main.MOD_ID, "textures/entity/launch_star.png");
    }

    protected float getAnimationProgress(T entity, float tickDelta) {
        return (float)(entity).age + tickDelta;
    }

    @Override
    public void render(T entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumerProvider, int light) {
        matrices.push();
        matrices.translate(0.0, -0.5, -1.0);
        matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(entity.getPitch()));
        matrices.scale(-1.0f, -1.0f, 1.0f);
        matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(180.0f - entity.getYaw()));
        this.model.setAngles(entity, tickDelta, 0.0f, this.getAnimationProgress(entity, tickDelta), 0.0f, 0.0f);

        VertexConsumer base = vertexConsumerProvider.getBuffer(this.model.getLayer(getTexture(entity)));
        this.model.render(matrices, base, light, OverlayTexture.DEFAULT_UV, 1.0f, 1.0f, 1.0f, 1.0f);
        matrices.pop();
        super.render(entity, yaw, tickDelta, matrices, vertexConsumerProvider, light);
    }

}
