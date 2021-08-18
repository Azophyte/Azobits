package mod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import mod.proxy.CommonProxy;

@Mod(modid = AzoBits.MODID, name = AzoBits.NAME, version = AzoBits.VERSION)
public class AzoBits
{
    public static final String MODID = "azobits";
    public static final String NAME = "AzoBits";
    public static final String VERSION = "0.1";

    private static Logger logger;

    //This was suggested by HarryTalks
    @Instance
    public static AzoBits instance;
    
    @SidedProxy(clientSide = "mod.proxy.ClientProxy", serverSide = "mod.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    //This stuff was already here
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();    
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    /*    for (int i = 0; i == 100; i++) {
        	System.out.println("<Azophyte> You've made a mistake in loading this mod");
        }  
    */}
}
