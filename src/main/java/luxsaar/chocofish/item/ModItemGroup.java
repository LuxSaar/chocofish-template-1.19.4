package luxsaar.chocofish.item;

import luxsaar.chocofish.ChocoFish;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup PLASTIC;

    public static void registerItemGroups(){
        PLASTIC = FabricItemGroup.builder(new Identifier(ChocoFish.MOD_ID, "plastic"))
                .displayName(Text.literal("Plastic Item Group"))
                .icon(()->new ItemStack(ModItems.PLASTIC)).build();
    }

}
