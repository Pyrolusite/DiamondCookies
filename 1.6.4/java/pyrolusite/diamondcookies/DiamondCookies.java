package pyrolusite.diamondcookies;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
 
@Mod(modid = DiamondCookies.MODID, version = DiamondCookies.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DiamondCookies
{
    public static final String MODID = "diamondcookies";
    public static final String VERSION = "1.0";
    
    public static ItemFood diamondCookie; public static int diamondCookieID;
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());

    	config.load();
    	diamondCookieID = config.getItem("diamondCookie", 10555).getInt();
    	config.save();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    	diamondCookie = new ItemFoodDiamondCookie();
    	GameRegistry.registerItem(diamondCookie, DiamondCookies.MODID + "_" + diamondCookie.getUnlocalizedName().substring(5));
    	LanguageRegistry.addName(diamondCookie, "Diamond Cookie");
    	
    	GameRegistry.addRecipe(new ItemStack(DiamondCookies.diamondCookie, 8), new Object[] {
	        "CCC",
	        "CDC",
	        "CCC",
	        'C', Item.cookie, 'D', Item.diamond
	    	});
    }
}