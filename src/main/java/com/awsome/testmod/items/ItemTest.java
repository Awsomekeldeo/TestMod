package com.awsome.testmod.items;

import com.awsome.testmod.References;

import net.minecraft.item.Item;

public class ItemTest extends Item {
	
	public ItemTest() {
		setUnlocalizedName(References.TestItems.TEST.getUnlocalizedName());
		setRegistryName(References.TestItems.TEST.getRegistryName());
	}
}
