package com.spooky.sbhell.util;
import com.spooky.sbhell.init.ItemInit;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;


public enum ModItemMaterial implements Tier {
    STEEL(3, 1024, 14.0F, 0.0F, 30, () -> {
        return Ingredient.of(ItemInit.STEEL_INGOT.get());
    }),

    FERROTITANIUM(4,1561, 18.0f, 0.0f, 40, () ->{
       return Ingredient.of(ItemInit.FERROTITANIUM_INGOT.get());
    }),

    DIRT(10, 1, 75.0F, 0.0F, 1, () -> {
        return Ingredient.of(ItemInit.DIRT_INGOT.get());
    });

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModItemMaterial(int level, int durability, float miningSpeed, float damage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = durability;
        this.speed = miningSpeed;
        this.damage = damage;
        this.enchantmentValue = enchantability;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
