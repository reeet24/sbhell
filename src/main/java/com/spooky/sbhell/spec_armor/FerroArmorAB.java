package com.spooky.sbhell.spec_armor;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.*;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import com.spooky.sbhell.init.ItemInit;

public class FerroArmorAB extends ArmorItem {
    public FerroArmorAB(ArmorMaterial material, EquipmentSlot slot, Properties properties) {
        super(material, slot, properties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if (!world.isClientSide()){
            boolean fullSet = player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ItemInit.FERROTITANIUM_HELMET.get() && (player.getItemBySlot(EquipmentSlot.CHEST).getItem() == ItemInit.FERROTITANIUM_CHESTPLATE.get()) && (player.getItemBySlot(EquipmentSlot.LEGS).getItem() == ItemInit.FERROTITANIUM_LEGGINGS.get()) && (player.getItemBySlot(EquipmentSlot.FEET).getItem() == ItemInit.FERROTITANIUM_BOOTS.get());
            if (fullSet){
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200));
            }

        }
    }
}