package confusingfool93.moltenobsidiantools.item;

import confusingfool93.moltenobsidiantools.MoltenObsidianTools;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup
{
    public static ItemGroup MOLDTEN_OBSIDIAN_TOOLS;

    public static void registerItemGroups()
    {
        MOLDTEN_OBSIDIAN_TOOLS = FabricItemGroup.builder(new Identifier(MoltenObsidianTools.MOD_ID, "molten_obsidian_tools"))
                .displayName(Text.translatable("itemgroup.moltenObsidianTools"))
                .icon(() -> new ItemStack(ModItems.MOLTEN_OBSIDIAN)).build();
    }
}
