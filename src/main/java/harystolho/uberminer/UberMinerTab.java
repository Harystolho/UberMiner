package harystolho.uberminer;

import harystolho.uberminer.init.BlockInit;
import harystolho.uberminer.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class UberMinerTab extends CreativeTabs {

	public UberMinerTab(String name) { super("uberminer");}
	public ItemStack getTabIconItem() { return new ItemStack(BlockInit.BLOCK_UBER_TABLE);}

}
