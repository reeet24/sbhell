package com.spooky.sbhell.util;

import com.spooky.sbhell.SbHell;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;



@Mod.EventBusSubscriber(modid = SbHell.MOD_ID)
public class EventHandler {
    @SubscribeEvent
    public static void onLivingTick(LivingEvent.LivingTickEvent event) {
        LivingEntity entity = event.getEntityLiving();
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;
            boolean hasFullArmor = player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof ArmorItem &&
                    player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() instanceof ArmorItem &&
                    player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() instanceof ArmorItem &&
                    player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() instanceof ArmorItem;
            if (hasFullArmor) {
                player.setHealth(player.getHealth() + 2.0f); // Change this value to set the amount of health to add
            }
        }
    }
}
