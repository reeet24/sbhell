package com.spooky.sbhell.init;

import com.google.common.base.Supplier;

import com.spooky.sbhell.SbHell;
import com.spooky.sbhell.item.*;
import com.spooky.sbhell.spec_armor.FerroArmorAB;
import com.spooky.sbhell.util.ModArmorMaterial;
import com.spooky.sbhell.util.ModItemMaterial;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SbHell.MOD_ID);

    public static final RegistryObject<Item> AMONGUS_TOTEM = register("amongus_totem", () -> new Item(new Item.Properties().tab(SbHell.TUTORIAL_TAB).stacksTo(1).rarity(Rarity.RARE)));
    //All the tiers of charged staffs
    public static final RegistryObject<Item> TELEPORT_STAFF_1 = register("teleport_staff_1", () -> new TeleportStaff1(new Item.Properties().tab(SbHell.TUTORIAL_TAB).stacksTo(1).rarity(Rarity.COMMON).durability(25)));
    public static final RegistryObject<Item> TELEPORT_STAFF_2 = register("teleport_staff_2", () -> new TeleportStaff2(new Item.Properties().tab(SbHell.TUTORIAL_TAB).stacksTo(1).rarity(Rarity.UNCOMMON).durability(50)));
    public static final RegistryObject<Item> TELEPORT_STAFF_3 = register("teleport_staff_3", () -> new TeleportStaff3(new Item.Properties().tab(SbHell.TUTORIAL_TAB).stacksTo(1).rarity(Rarity.RARE).durability(100)));
    public static final RegistryObject<Item> CHARGED_TELEPORT_STAFF_1 = register("charged_teleport_staff_1", () -> new ChargedTeleportStaff1(new Item.Properties().tab(SbHell.TUTORIAL_TAB).stacksTo(1).rarity(Rarity.UNCOMMON).durability(25)));
    public static final RegistryObject<Item> CHARGED_TELEPORT_STAFF_2 = register("charged_teleport_staff_2", () -> new ChargedTeleportStaff2(new Item.Properties().tab(SbHell.TUTORIAL_TAB).stacksTo(1).rarity(Rarity.RARE).durability(50)));
    public static final RegistryObject<Item> CHARGED_TELEPORT_STAFF_3 = register("charged_teleport_staff_3", () -> new ChargedTeleportStaff3(new Item.Properties().tab(SbHell.TUTORIAL_TAB).stacksTo(1).rarity(Rarity.EPIC).durability(100)));
    public static final RegistryObject<Item> CHARGED_CRYSTAL = register("charged_crystal", () -> new Item(new Item.Properties().tab(SbHell.TUTORIAL_TAB).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> CRUSHED_STEEL = register("crushed_steel", () -> new Item(new Item.Properties().tab(SbHell.MATERIALS_TAB)));
    public static final RegistryObject<Item> STEEL_INGOT = register("steel_ingot", () -> new Item(new Item.Properties().tab(SbHell.MATERIALS_TAB)));

    //Steel Tools
    public static final RegistryObject<Item> STEEL_PICKAXE = register("steel_pickaxe",
            () -> new PickaxeItem(ModItemMaterial.STEEL, 4, -1.0F, new Item.Properties().tab(SbHell.TUTORIAL_TAB)));
    public static final RegistryObject<Item> STEEL_SHOVEL = register("steel_shovel",
            () -> new ShovelItem(ModItemMaterial.STEEL, 3, -1.0F, new Item.Properties().tab(SbHell.TUTORIAL_TAB)));
    public static final RegistryObject<Item> STEEL_AXE = register("steel_axe",
            () -> new AxeItem(ModItemMaterial.STEEL, 9, 1.0F, new Item.Properties().tab(SbHell.TUTORIAL_TAB)));
    public static final RegistryObject<Item> STEEL_HOE = register("steel_hoe",
            () -> new HoeItem(ModItemMaterial.STEEL, 5, -1.0F, new Item.Properties().tab(SbHell.TUTORIAL_TAB)));
    public static final RegistryObject<Item> STEEL_SWORD = register("steel_sword",
            () -> new SwordItem(ModItemMaterial.STEEL, 8, -2.0F, new Item.Properties().tab(SbHell.TUTORIAL_TAB)));

    //steel armor
    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlot.HEAD, new Item.Properties().tab(SbHell.TUTORIAL_TAB)));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlot.CHEST, new Item.Properties().tab(SbHell.TUTORIAL_TAB)));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlot.LEGS, new Item.Properties().tab(SbHell.TUTORIAL_TAB)));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlot.FEET, new Item.Properties().tab(SbHell.TUTORIAL_TAB)));

    public static final RegistryObject<Item> TITANIUM_INGOT = register("titanium_ingot", () -> new Item(new Item.Properties().tab(SbHell.MATERIALS_TAB)));
    public static final RegistryObject<Item> FERROTITANIUM_INGOT = register("ferrotitanium_ingot", () -> new Item(new Item.Properties().tab(SbHell.MATERIALS_TAB)));

    //Ferrotitanium Tools
    public static final RegistryObject<Item> FERROTITANIUM_SWORD = register("ferrotitanium_sword",
            () -> new SwordItem(ModItemMaterial.FERROTITANIUM, 9, -2.0F, new Item.Properties().tab(SbHell.TUTORIAL_TAB)));
    public static final RegistryObject<Item> FERROTITANIUM_AXE = register("ferrotitanium_axe",
            () -> new AxeItem(ModItemMaterial.FERROTITANIUM, 10, 1.0F, new Item.Properties().tab(SbHell.TUTORIAL_TAB)));
    public static final RegistryObject<Item> FERROTITANIUM_PICKAXE = register("ferrotitanium_pickaxe",
            () -> new PickaxeItem(ModItemMaterial.FERROTITANIUM, 5, -1.0F, new Item.Properties().tab(SbHell.TUTORIAL_TAB)));
    public static final RegistryObject<Item> FERROTITANIUM_HOE = register("ferrotitanium_hoe",
            () -> new HoeItem(ModItemMaterial.FERROTITANIUM, 6, -1.0F, new Item.Properties().tab(SbHell.TUTORIAL_TAB)));
    public static final RegistryObject<Item> FERROTITANIUM_SHOVEL = register("ferrotitanium_shovel",
            () -> new ShovelItem(ModItemMaterial.FERROTITANIUM, 4, -1.0F, new Item.Properties().tab(SbHell.TUTORIAL_TAB)));

    //Ferrotitanium Armor
    public static final RegistryObject<Item> FERROTITANIUM_HELMET = ITEMS.register("ferrotitanium_helmet",
            () -> new FerroArmorAB(ModArmorMaterial.FERROTITANIUM, EquipmentSlot.HEAD, new Item.Properties().tab(SbHell.TUTORIAL_TAB)));
    public static final RegistryObject<Item> FERROTITANIUM_CHESTPLATE = ITEMS.register("ferrotitanium_chestplate",
            () -> new FerroArmorAB(ModArmorMaterial.FERROTITANIUM, EquipmentSlot.CHEST, new Item.Properties().tab(SbHell.TUTORIAL_TAB)));
    public static final RegistryObject<Item> FERROTITANIUM_LEGGINGS = ITEMS.register("ferrotitanium_leggings",
            () -> new FerroArmorAB(ModArmorMaterial.FERROTITANIUM, EquipmentSlot.LEGS, new Item.Properties().tab(SbHell.TUTORIAL_TAB)));
    public static final RegistryObject<Item> FERROTITANIUM_BOOTS = ITEMS.register("ferrotitanium_boots",
            () -> new FerroArmorAB(ModArmorMaterial.FERROTITANIUM, EquipmentSlot.FEET, new Item.Properties().tab(SbHell.TUTORIAL_TAB)));


    public static final RegistryObject<Item> DIRT_PICKAXE = register("dirt_pickaxe",
            () -> new PickaxeItem(ModItemMaterial.DIRT, 1, -1.0F, new Item.Properties().tab(SbHell.TUTORIAL_TAB)));

    public static final RegistryObject<Item> DIRT_INGOT = register("dirt_ingot", () -> new Item(new Item.Properties().tab(SbHell.MATERIALS_TAB)));


    private static <T extends Item>RegistryObject<T> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name,item);
    }
}
