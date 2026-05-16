package com.ashu.rubysword.item;

import com.ashu.rubysword.MyMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * Central place for defining and registering items.
 */
public final class ModItems {

    /**
     * Ruby Sword stats:
     * - attack damage bonus: +9
     * - attack speed: -2.4
     * - durability from Netherite tool material (2031)
     */
    public static final Item RUBY_SWORD = registerItem(
            "ruby_sword",
            settings -> new RubySwordItem(
                    ToolMaterials.NETHERITE,
                    settings.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 9, -2.4F))
            )
    );

    private ModItems() {
        // Utility class
    }

    /**
     * Registers all mod content.
     */
    public static void registerModItems() {
        // Add Ruby Sword to the Combat creative tab.
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.add(RUBY_SWORD));
        MyMod.LOGGER.info("Registered mod items for {}", MyMod.MOD_ID);
    }

    /**
     * Helper to register an item.
     */
    private static Item registerItem(String name, java.util.function.Function<Item.Settings, Item> factory) {
        Identifier id = Identifier.of(MyMod.MOD_ID, name);
        Item.Settings settings = new Item.Settings();
        Item item = factory.apply(settings);
        return Registry.register(Registries.ITEM, id, item);
    }
}
