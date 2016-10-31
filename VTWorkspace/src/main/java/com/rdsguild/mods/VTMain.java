package com.rdsguild.mods;

import com.rdsguild.mods.proxies.Common;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fluids.FluidRegistry;

@Mod(modid = Ref.MODID, version = Ref.VERSION, name = Ref.NAME, useMetadata = Ref.METADATA)
public class VTMain
{

    @SidedProxy(clientSide = Ref.CLIENT_SIDE_PROXY, serverSide = Ref.SERVER_SIDE_PROXY)
    public static Common proxy;

    @Mod.Instance(Ref.MODID)
    public static VTMain instance;

    public static org.apache.logging.log4j.Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(Ref.NAME + "Pre Initialization Event Has Started!");
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		    System.out.println(Ref.NAME + "Initialization Event Has Started!");
        //System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println(Ref.NAME + "Post Initialization Event Has Started!");
    }
}
