package mca.items;

import java.util.List;

import mca.core.MCA;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemNewOutfit extends Item
{
	public ItemNewOutfit()
	{
		super();
		
		this.setUnlocalizedName("NewOutfit");
		GameRegistry.registerItem(this, "NewOutfit");
		this.setCreativeTab(MCA.getCreativeTabMain());
		this.setMaxStackSize(1);
		this.setMaxDamage(16);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean unknown) 
	{
		list.add("Use on your spouse or children ");
		list.add("to change their outfit.");
	}
}
