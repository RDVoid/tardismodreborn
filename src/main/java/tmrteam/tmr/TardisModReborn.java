package tmrteam.tmr;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tmrteam.tmr.core.item.ModItemGroups;
import tmrteam.tmr.core.item.ModItems;

public class TardisModReborn implements ModInitializer {
	public static final String MOD_ID = "tardismodreborn" ;
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
	}
}