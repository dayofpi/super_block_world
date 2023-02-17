package com.dayofpi.super_block_world.audio;

import com.dayofpi.super_block_world.Main;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class Sounds {
    public static final SoundEvent AMBIENT_CAVE = registerSound("ambient.cave");
    public static final SoundEvent BLOCK_BELL_CAP_FALL = registerSound("block.bell_cap.fall");
    public static final SoundEvent BLOCK_BELL_CAP_HIT = registerSound("block.bell_cap.hit");
    public static final SoundEvent BLOCK_BELL_CAP_JINGLE = registerSound("block.bell_cap.jingle");
    public static final SoundEvent BLOCK_BELL_CAP_STEP = registerSound("block.bell_cap.step");
    public static final SoundEvent BLOCK_BOO_LANTERN_HIDE = registerSound("block.boo_lantern.hide");
    public static final SoundEvent BLOCK_BOO_LANTERN_REVEAL = registerSound("block.boo_lantern.reveal");
    public static final SoundEvent BLOCK_BOWSER_LOCK_OPEN = registerSound("block.bowser_lock.open");
    public static final SoundEvent BLOCK_DARK_PORTAL_TRAVEL = registerSound("block.dark_portal.travel");
    public static final SoundEvent BLOCK_DASH_BLOCK_ACTIVATE = registerSound("block.dash_block.activate");
    public static final SoundEvent BLOCK_DONUT_BLOCK_TRIGGER = registerSound("block.donut_block.trigger");
    public static final SoundEvent BLOCK_EMPTY_BLOCK_STORE = registerSound("block.empty_block.store");
    public static final SoundEvent BLOCK_GRASSY_TOADSTONE_BREAK = registerSound("block.grassy_toadstone.break");
    public static final SoundEvent BLOCK_GRASSY_TOADSTONE_FALL = registerSound("block.grassy_toadstone.fall");
    public static final SoundEvent BLOCK_GRASSY_TOADSTONE_HIT = registerSound("block.grassy_toadstone.hit");
    public static final SoundEvent BLOCK_GRASSY_TOADSTONE_PLACE = registerSound("block.grassy_toadstone.place");
    public static final SoundEvent BLOCK_GRASSY_TOADSTONE_STEP = registerSound("block.grassy_toadstone.step");
    public static final SoundEvent BLOCK_ICY_SOIL_BREAK = registerSound("block.icy_soil.break");
    public static final SoundEvent BLOCK_ICY_SOIL_FALL = registerSound("block.icy_soil.fall");
    public static final SoundEvent BLOCK_ICY_SOIL_HIT = registerSound("block.icy_soil.hit");
    public static final SoundEvent BLOCK_ICY_SOIL_PLACE = registerSound("block.icy_soil.place");
    public static final SoundEvent BLOCK_ICY_SOIL_STEP = registerSound("block.icy_soil.step");
    public static final SoundEvent BLOCK_ICY_STONE_BREAK = registerSound("block.icy_stone.break");
    public static final SoundEvent BLOCK_ICY_STONE_FALL = registerSound("block.icy_stone.fall");
    public static final SoundEvent BLOCK_ICY_STONE_HIT = registerSound("block.icy_stone.hit");
    public static final SoundEvent BLOCK_ICY_STONE_PLACE = registerSound("block.icy_stone.place");
    public static final SoundEvent BLOCK_ICY_STONE_STEP = registerSound("block.icy_stone.step");
    public static final SoundEvent BLOCK_JELLYBEAM_ELECTROCUTE = registerSound("block.jellybeam.damage");
    public static final SoundEvent BLOCK_MUSHROOM_BLOCK_BOUNCE = registerSound("block.mushroom_block.bounce");
    public static final SoundEvent BLOCK_ON_OFF_SWITCH = registerSound("block.on_off_switch.activate");
    public static final SoundEvent BLOCK_POISON_BUBBLE = registerSound("block.poison.bubble");
    public static final SoundEvent BLOCK_PORTAL_TRAVEL = registerSound("block.portal.travel");
    public static final SoundEvent BLOCK_PORTAL_TRIGGER = registerSound("block.portal.trigger");
    public static final SoundEvent BLOCK_POWER_STAR_AMBIENT = registerSound("block.power_star.ambient");
    public static final SoundEvent BLOCK_POW_BLOCK_ACTIVATE = registerSound("block.pow_block.activate");
    public static final SoundEvent BLOCK_PROPELLER_BLOCK_RISE = registerSound("block.propeller_block.rise");
    public static final SoundEvent BLOCK_PULL_BLOCK_PULL = registerSound("block.pull_block.pull");
    public static final SoundEvent BLOCK_P_SWITCH_CLICK = registerSound("block.p_switch.click");
    public static final SoundEvent BLOCK_P_SWITCH_OFF = registerSound("block.p_switch.off");
    public static final SoundEvent BLOCK_P_SWITCH_ON = registerSound("block.p_switch.on");
    public static final SoundEvent BLOCK_QUESTION_BLOCK_ACTIVATE = registerSound("block.question_block.activate");
    public static final SoundEvent BLOCK_QUESTION_BOX_SPAWN = registerSound("block.question_box.spawn");
    public static final SoundEvent BLOCK_SHOREGRASS_BREAK = registerSound("block.shoregrass.break");
    public static final SoundEvent BLOCK_SHOREGRASS_FALL = registerSound("block.shoregrass.fall");
    public static final SoundEvent BLOCK_SHOREGRASS_HIT = registerSound("block.shoregrass.hit");
    public static final SoundEvent BLOCK_SHOREGRASS_PLACE = registerSound("block.shoregrass.place");
    public static final SoundEvent BLOCK_SHOREGRASS_STEP = registerSound("block.shoregrass.step");
    public static final SoundEvent BLOCK_SPIKE_TRAP_EXTEND = registerSound("block.spike_trap.extend");
    public static final SoundEvent BLOCK_SPIKE_TRAP_RETRACT = registerSound("block.spike_trap.retract");
    public static final SoundEvent BLOCK_STONE_TORCH_AMBIENT = registerSound("block.stone_torch.ambient");
    public static final SoundEvent BLOCK_TOADSTONE_BREAK = registerSound("block.toadstone.break");
    public static final SoundEvent BLOCK_TOADSTONE_FALL = registerSound("block.toadstone.fall");
    public static final SoundEvent BLOCK_TOADSTONE_HIT = registerSound("block.toadstone.hit");
    public static final SoundEvent BLOCK_TOADSTONE_PLACE = registerSound("block.toadstone.place");
    public static final SoundEvent BLOCK_TOADSTONE_STEP = registerSound("block.toadstone.step");
    public static final SoundEvent BLOCK_TRAMPOLINE_RELEASE = registerSound("block.trampoline.release");
    public static final SoundEvent BLOCK_WARP_PIPE_TELEPORT = registerSound("block.warp_pipe.teleport");
    public static final SoundEvent BLOCK_YOSHI_EGG_HATCH = registerSound("block.yoshi_egg.hatch");
    public static final SoundEvent BLOCK_ZTAR_AMBIENT = registerSound("block.ztar.ambient");
    public static final SoundEvent ENTITY_BIG_GOOMBA_DEATH = registerSound("entity.big_goomba.death");
    public static final SoundEvent ENTITY_BIG_GOOMBA_HURT = registerSound("entity.big_goomba.hurt");
    public static final SoundEvent ENTITY_BIG_GOOMBA_STEP = registerSound("entity.big_goomba.step");
    public static final SoundEvent ENTITY_BLOCKSTEPPER_ALARM = registerSound("entity.blockstepper.alarm");
    public static final SoundEvent ENTITY_BLOCKSTEPPER_DEATH = registerSound("entity.blockstepper.death");
    public static final SoundEvent ENTITY_BLOCKSTEPPER_HURT = registerSound("entity.blockstepper.hurt");
    public static final SoundEvent ENTITY_BLOCKSTEPPER_MARCH = registerSound("entity.blockstepper.march");
    public static final SoundEvent ENTITY_BLOCKSTEPPER_PANIC = registerSound("entity.blockstepper.angry");
    public static final SoundEvent ENTITY_BLOCKSTEPPER_STEP = registerSound("entity.blockstepper.step");
    public static final SoundEvent ENTITY_BLOOPER_FLOP = registerSound("entity.blooper.flop");
    public static final SoundEvent ENTITY_BOB_OMB_AMBIENT = registerSound("entity.bob_omb.ambient");
    public static final SoundEvent ENTITY_BOB_OMB_DEATH = registerSound("entity.bob_omb.death");
    public static final SoundEvent ENTITY_BOB_OMB_FUSE = registerSound("entity.bob_omb.fuse");
    public static final SoundEvent ENTITY_BOB_OMB_HURT = registerSound("entity.bob_omb.hurt");
    public static final SoundEvent ENTITY_BOB_OMB_STEP = registerSound("entity.bob_omb.step");
    public static final SoundEvent ENTITY_BOO_AMBIENT = registerSound("entity.boo.ambient");
    public static final SoundEvent ENTITY_BOO_ATTACK = registerSound("entity.boo.attack");
    public static final SoundEvent ENTITY_BOO_DEATH = registerSound("entity.boo.death");
    public static final SoundEvent ENTITY_BOO_HURT = registerSound("entity.boo.hurt");
    public static final SoundEvent ENTITY_BOO_SHY = registerSound("entity.boo.shy");
    public static final SoundEvent ENTITY_BOO_STEAL = registerSound("entity.boo.steal");
    public static final SoundEvent ENTITY_BULLET_BILL_HURT = registerSound("entity.bullet_bill.hurt");
    public static final SoundEvent ENTITY_BULLET_FIRE = registerSound("entity.bullet.fire");
    public static final SoundEvent ENTITY_BULLET_IMPACT = registerSound("entity.bullet.impact");
    public static final SoundEvent ENTITY_BUZZY_BEETLE_DEFLECT = registerSound("entity.buzzy_beetle.deflect");
    public static final SoundEvent ENTITY_BUZZY_BEETLE_IMPACT = registerSound("entity.buzzy_beetle.impact");
    public static final SoundEvent ENTITY_CHEEP_CHEEP_DEATH = registerSound("entity.cheep_cheep.death");
    public static final SoundEvent ENTITY_CHEEP_CHEEP_FLOP = registerSound("entity.cheep_cheep.flop");
    public static final SoundEvent ENTITY_CHEEP_CHEEP_HURT = registerSound("entity.cheep_cheep.hurt");
    public static final SoundEvent ENTITY_DARK_GOOMBA_AMBIENT = registerSound("entity.dark_goomba.ambient");
    public static final SoundEvent ENTITY_DARK_GOOMBA_DEATH = registerSound("entity.dark_goomba.death");
    public static final SoundEvent ENTITY_DARK_GOOMBA_HURT = registerSound("entity.dark_goomba.hurt");
    public static final SoundEvent ENTITY_DINO_RHINO_AMBIENT = registerSound("entity.dino_rhino.ambient");
    public static final SoundEvent ENTITY_DINO_RHINO_DEATH = registerSound("entity.dino_rhino.death");
    public static final SoundEvent ENTITY_DINO_RHINO_HURT = registerSound("entity.dino_rhino.hurt");
    public static final SoundEvent ENTITY_DRY_BONES_DEATH = registerSound("entity.dry_bones.death");
    public static final SoundEvent ENTITY_DRY_BONES_HURT = registerSound("entity.dry_bones.hurt");
    public static final SoundEvent ENTITY_DRY_BONES_WAKE = registerSound("entity.dry_bones.wake");
    public static final SoundEvent ENTITY_FIREBALL_BOUNCE = registerSound("entity.fireball.bounce");
    public static final SoundEvent ENTITY_FIREBALL_HIT = registerSound("entity.fireball.hit");
    public static final SoundEvent ENTITY_FORAGER_CAST_SPELL = registerSound("entity.forager.cast_spell");
    public static final SoundEvent ENTITY_FUZZY_BREAK_ITEM = registerSound("entity.fuzzy.break_item");
    public static final SoundEvent ENTITY_GENERIC_EAT = registerSound("entity.generic.eat");
    public static final SoundEvent ENTITY_GENERIC_FLUTTER = registerSound("entity.generic.flutter");
    public static final SoundEvent ENTITY_GENERIC_FLUTTER_BEE = registerSound("entity.generic.flutter_bee");
    public static final SoundEvent ENTITY_GENERIC_FLUTTER_TANOOKI = registerSound("entity.generic.flutter_tanooki");
    public static final SoundEvent ENTITY_GENERIC_JUMP = registerSound("entity.generic.jump");
    public static final SoundEvent ENTITY_GENERIC_JUMP_ATTACK = registerSound("entity.generic.jump_attack");
    public static final SoundEvent ENTITY_GENERIC_JUMP_BOUNCE = registerSound("entity.generic.jump_bounce");
    public static final SoundEvent ENTITY_GENERIC_POWER_DOWN = registerSound("entity.generic.power_down");
    public static final SoundEvent ENTITY_GENERIC_POWER_UP = registerSound("entity.generic.power_up");
    public static final SoundEvent ENTITY_GENERIC_PREPARE_SPELL = registerSound("entity.generic.prepare_spell");
    public static final SoundEvent ENTITY_GENERIC_SPOT = registerSound("entity.generic.spot");
    public static final SoundEvent ENTITY_GENERIC_TAIL_ATTACK = registerSound("entity.generic.tail_attack");
    public static final SoundEvent ENTITY_GENERIC_TRANSFORM = registerSound("entity.generic.transform");
    public static final SoundEvent ENTITY_GOOMBA_AMBIENT = registerSound("entity.goomba.ambient");
    public static final SoundEvent ENTITY_GOOMBA_DEATH = registerSound("entity.goomba.death");
    public static final SoundEvent ENTITY_GOOMBA_HURT = registerSound("entity.goomba.hurt");
    public static final SoundEvent ENTITY_GOOMBA_STEP = registerSound("entity.goomba.step");
    public static final SoundEvent ENTITY_GO_KART_HORN = registerSound("entity.go_kart.horn");
    public static final SoundEvent ENTITY_GO_KART_LOOP = registerSound("entity.go_kart.loop");
    public static final SoundEvent ENTITY_GO_KART_LOOP_UNDERWATER = registerSound("entity.go_kart.loop_underwater");
    public static final SoundEvent ENTITY_HAMMER_BRO_DEATH = registerSound("entity.hammer_bro.death");
    public static final SoundEvent ENTITY_HAMMER_BRO_HURT = registerSound("entity.hammer_bro.hurt");
    public static final SoundEvent ENTITY_ICEBALL_BOUNCE = registerSound("entity.iceball.bounce");
    public static final SoundEvent ENTITY_ICEBALL_FREEZE = registerSound("entity.iceball.freeze");
    public static final SoundEvent ENTITY_ICEBALL_HIT = registerSound("entity.iceball.hit");
    public static final SoundEvent ENTITY_KING_BOB_OMB_DEATH = registerSound("entity.king_bob_omb.death");
    public static final SoundEvent ENTITY_KING_BOB_OMB_HURT = registerSound("entity.king_bob_omb.hurt");
    public static final SoundEvent ENTITY_KING_BOB_OMB_STEP = registerSound("entity.king_bob_omb.step");
    public static final SoundEvent ENTITY_KING_BOB_OMB_THROW = registerSound("entity.king_bob_omb.throw");
    public static final SoundEvent ENTITY_KING_BOO_AMBIENT = registerSound("entity.king_boo.ambient");
    public static final SoundEvent ENTITY_KING_BOO_CHARGE = registerSound("entity.king_boo.charge");
    public static final SoundEvent ENTITY_KING_BOO_CURSE = registerSound("entity.king_boo.curse");
    public static final SoundEvent ENTITY_KING_BOO_DEATH = registerSound("entity.king_boo.death");
    public static final SoundEvent ENTITY_KING_BOO_HURT = registerSound("entity.king_boo.hurt");
    public static final SoundEvent ENTITY_KING_BOO_THUNDER = registerSound("entity.king_boo.thunder");
    public static final SoundEvent ENTITY_KING_BOO_THUNDER_STRIKE = registerSound("entity.king_boo.thunder_strike");
    public static final SoundEvent ENTITY_KING_BOO_UNLEASH = registerSound("entity.king_boo.unleash");
    public static final SoundEvent ENTITY_KING_BOO_WEAKENED = registerSound("entity.king_boo.weakened");
    public static final SoundEvent ENTITY_KOOPA_TROOPA_AMBIENT = registerSound("entity.koopa_troopa.ambient");
    public static final SoundEvent ENTITY_KOOPA_TROOPA_DEATH = registerSound("entity.koopa_troopa.death");
    public static final SoundEvent ENTITY_KOOPA_TROOPA_HURT = registerSound("entity.koopa_troopa.hurt");
    public static final SoundEvent ENTITY_LAUNCH_STAR_AMBIENT = registerSound("entity.launch_star.ambient");
    public static final SoundEvent ENTITY_LAUNCH_STAR_PLACE = registerSound("entity.launch_star.place");
    public static final SoundEvent ENTITY_LAUNCH_STAR_USE = registerSound("entity.launch_star.use");
    public static final SoundEvent ENTITY_LAVA_BUBBLE_DEATH = registerSound("entity.lava_bubble.death");
    public static final SoundEvent ENTITY_LAVA_BUBBLE_HURT = registerSound("entity.lava_bubble.hurt");
    public static final SoundEvent ENTITY_LAVA_BUBBLE_JUMP = registerSound("entity.lava_bubble.jump");
    public static final SoundEvent ENTITY_MAGIKOOPA_AMBIENT = registerSound("entity.magikoopa.ambient");
    public static final SoundEvent ENTITY_MAGIKOOPA_DEATH = registerSound("entity.magikoopa.death");
    public static final SoundEvent ENTITY_MAGIKOOPA_HURT = registerSound("entity.magikoopa.hurt");
    public static final SoundEvent ENTITY_MAILTOAD_RESTOCK = registerSound("entity.mailtoad.restock");
    public static final SoundEvent ENTITY_MECHAKOOPA_CHARGE = registerSound("entity.mechakoopa.charge");
    public static final SoundEvent ENTITY_MECHAKOOPA_DEATH = registerSound("entity.mechakoopa.death");
    public static final SoundEvent ENTITY_MECHAKOOPA_HURT = registerSound("entity.mechakoopa.hurt");
    public static final SoundEvent ENTITY_MECHAKOOPA_STEP = registerSound("entity.mechakoopa.step");
    public static final SoundEvent ENTITY_MECHAKOOPA_ZAP = registerSound("entity.mechakoopa.zap");
    public static final SoundEvent ENTITY_MINI_GOOMBA_DEATH = registerSound("entity.mini_goomba.death");
    public static final SoundEvent ENTITY_MINI_GOOMBA_STEP = registerSound("entity.mini_goomba.step");
    public static final SoundEvent ENTITY_MOO_MOO_BELL = registerSound("entity.moo_moo.bell");
    public static final SoundEvent ENTITY_MUD_TROOPER_AMBIENT = registerSound("entity.mud_trooper.ambient");
    public static final SoundEvent ENTITY_MUD_TROOPER_DEATH = registerSound("entity.mud_trooper.death");
    public static final SoundEvent ENTITY_MUD_TROOPER_HURT = registerSound("entity.mud_trooper.hurt");
    public static final SoundEvent ENTITY_MUMMY_ME_AMBIENT = registerSound("entity.mummy_me.ambient");
    public static final SoundEvent ENTITY_MUMMY_ME_DEATH = registerSound("entity.mummy_me.death");
    public static final SoundEvent ENTITY_MUMMY_ME_HURT = registerSound("entity.mummy_me.hurt");
    public static final SoundEvent ENTITY_MUMMY_ME_MAGIC = registerSound("entity.mummy_me.magic");
    public static final SoundEvent ENTITY_MUMMY_ME_MUMMIFY = registerSound("entity.mummy_me.mummify");
    public static final SoundEvent ENTITY_PETEY_PIRANHA_AMBIENT = registerSound("entity.petey_piranha.ambient");
    public static final SoundEvent ENTITY_PETEY_PIRANHA_ATTACK = registerSound("entity.petey_piranha.attack");
    public static final SoundEvent ENTITY_PETEY_PIRANHA_DEATH = registerSound("entity.petey_piranha.death");
    public static final SoundEvent ENTITY_PETEY_PIRANHA_HURT = registerSound("entity.petey_piranha.hurt");
    public static final SoundEvent ENTITY_PETEY_PIRANHA_SPIN = registerSound("entity.petey_piranha.spin");
    public static final SoundEvent ENTITY_PETEY_PIRANHA_SPIT = registerSound("entity.petey_piranha.spit");
    public static final SoundEvent ENTITY_PETEY_PIRANHA_STEP = registerSound("entity.petey_piranha.step");
    public static final SoundEvent ENTITY_PETEY_PIRANHA_STOCKPILE = registerSound("entity.petey_piranha.stockpile");
    public static final SoundEvent ENTITY_PIRANHA_PLANT_ATTACK = registerSound("entity.piranha_plant.attack");
    public static final SoundEvent ENTITY_PIRANHA_PLANT_BITE = registerSound("entity.piranha_plant.bite");
    public static final SoundEvent ENTITY_PIRANHA_PLANT_DEATH = registerSound("entity.piranha_plant.death");
    public static final SoundEvent ENTITY_PIRANHA_PLANT_HURT = registerSound("entity.piranha_plant.hurt");
    public static final SoundEvent ENTITY_PIRANHA_PLANT_POISON = registerSound("entity.piranha_plant.poison");
    public static final SoundEvent ENTITY_PIRANHA_PLANT_SLEEP = registerSound("entity.piranha_plant.sleep");
    public static final SoundEvent ENTITY_PROJECTILE_HIT = registerSound("entity.projectile.hit");
    public static final SoundEvent ENTITY_PUTRID_PIRANHA_SLEEP = registerSound("entity.putrid_piranha.sleep");
    public static final SoundEvent ENTITY_SHELL_HIT = registerSound("entity.shell.hit");
    public static final SoundEvent ENTITY_SHY_GUY_AMBIENT = registerSound("entity.shy_guy.ambient");
    public static final SoundEvent ENTITY_SHY_GUY_DEATH = registerSound("entity.shy_guy.death");
    public static final SoundEvent ENTITY_SHY_GUY_HURT = registerSound("entity.shy_guy.hurt");
    public static final SoundEvent ENTITY_SPINDRIFT_DEATH = registerSound("entity.spindrift.death");
    public static final SoundEvent ENTITY_SPINY_DEATH = registerSound("entity.spiny.death");
    public static final SoundEvent ENTITY_SPINY_HURT = registerSound("entity.spiny.hurt");
    public static final SoundEvent ENTITY_STAMP_BREAK = registerSound("entity.stamp.break");
    public static final SoundEvent ENTITY_STAMP_PLACE = registerSound("entity.stamp.place");
    public static final SoundEvent ENTITY_STINGBY_AMBIENT = registerSound("entity.stingby.ambient");
    public static final SoundEvent ENTITY_STINGBY_DEATH = registerSound("entity.stingby.death");
    public static final SoundEvent ENTITY_STINGBY_HURT = registerSound("entity.stingby.hurt");
    public static final SoundEvent ENTITY_THWOMP_DEATH = registerSound("entity.thwomp.death");
    public static final SoundEvent ENTITY_THWOMP_FALL = registerSound("entity.thwomp.fall");
    public static final SoundEvent ENTITY_THWOMP_HURT = registerSound("entity.thwomp.hurt");
    public static final SoundEvent ENTITY_THWOMP_LAND = registerSound("entity.thwomp.land");
    public static final SoundEvent ENTITY_THWOMP_REST = registerSound("entity.thwomp.rest");
    public static final SoundEvent ENTITY_TOADETTE_AMBIENT = registerSound("entity.toadette.ambient");
    public static final SoundEvent ENTITY_TOADETTE_CHEER = registerSound("entity.toadette.cheer");
    public static final SoundEvent ENTITY_TOADETTE_DEATH = registerSound("entity.toadette.death");
    public static final SoundEvent ENTITY_TOADETTE_HURT = registerSound("entity.toadette.hurt");
    public static final SoundEvent ENTITY_TOAD_AMBIENT = registerSound("entity.toad.ambient");
    public static final SoundEvent ENTITY_TOAD_CHEER = registerSound("entity.toad.cheer");
    public static final SoundEvent ENTITY_TOAD_DEATH = registerSound("entity.toad.death");
    public static final SoundEvent ENTITY_TOAD_HURT = registerSound("entity.toad.hurt");
    public static final SoundEvent ENTITY_UNAGI_DEATH = registerSound("entity.unagi.death");
    public static final SoundEvent ENTITY_UNAGI_FLOP = registerSound("entity.unagi.flop");
    public static final SoundEvent ENTITY_YOSHI_AMBIENT = registerSound("entity.yoshi.ambient");
    public static final SoundEvent ENTITY_YOSHI_DEATH = registerSound("entity.yoshi.death");
    public static final SoundEvent ENTITY_YOSHI_EAT = registerSound("entity.yoshi.eat");
    public static final SoundEvent ENTITY_YOSHI_FLUTTER = registerSound("entity.yoshi.flutter");
    public static final SoundEvent ENTITY_YOSHI_HURT = registerSound("entity.yoshi.hurt");
    public static final SoundEvent ENTITY_YOSHI_MOUNT = registerSound("entity.yoshi.mount");
    public static final SoundEvent ENTITY_YOSHI_REACH = registerSound("entity.yoshi.reach");
    public static final SoundEvent ENTITY_YOSHI_SPIT = registerSound("entity.yoshi.spit");
    public static final SoundEvent ENTITY_YOSHI_STEP = registerSound("entity.yoshi.step");
    public static final SoundEvent ENTITY_YOSHI_SWALLOW = registerSound("entity.yoshi.swallow");
    public static final SoundEvent ITEM_BOOMERANG_FLOWER = registerSound("item.boomerang_flower.shoot");
    public static final SoundEvent ITEM_COIN = registerSound("item.coin.pickup");
    public static final SoundEvent ITEM_FIRE_FLOWER = registerSound("item.fire_flower.shoot");
    public static final SoundEvent ITEM_HAMMER = registerSound("item.hammer.throw");
    public static final SoundEvent ITEM_ICE_FLOWER = registerSound("item.ice_flower.shoot");
    public static final SoundEvent ITEM_LIFE_MUSHROOM = registerSound("item.life_mushroom.use");
    public static final SoundEvent ITEM_MAGIC_WAND = registerSound("item.magic_wand.use");
    public static final SoundEvent ITEM_ONE_UP = registerSound("item.one_up.eat");
    public static final SoundEvent ITEM_POISON_MUSHROOM = registerSound("item.poison_mushroom.eat");
    public static final SoundEvent ITEM_STAR_BIT = registerSound("item.star_bit.pickup");
    public static final SoundEvent ITEM_STAR_COIN = registerSound("item.star_coin.pickup");
    public static final SoundEvent ITEM_SUPER_HEART = registerSound("item.super_heart.heal");
    public static final SoundEvent ITEM_SUPER_MUSHROOM = registerSound("item.super_mushroom.eat");
    public static final SoundEvent ITEM_THROW = registerSound("item.generic.throw");
    public static final SoundEvent ITEM_WARP_LINK_BREAK = registerSound("item.warp_link.break");
    public static final SoundEvent ITEM_WARP_LINK_END = registerSound("item.warp_link.end");
    public static final SoundEvent ITEM_WARP_LINK_RESET = registerSound("item.warp_link.reset");
    public static final SoundEvent ITEM_WARP_LINK_START = registerSound("item.warp_link.start");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_AMANITA_FOREST = registerReference("music.forest");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_BOSS_1 = registerReference("music.boss.1");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_BOSS_2 = registerReference("music.boss.2");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_CAVE = registerReference("music.cave");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DAYTIME = registerReference("music.day");
    public static final SoundEvent MUSIC_DISC_MY_SONG = registerSound("music.disc.my_song");
    public static final SoundEvent MUSIC_DISC_TOXICITY = registerSound("music.disc.toxicity");
    public static final SoundEvent MUSIC_DISC_TRAPPED = registerSound("music.disc.trapped");
    public static final SoundEvent MUSIC_DISC_WALTZ_OF_THE_LOST = registerSound("music.disc.waltz_of_the_lost");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_GHOST_HOUSE = registerReference("music.ghost_house");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_LAVA = registerReference("music.lava");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_NIGHTTIME = registerReference("music.night");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_STARMAN = registerReference("music.starman");
    public static final SoundEvent MUSIC_STARMAN_LEAD = registerSound("music.starman_lead");
    public static final SoundEvent MUSIC_WATER = registerSound("music.water");
    public static final RegistryEntry.Reference<SoundEvent> NOTE_BLOCK_BLING = registerReference("block.note_block.bling");
    public static final RegistryEntry.Reference<SoundEvent> NOTE_BLOCK_BLOCK = registerReference("block.note_block.block");
    public static final RegistryEntry.Reference<SoundEvent> NOTE_BLOCK_CHOIR = registerReference("block.note_block.choir");
    public static final RegistryEntry.Reference<SoundEvent> NOTE_BLOCK_DINODRUM = registerReference("block.note_block.dinodrum");
    public static final RegistryEntry.Reference<SoundEvent> NOTE_BLOCK_PAN_FLUTE = registerReference("block.note_block.pan_flute");

    private static RegistryEntry.Reference<SoundEvent> registerReference(String id) {
        return Sounds.registerReference(new Identifier(id));
    }

    private static RegistryEntry.Reference<SoundEvent> registerReference(Identifier id) {
        return Sounds.registerReference(id, id);
    }

    private static RegistryEntry.Reference<SoundEvent> registerReference(Identifier id, Identifier soundId) {
        return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(soundId));
    }

    private static SoundEvent registerSound(String string) {
        Identifier id = new Identifier(Main.MOD_ID, string);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}
