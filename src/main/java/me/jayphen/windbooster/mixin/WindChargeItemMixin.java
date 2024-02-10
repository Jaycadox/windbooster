package me.jayphen.windbooster.mixin;

import net.minecraft.item.WindChargeItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(WindChargeItem.class)
public class WindChargeItemMixin {
    @ModifyArg(method = "use", at = @At(value = "INVOKE", target = "net/minecraft/entity/player/ItemCooldownManager.set (Lnet/minecraft/item/Item;I)V"), index = 1)
    public int use(int cooldown) {
        return 0;
    }
}
