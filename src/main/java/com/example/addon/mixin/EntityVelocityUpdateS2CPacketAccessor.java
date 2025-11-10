package com.example.addon.mixin;

import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import com.example.addon.mixin.EntityVelocityUpdateS2CPacketAccessor;

@Mixin(EntityVelocityUpdateS2CPacket.class)
public class VelocityMixin {

    @Inject(method = "<init>", at = @At("RETURN"))
    private void modifyVelocity(EntityVelocityUpdateS2CPacket packet, CallbackInfo ci) {
        // Supondo que h e v são multiplicadores definidos em algum lugar do módulo
        double h = 1.0; // exemplo, substitua pelo seu valor real
        double v = 1.0; // exemplo, substitua pelo seu valor real

        // Cast para Accessor para poder usar getters e setters
        EntityVelocityUpdateS2CPacketAccessor accessor = (EntityVelocityUpdateS2CPacketAccessor) packet;

        accessor.setVelocityX((int) Math.round(accessor.getVelocityX() * h));
        accessor.setVelocityY((int) Math.round(accessor.getVelocityY() * v));
        accessor.setVelocityZ((int) Math.round(accessor.getVelocityZ() * h));
    }
}
