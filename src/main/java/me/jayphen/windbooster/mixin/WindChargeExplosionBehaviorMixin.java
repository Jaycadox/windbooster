package me.jayphen.windbooster.mixin;

import net.minecraft.entity.projectile.WindChargeEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(WindChargeEntity.WindChargeExplosionBehavior.class)
public class WindChargeExplosionBehaviorMixin {

    @ModifyConstant(method = "getKnockbackModifier", constant = @Constant(floatValue = 1.1F))
    private float changeKnockback(float value) {
        return 2.5F;
    }
}
