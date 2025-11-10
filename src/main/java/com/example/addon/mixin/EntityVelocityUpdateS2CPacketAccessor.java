package com.example.addon.mixin;

import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(EntityVelocityUpdateS2CPacket.class)
public interface EntityVelocityUpdateS2CPacketAccessor {

    // Setters — para modificar os valores da velocidade
    @Accessor("velocityX")
    void setVelocityX(int x);

    @Accessor("velocityY")
    void setVelocityY(int y);

    @Accessor("velocityZ")
    void setVelocityZ(int z);

    // Getters — para ler os valores da velocidade
    @Accessor("velocityX")
    int getVelocityX();

    @Accessor("velocityY")
    int getVelocityY();

    @Accessor("velocityZ")
    int getVelocityZ();
}
