package pyrolusite.diamondcookies;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemFoodDiamondCookie extends ItemFood
{
	public ItemFoodDiamondCookie(int regenDuration)
	{
		// par1 = int, hunger points restored ; par2 = bool, saturation
		super(4, false);
		this.setUnlocalizedName("diamondCookie");
		this.setTextureName(DiamondCookies.MODID + ":" + getUnlocalizedName().substring(5));
		this.setCreativeTab(CreativeTabs.tabFood);
		// par1 = potion id, par2 = int, duration, par3 = int, amplifier (buff level), par4 = float, probablilty
		this.setPotionEffect(Potion.regeneration.id, regenDuration, 1, 1F);
		this.setAlwaysEdible();
	}
}
