package confusingfool93.moltenobsidiantools.item;

import confusingfool93.moltenobsidiantools.MoltenObsidianTools;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems
{
    public static final Item MOLTEN_OBSIDIAN = registerItem("molten_obsidian",
            new Item(new FabricItemSettings().maxCount(4)));

    public static final Item REINFORCED_MOLTEN_OBSIDIAN = registerItem("reinforced_molten_obsidian",
            new Item(new FabricItemSettings().maxCount(1)));

    public static final Item MOLTEN_OBSIDIAN_PICKAXE = registerItem("molten_obsidian_pickaxe",
            new PickaxeItem(ModToolMaterial.MOlTEN, 4, -1f, new FabricItemSettings()));

    public static final Item MOLTEN_OBSIDIAN_AXE = registerItem("molten_obsidian_axe",
            new AxeItem(ModToolMaterial.MOlTEN, 10, -1f, new FabricItemSettings()));

    public static final Item MOLTEN_OBSIDIAN_SHOVEL = registerItem("molten_obsidian_shovel",
            new ShovelItem(ModToolMaterial.MOlTEN, 3, -1f, new FabricItemSettings()));

    public static final Item MOLTEN_OBSIDIAN_HOE = registerItem("molten_obsidian_hoe",
            new HoeItem(ModToolMaterial.MOlTEN, 2, -1f, new FabricItemSettings()));

    public static final Item REINFORCED_OBSIDIAN_PICKAXE = registerItem("reinforced_obsidian_pickaxe",
            new PickaxeItem(ModToolMaterial.REINFORCED, 4, -1f, new FabricItemSettings()));

    public static final Item REINFORCED_OBSIDIAN_HOE = registerItem("reinforced_obsidian_hoe",
            new HoeItem(ModToolMaterial.REINFORCED, 2, -1f, new FabricItemSettings()));

    public static final Item REINFORCED_OBSIDIAN_SHOVEL = registerItem("reinforced_obsidian_shovel",
            new ShovelItem(ModToolMaterial.REINFORCED, 3, -1f, new FabricItemSettings()));

    public static final Item REINFORCED_OBSIDIAN_AXE = registerItem("reinforced_obsidian_axe",
            new AxeItem(ModToolMaterial.REINFORCED, 10, -1f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(MoltenObsidianTools.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        MoltenObsidianTools.LOGGER.info("Registering the Items for " + MoltenObsidianTools.MOD_ID);
    }
}
