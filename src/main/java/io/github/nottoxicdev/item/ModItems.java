package io.github.nottoxicdev.item;

import io.github.nottoxicdev.ToolsMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ASTRAL_ALLOY = registerItem("astral_alloy",
            new Item(new FabricItemSettings().group(ToolsMod.ITEM_GROUP)));

    public static final Item ASTRAL_DIAMOND = registerItem("astral_diamond",
            new Item(new FabricItemSettings().group(ToolsMod.ITEM_GROUP)));

    public static final Item ASTRAL_IRON = registerItem("astral_iron",
            new Item(new FabricItemSettings().group(ToolsMod.ITEM_GROUP)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ToolsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ToolsMod.LOGGER.info("Registering Mod Items for " + ToolsMod.MOD_ID);
    }
}
