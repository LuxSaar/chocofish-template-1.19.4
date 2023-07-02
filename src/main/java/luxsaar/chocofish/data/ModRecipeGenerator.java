package luxsaar.chocofish.data;

import luxsaar.chocofish.block.ModBlocks;
import luxsaar.chocofish.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.PLASTIC_ORE), RecipeCategory.MISC, ModItems.PLASTIC,
                0.7f,100,"plastic");
        offerBlasting(exporter, List.of(ModItems.PLASTIC_ORE), RecipeCategory.MISC, ModItems.PLASTIC,
                0.7f,20,"plastic");
    }
}
