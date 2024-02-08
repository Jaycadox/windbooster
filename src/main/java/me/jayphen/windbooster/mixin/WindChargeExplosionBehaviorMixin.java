package me.jayphen.windbooster.mixin;

import net.minecraft.entity.projectile.WindChargeEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(WindChargeEntity.WindChargeExplosionBehavior.class)
public class WindChargeExplosionBehaviorMixin {

    @Overwrite
    public float getKnockbackModifier() {
        return 2.5F;
    }
}
