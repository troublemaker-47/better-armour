package com.tm_47.moretools.tools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {
    EMERALD(4, 3096, 15.0F, 4.0F, 60, () -> {
        return Ingredient.fromItems(Items.EMERALD.getItem());
    });
    private final int harvestlevel;
    private final int maxuses;
    private final float efficiency;
    private final float attackdamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairmaterial;

    ModItemTier(int harvestlevel, int maxuses, float efficiency, float attackdamage, int enchantability, Supplier<Ingredient> repairmaterial) {
        this.harvestlevel = harvestlevel;
        this.maxuses = maxuses;
        this.efficiency = efficiency;
        this.attackdamage = attackdamage;
        this.enchantability = enchantability;
        this.repairmaterial = repairmaterial;
    }

    @Override
    public int getMaxUses() {
        return maxuses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackdamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestlevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairmaterial.get();
    }
}
