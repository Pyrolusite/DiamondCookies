package pyrolusite.diamondcookies;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemFoodDiamondCookie extends ItemFood
{
	public ItemFoodDiamondCookie()
	{
		super(4, false); // par1 = int, hunger points restored ; par2 = bool, saturation
		this.setUnlocalizedName("diamondCookie");
		this.setTextureName(DiamondCookies.MODID + ":" + getUnlocalizedName().substring(5));
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setPotionEffect(Potion.regeneration.id, 2, 1, 1F);
		this.setAlwaysEdible();
	}
}
