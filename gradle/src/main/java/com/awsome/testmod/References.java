package com.awsome.testmod;

public class References {
	public static final String MODID = "testmod";
	public static final String NAME = "Test Mod";
	public static final String VERSION = "0.1-dev";
	
	public static final String CLIENTPROXYCLASS = "com.awsome.testmod.proxy.ClientProxy";
	public static final String SERVERPROXYCLASS = "com.awsome.testmod.proxy.ServerProxy";
	
	public static enum TestItems {
		TEST("testitem", "itemtest");
		
		private String unlocalizedName;
		private String registryName;
		TestItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
