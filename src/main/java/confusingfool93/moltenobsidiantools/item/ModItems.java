package confusingfool93.moltenobsidiantools.item;

import confusingfool93.moltenobsidiantools.MoltenObsidianTools;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems
{
    public static final Item MOLTEN_OBSIDIAN = registerItem("molten_obsidian",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(MoltenObsidianTools.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup()
    {
        addToItemGroup(ItemGroups.INGREDIENTS, MOLTEN_OBSIDIAN);

        addToItemGroup(ModItemGroup.MOLDTEN_OBSIDIAN_TOOLS, MOLTEN_OBSIDIAN);
    }

    private static void addToItemGroup(ItemGroup group, Item item)
    {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems()
    {
        MoltenObsidianTools.LOGGER.info("Registering the Items for " + MoltenObsidianTools.MOD_ID);

        addItemsToItemGroup();
    }
}
