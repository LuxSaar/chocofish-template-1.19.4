package luxsaar.chocofish.data;

import luxsaar.chocofish.block.ModBlocks;
import luxsaar.chocofish.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PLASTIC_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PLASTIC_ORE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_PLASTIC_ORE_BLOCK);

        blockStateModelGenerator.registerLog(ModBlocks.GOLDENWOOD_LOG).log(ModBlocks.GOLDENWOOD_LOG).wood(ModBlocks.GOLDENWOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_GOLDENWOOD_LOG).log(ModBlocks.STRIPPED_GOLDENWOOD_LOG).wood(ModBlocks.STRIPPED_GOLDENWOOD_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GOLDENWOOD_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GOLDENWOOD_LEAVES);

        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.GOLDENWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PLASTIC, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLASTIC_ORE, Models.GENERATED);
    }
}
