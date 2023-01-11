package com.spooky.sbhell.init;

import com.spooky.sbhell.SbHell;
import com.spooky.sbhell.enchants.AdvancedSharpness;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EnchantmentInit {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, SbHell.MOD_ID);

    public static final RegistryObject<Enchantment> ADV_SHARPNESS = ENCHANTMENTS.register("advanced_sharpness",
            () -> new AdvancedSharpness(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON, EquipmentSlot.values()));
}
