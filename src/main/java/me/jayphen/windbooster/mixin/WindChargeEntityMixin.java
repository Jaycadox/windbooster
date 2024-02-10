package me.jayphen.windbooster.mixin;

import net.minecraft.entity.projectile.WindChargeEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(WindChargeEntity.class)
public class WindChargeEntityMixin {
    @ModifyArg(method = "createExplosion", at = @At(value = "INVOKE", target = "net/minecraft/world/World.createExplosion (Lnet/minecraft/entity/Entity;Lnet/minecraft/entity/damage/DamageSource;Lnet/minecraft/world/explosion/ExplosionBehavior;DDDFZLnet/minecraft/world/World$ExplosionSourceType;Lnet/minecraft/particle/ParticleEffect;Lnet/minecraft/particle/ParticleEffect;Lnet/minecraft/registry/entry/RegistryEntry;)Lnet/minecraft/world/explosion/Explosion;"), index = 6)
    private float setPower(float power) {
        return 8.0F;
    }
}


