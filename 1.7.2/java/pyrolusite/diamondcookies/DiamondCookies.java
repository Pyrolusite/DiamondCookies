package pyrolusite.diamondcookies;

import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
 
@Mod(modid = DiamondCookies.MODID, version = DiamondCookies.VERSION)
public class DiamondCookies
{

    public static final String MODID = "diamondcookies";
    public static final String VERSION = "1.0";
    
    public static ItemFood diamondCookie;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	
    	diamondCookie = new ItemFoodDiamondCookie();
    	GameRegistry.registerItem(diamondCookie, DiamondCookies.MODID + "_" + diamondCookie.getUnlocalizedName().substring(5));
    	GameRegistry.addRecipe(new ItemStack(DiamondCookies.diamondCookie, 8), new Object[] {
	        "CCC",
	        "CDC",
	        "CCC",
	        'C', Items.cookie, 'D', Items.diamond
	    	});
    }
}