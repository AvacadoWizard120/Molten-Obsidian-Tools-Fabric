package confusingfool93.moltenobsidiantools.item;

import confusingfool93.moltenobsidiantools.MoltenObsidianTools;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup
{
    public static ItemGroup MOLTEN_OBSIDIAN_TOOLS = Registry.register(Registries.ITEM_GROUP, new Identifier(MoltenObsidianTools.MOD_ID, "molten_obsidian_tools"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.moltenObsidianTools"))
                    .icon(() -> new ItemStack(ModItems.MOLTEN_OBSIDIAN)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MOLTEN_OBSIDIAN);
                        entries.add(ModItems.MOLTEN_OBSIDIAN_AXE);
                        entries.add(ModItems.MOLTEN_OBSIDIAN_HOE);
                        entries.add(ModItems.MOLTEN_OBSIDIAN_SHOVEL);
                        entries.add(ModItems.MOLTEN_OBSIDIAN_PICKAXE);
                        entries.add(ModItems.REINFORCED_MOLTEN_OBSIDIAN);
                        entries.add(ModItems.REINFORCED_OBSIDIAN_AXE);
                        entries.add(ModItems.REINFORCED_OBSIDIAN_HOE);
                        entries.add(ModItems.REINFORCED_OBSIDIAN_SHOVEL);
                        entries.add(ModItems.REINFORCED_OBSIDIAN_PICKAXE);
                    }).build());

    public static void registerItemGroups()
    {

    }
}
