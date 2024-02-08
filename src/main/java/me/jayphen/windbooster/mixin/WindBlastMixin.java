package me.jayphen.windbooster.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.FlyingItemEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.projectile.AbstractWindChargeEntity;
import net.minecraft.entity.projectile.WindChargeEntity;
import net.minecraft.item.WindChargeItem;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.Inject;

@Mixin(WindChargeEntity.class)
public class WindBlastMixin {

    @Overwrite
    public void createExplosion() {
        var _this = (WindChargeEntity)((Object)this);
        _this.getWorld().createExplosion(_this, (DamageSource)null, new WindChargeEntity.WindChargeExplosionBehavior(), _this.getX(), _this.getY(), _this.getZ(), 8.0F, false, World.ExplosionSourceType.BLOW, ParticleTypes.GUST_EMITTER_SMALL, ParticleTypes.GUST_EMITTER_LARGE, SoundEvents.ENTITY_WIND_CHARGE_WIND_BURST);
    }
}


