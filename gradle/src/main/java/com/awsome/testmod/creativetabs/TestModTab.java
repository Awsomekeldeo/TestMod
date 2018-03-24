package com.awsome.testmod.creativetabs;

import com.awsome.testmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TestModTab extends CreativeTabs {

	public TestModTab() {
		super("testmodtab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.testitem);
	}
	
}
