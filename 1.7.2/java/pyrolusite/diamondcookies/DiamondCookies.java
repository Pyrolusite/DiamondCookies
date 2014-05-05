package pyrolusite.diamondcookies;

import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
 
@Mod(modid = DiamondCookies.MODID, version = DiamondCookies.VERSION)
public class DiamondCookies
{

    public static final String MODID = "diamondcookies";
    public static final String VERSION = "1.1";
    
    public static ItemFood diamondCookie;
    public static int healthRegenDuration;
   
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());

    	config.load();
    	healthRegenDuration = config.get(Configuration.CATEGORY_GENERAL, "Healing duration (1.25 sec = half an heart of healing, but duration number MUST be integer)", 3).getInt();
    	config.save();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	diamondCookie = new ItemFoodDiamondCookie(healthRegenDuration);
    	GameRegistry.registerItem(diamondCookie, DiamondCookies.MODID + "_" + diamondCookie.getUnlocalizedName().substring(5));
    	GameRegistry.addRecipe(new ItemStack(DiamondCookies.diamondCookie, 8), new Object[] {
	        "CCC",
	        "CDC",
	        "CCC",
	        'C', Items.cookie, 'D', Items.diamond
	    	});
    }
}