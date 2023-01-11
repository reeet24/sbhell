package com.spooky.sbhell.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class SmithingHammer extends Item
{

    public SmithingHammer(Properties properties) {super(properties);}


    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }


    public ItemStack getContainerItem(ItemStack itemStack) {
        final ItemStack copy = itemStack.copy();
        return copy;
    }

}
