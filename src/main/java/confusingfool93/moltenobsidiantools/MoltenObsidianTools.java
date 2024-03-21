package confusingfool93.moltenobsidiantools;

import confusingfool93.moltenobsidiantools.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoltenObsidianTools implements ModInitializer {

	public static final String MOD_ID = "moltenobsidiantools";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItems.registerModItems();
	}
}