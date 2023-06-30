package luxsaar.chocofish.block;

import luxsaar.chocofish.ChocoFish;
import luxsaar.chocofish.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block PLASTIC_BLOCK = registerBlock("plastic_block",
            new Block(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(4.0f).requiresTool()), ModItemGroup.PLASTIC);

    public static final Block PLASTIC_ORE_BLOCK = registerBlock("plastic_ore_block",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(1,1)), ModItemGroup.PLASTIC);
    public static final Block DEEPSLATE_PLASTIC_ORE_BLOCK = registerBlock("deepslate_plastic_ore_block",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(1,1)), ModItemGroup.PLASTIC);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
            return Registry.register(Registries.BLOCK, new Identifier(ChocoFish.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        Item item = Registry.register(Registries.ITEM, new Identifier(ChocoFish.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    public static void registerModBlocks(){
        ChocoFish.LOGGER.info("Registering ModBlocks for "+ ChocoFish.MOD_ID);
    }

}
