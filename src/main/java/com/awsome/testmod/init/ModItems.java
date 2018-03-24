package com.awsome.testmod.init;

import com.awsome.testmod.TestMod;
import com.awsome.testmod.items.ItemTest;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemTest testitem;
	
	public static void init() {
		testitem = new ItemTest();
	}
	
	public static void register() {
		testitem.setCreativeTab(TestMod.TestMod);
		GameRegistry.register(testitem);
	}

	public static void registerRenders(){
		registerRender(testitem);
	}
	
	public static void registerRender(Item item){
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
