package tmrteam.tmr.core.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import tmrteam.tmr.TardisModReborn;

public class ModItemGroups {
    public static final ItemGroup SONIC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TardisModReborn.MOD_ID, "sonic"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sonic"))
                    .icon(() -> new ItemStack(ModItems.SONIC)) .entries((displayContext, enteries) -> enteries.add(ModItems.SONIC)).build());


    public static void registerItemGroups(){
        TardisModReborn.LOGGER.info("Registering Item Groups For" + TardisModReborn.MOD_ID);
    }
}
