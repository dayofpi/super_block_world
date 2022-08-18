package com.dayofpi.super_block_world.client.registry;

import com.dayofpi.super_block_world.Main;
import com.dayofpi.super_block_world.client.models.*;
import com.dayofpi.super_block_world.client.renderers.ChinchoTorchRenderer;
import com.dayofpi.super_block_world.client.renderers.FlagRenderer;
import com.dayofpi.super_block_world.client.renderers.SuperPickaxRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.IllagerEntityModel;
import net.minecraft.client.render.entity.model.MinecartEntityModel;
import net.minecraft.util.Identifier;

public class ModModelLayers {

    private static EntityModelLayer createMain(String id) {
        return new EntityModelLayer(new Identifier(Main.MOD_ID, id), "main");
    }

    private static EntityModelLayer create(String id, String name) {
        return new EntityModelLayer(new Identifier(Main.MOD_ID, id), name);
    }
    public static final EntityModelLayer BABY_YOSHI = createMain("baby_yoshi");
    public static final EntityModelLayer BEE_WINGS = createMain("bee_wings");
    public static final EntityModelLayer BLOCKSTEPPER = createMain("blockstepper");
    public static final EntityModelLayer BLOOPER = createMain("blooper");
    public static final EntityModelLayer BOB_OMB = createMain("bob_omb");
    public static final EntityModelLayer BOO = createMain("boo");
    public static final EntityModelLayer BULLET_BILL = createMain("bullet_bill");
    public static final EntityModelLayer BUZZY_BEETLE = createMain("buzzy_beetle");
    public static final EntityModelLayer BUZZY_BEETLE_SADDLE = create("buzzy_beetle", "saddle");
    public static final EntityModelLayer CHEEP_CHEEP = createMain("cheep_cheep");
    public static final EntityModelLayer CHINCHO_TORCH = createMain("chincho_torch");
    public static final EntityModelLayer DINO_RHINO = createMain("dino_rhino");
    public static final EntityModelLayer DRY_BONES = createMain("dry_bones");
    public static final EntityModelLayer DRY_BONES_SHELL = createMain("dry_bones_shell");
    public static final EntityModelLayer FAKE_BLOCK = createMain("fake_block");
    public static final EntityModelLayer FLAG = createMain("flag");
    public static final EntityModelLayer FORAGER = createMain("forager");
    public static final EntityModelLayer FUZZY = createMain("fuzzy");
    public static final EntityModelLayer GO_KART = createMain("go_kart");
    public static final EntityModelLayer GOOMBA = createMain("goomba");
    public static final EntityModelLayer HAMMER_BRO = createMain("hammer_bro");
    public static final EntityModelLayer KING_BOB_OMB = createMain("king_bob_omb");
    public static final EntityModelLayer KING_BOO = createMain("king_boo");
    public static final EntityModelLayer KOOPA_SHELL = createMain("koopa_shell");
    public static final EntityModelLayer KOOPA_TROOPA = createMain("koopa_troopa");
    public static final EntityModelLayer KOOPA_TROOPA_SADDLE = create("koopa_troopa", "saddle");
    public static final EntityModelLayer LAUNCH_STAR = createMain("launch_star");
    public static final EntityModelLayer LAVA_BUBBLE = createMain("lava_bubble");
    public static final EntityModelLayer LAVA_BUBBLE_OUTER = create("lava_bubble", "outer");
    public static final EntityModelLayer LIL_OINK = createMain("lil_oink");
    public static final EntityModelLayer MECHAKOOPA = createMain("mechakoopa");
    public static final EntityModelLayer MECHAKOOPA_MISSILE = createMain("mechakoopa_missile");
    public static final EntityModelLayer MOO_MOO = createMain("moo_moo");
    public static final EntityModelLayer MUD_TROOPER = createMain("mud_trooper");
    public static final EntityModelLayer MUMMY_ME = createMain("mummy_me");
    public static final EntityModelLayer PETEY_PIRANHA = createMain("petey_piranha");
    public static final EntityModelLayer PIRANHA_PLANT = createMain("piranha_plant");
    public static final EntityModelLayer POWER_UP = createMain("power_up");
    public static final EntityModelLayer ROTTEN_MUSHROOM = createMain("rotten_mushroom");
    public static final EntityModelLayer SHY_GUY = createMain("shy_guy");
    public static final EntityModelLayer SLEEPY_SHEEP = createMain("sleepy_sheep");
    public static final EntityModelLayer SPIKE_TOP = createMain("spike_top");
    public static final EntityModelLayer SPINDRIFT = createMain("spindrift");
    public static final EntityModelLayer SPINY = createMain("spiny");
    public static final EntityModelLayer STINGBY = createMain("stingby");
    public static final EntityModelLayer SUPER_PICKAX = createMain("super_pickax");
    public static final EntityModelLayer THWOMP = createMain("thwomp");
    public static final EntityModelLayer TOAD = createMain("toad");
    public static final EntityModelLayer TRAMPOLINE_MINECART = createMain("trampoline_minecart");
    public static final EntityModelLayer UNAGI = createMain("unagi");
    public static final EntityModelLayer YOSHI = createMain("yoshi");

    public static void register() {
        EntityModelLayerRegistry.registerModelLayer(BABY_YOSHI, BabyYoshiModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(BLOCKSTEPPER, BlockstepperModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(BLOOPER, BlooperModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(BOB_OMB, BobOmbModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(BOO, BooModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(BULLET_BILL, BulletBillModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(BUZZY_BEETLE, BuzzyBeetleModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(BUZZY_BEETLE_SADDLE, BuzzyBeetleModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(CHEEP_CHEEP, CheepCheepModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(CHINCHO_TORCH, ChinchoTorchRenderer::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(DINO_RHINO, DinoRhinoModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(DRY_BONES, DryBonesModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(DRY_BONES_SHELL, DryBonesShellModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(FAKE_BLOCK, FakeBlockModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(FLAG, FlagRenderer::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(FORAGER, IllagerEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(FUZZY, FuzzyModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(GO_KART, GoKartModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(GOOMBA, GoombaModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(HAMMER_BRO, HammerBroModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(KING_BOB_OMB, KingBobOmbModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(KING_BOO, KingBooModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(KOOPA_SHELL, KoopaShellModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(KOOPA_TROOPA, KoopaTroopaModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(KOOPA_TROOPA_SADDLE, KoopaTroopaModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(LAUNCH_STAR, LaunchStarModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(LAVA_BUBBLE, LavaBubbleModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(LAVA_BUBBLE_OUTER, LavaBubbleModel::getOuterTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(LIL_OINK, LilOinkModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MECHAKOOPA, MechakoopaModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MECHAKOOPA_MISSILE, MechakoopaMissileModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MOO_MOO, MooMooModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MUD_TROOPER, MudTrooperModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MUMMY_ME, MummyMeModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(PETEY_PIRANHA, PeteyPiranhaModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(PIRANHA_PLANT, PiranhaPlantModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(POWER_UP, PowerUpModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(BEE_WINGS, PowerUpModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(ROTTEN_MUSHROOM, RottenMushroomModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(SHY_GUY, ShyGuyModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(SLEEPY_SHEEP, SleepySheepModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(SPIKE_TOP, BuzzyBeetleModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(SPINDRIFT, SpindriftModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(SPINY, SpinyModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(STINGBY, StingbyModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(SUPER_PICKAX, SuperPickaxRenderer::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(THWOMP, ThwompModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(TOAD, ToadModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(TRAMPOLINE_MINECART, MinecartEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(UNAGI, UnagiModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(YOSHI, YoshiModel::getTexturedModelData);
    }
}