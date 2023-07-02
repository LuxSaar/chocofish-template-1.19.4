package luxsaar.chocofish.data;

import luxsaar.chocofish.block.ModBlocks;
import luxsaar.chocofish.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
public class ModLootTableGenerator extends FabricBlockLootTableProvider{
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //Blocks
        addDrop(ModBlocks.PLASTIC_BLOCK);

        //Ores/BreakableBlocks

    }
}

