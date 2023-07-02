package luxsaar.chocofish.block;

import luxsaar.chocofish.ChocoFish;
import luxsaar.chocofish.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
//Plastic
    public static final Block PLASTIC_BLOCK = registerBlock("plastic_block",
            new Block(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(4.0f).requiresTool()), ModItemGroup.PLASTIC);

    public static final Block PLASTIC_ORE_BLOCK = registerBlock("plastic_ore_block",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(1,1)), ModItemGroup.PLASTIC);
    public static final Block DEEPSLATE_PLASTIC_ORE_BLOCK = registerBlock("deepslate_plastic_ore_block",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(1,1)), ModItemGroup.PLASTIC);
//Goldenwood
    public static final Block GOLDENWOOD_LOG = registerBlock("goldenwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.PLASTIC);
    public static final Block GOLDENWOOD_WOOD = registerBlock("goldenwood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.PLASTIC);
    public static final Block STRIPPED_GOLDENWOOD_LOG = registerBlock("stripped_goldenwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.PLASTIC);
    public static final Block STRIPPED_GOLDENWOOD_WOOD = registerBlock("stripped_goldenwood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.PLASTIC);

    public static final Block GOLDENWOOD_PLANKS = registerBlock("goldenwood_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ModItemGroup.PLASTIC);
    public static final Block GOLDENWOOD_LEAVES = registerBlock("goldenwood_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()), ModItemGroup.PLASTIC);

    public static final Block GOLDENWOOD_SAPLING = registerBlock("goldenwood_sapling",
            new SaplingBlock(null,FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()), ModItemGroup.PLASTIC);

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
