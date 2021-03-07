package com.tm_47.moretools.armor;

import com.tm_47.moretools.More_Tools;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {

    EMERALD(More_Tools.MOD_ID + ":emerald", 60, new int[] {4, 7, 9, 4}, 60, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F, () ->
    {return Ingredient.fromItems(Items.EMERALD.getItem());});

    private final int [] MAX_DAMAGE_ARRAY = new int[] {12, 17, 16,14};
    private final String name;
    private final int maxDamageFactor;
    private final int[] DamageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundevent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;

    ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundevent, float toughness, Supplier<Ingredient> repairMaterial){
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.DamageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundevent = soundevent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.DamageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundevent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
