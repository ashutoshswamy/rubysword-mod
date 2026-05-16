package com.ashu.rubysword.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

/**
 * Custom sword implementation that applies a fire effect on hit.
 */
public class RubySwordItem extends SwordItem {

    public RubySwordItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // Fire aspect-style behavior: burn hit target for 5 seconds.
        target.setOnFireFor(5);
        return super.postHit(stack, target, attacker);
    }
}
