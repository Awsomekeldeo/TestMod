package com.awsome.testmod;

import com.awsome.testmod.creativetabs.TestModTab;
import com.awsome.testmod.init.ModItems;
import com.awsome.testmod.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION, acceptedMinecraftVersions = "[1.11.2]")
public class TestMod {
	
	public static final CreativeTabs TestMod = new TestModTab();
	
	@Instance
	public static TestMod instance;
	
	@SidedProxy(clientSide = References.CLIENTPROXYCLASS, serverSide = References.SERVERPROXYCLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("[Test Mod] Registered Blocks & Items");
		ModItems.init();
		ModItems.register();
		proxy.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		System.out.println("[Test Mod] Added Recipes");
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("[Test Mod] Loaded Dependencies");
	}
}
