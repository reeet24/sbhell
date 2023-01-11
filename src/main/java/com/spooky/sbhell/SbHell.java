package com.spooky.sbhell;

import com.spooky.sbhell.init.BlockInit;
import com.spooky.sbhell.init.EnchantmentInit;
import com.spooky.sbhell.init.ItemInit;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("sbhell")
@Mod.EventBusSubscriber
public class SbHell {

    public static final String MOD_ID = "sbhell";

    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("Sb Hell") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.TELEPORT_STAFF_1.get());
        }
    };

    public static final CreativeModeTab MATERIALS_TAB = new CreativeModeTab("Sb Hell Materials") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.STEEL_INGOT.get());
        }
    };

    public SbHell() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        EnchantmentInit.ENCHANTMENTS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }


}
