package com.awsome.testmod.proxy;

import com.awsome.testmod.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
	}
	
}
