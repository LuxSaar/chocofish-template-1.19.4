package luxsaar.chocofish.item;

import luxsaar.chocofish.ChocoFish;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PLASTIC = registerItem("plastic",
            new Item(new FabricItemSettings()));
    public static final Item PLASTIC_ORE = registerItem("plastic_ore",
            new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ChocoFish.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup(){
        addToItemGroup(ItemGroups.INGREDIENTS, PLASTIC);
        addToItemGroup(ItemGroups.INGREDIENTS, PLASTIC_ORE);

        addToItemGroup(ModItemGroup.PLASTIC, PLASTIC);
        addToItemGroup(ModItemGroup.PLASTIC, PLASTIC_ORE);
    }

    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }


    public static void registerModItems(){
        ChocoFish.LOGGER.info("Registering Mod items for "+ ChocoFish.MOD_ID);
        addItemsToItemGroup();
    }

}
