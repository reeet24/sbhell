package com.spooky.sbhell.enchants;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class AdvancedSharpness extends Enchantment {
    public AdvancedSharpness(Rarity rarity, EnchantmentCategory enchantType, EquipmentSlot[] slotType) {
        super(rarity, enchantType, slotType);
    }


    @Override
    public void doPostAttack(LivingEntity attacker, Entity target, int level) {
        float lvl = level;
        target.hurt(new DamageSource("Advanced Sharpness"), (float) (lvl + 1));
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

}
