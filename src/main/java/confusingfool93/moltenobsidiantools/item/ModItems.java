package confusingfool93.moltenobsidiantools.item;

import confusingfool93.moltenobsidiantools.MoltenObsidianTools;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.List;


public class ModItems
{
    private static final Formatting TITLE_FORMATTING = Formatting.GRAY;
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.BLUE;
    private static final Text MOLTEN_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(MoltenObsidianTools.MOD_ID, "smithing_template.molten_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text MOLTEN_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(MoltenObsidianTools.MOD_ID, "smithing_template.molten_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text MOLTEN_UPGRADE_TEXT= Text.translatable(Util.createTranslationKey("upgrade", new Identifier(MoltenObsidianTools.MOD_ID, "molten_upgrade"))).formatted(TITLE_FORMATTING);
    private static final Text MOLTEN_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(MoltenObsidianTools.MOD_ID, "smithing_template.molten_upgrade.base_slot_description")));
    private static final Text MOLTEN_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(MoltenObsidianTools.MOD_ID, "smithing_template.molten_upgrade.additions_slot_description")));
    private static final Identifier EMPTY_SLOT_PICKAXE_TEXTURE = new Identifier("item/empty_slot_pickaxe");
    private static final Identifier EMPTY_SLOT_AXE_TEXTURE = new Identifier("item/empty_slot_axe");
    private static final Identifier EMPTY_SLOT_HOE_TEXTURE = new Identifier("item/empty_slot_hoe");
    private static final Identifier EMPTY_SLOT_SHOVEL_TEXTURE = new Identifier("item/empty_slot_shovel");
    private static final Identifier EMPTY_SLOT_MOLTEN_TEXTURE = new Identifier(MoltenObsidianTools.MOD_ID, "item/empty_slot_molten");
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

    public static final Item MOLTEN_UPGRADE_TEMPLATE = registerItem("molten_upgrade_template",
            new SmithingTemplateItem(MOLTEN_UPGRADE_APPLIES_TO_TEXT, MOLTEN_UPGRADE_INGREDIENTS_TEXT, MOLTEN_UPGRADE_TEXT, MOLTEN_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, MOLTEN_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getMoltenUpgradeEmptyBaseSlotTextures(), getMoltenUpgradeEmptyAdditionsSlotTextures()));

    private static List<Identifier> getMoltenUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_SLOT_PICKAXE_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE);
    }

    private static List<Identifier> getMoltenUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_MOLTEN_TEXTURE);
    }

    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(MOLTEN_OBSIDIAN);
        entries.add(REINFORCED_MOLTEN_OBSIDIAN);
    }
    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(MOLTEN_OBSIDIAN_PICKAXE);
        entries.add(MOLTEN_OBSIDIAN_AXE);
        entries.add(MOLTEN_OBSIDIAN_SHOVEL);
        entries.add(MOLTEN_OBSIDIAN_HOE);
        entries.add(REINFORCED_OBSIDIAN_PICKAXE);
        entries.add(REINFORCED_OBSIDIAN_AXE);
        entries.add(REINFORCED_OBSIDIAN_SHOVEL);
        entries.add(REINFORCED_OBSIDIAN_HOE);
    }

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(MoltenObsidianTools.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        MoltenObsidianTools.LOGGER.info("Registering the Items for " + MoltenObsidianTools.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
    }


}
