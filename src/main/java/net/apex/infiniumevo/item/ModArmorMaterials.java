package net.apex.infiniumevo.item;

import net.apex.infiniumevo.InfiniumEvo;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.util.Lazy;

import java.util.function.Supplier;



public enum ModArmorMaterials implements ArmorMaterial{

// Change Values
    DREADSTEEL("dreadsteel",28,new int[]{4,10,12,6}, 19, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.0F, 0.0F, () -> Ingredient.of(ModItems.DREADSTEEL.get())
            ),
    ENDERITE("enderite",28,new int[]{4,8,10,5}, 19, SoundEvents.ARMOR_EQUIP_NETHERITE,
            2.0F, 0.0F, () -> Ingredient.of(ModItems.ENDERITE.get())
            ),
    CRYSTALITE("crystalite",28,new int[]{8,14,16,7}, 19, SoundEvents.ARMOR_EQUIP_NETHERITE,
            4.0F, 0.5F, () -> Ingredient.of(ModItems.CRYSTALITE.get())
            ),

    INFINIUM("infinium",28,new int[]{14,16,18,12}, 19, SoundEvents.ARMOR_EQUIP_NETHERITE,
            5.0F, 0.5F, () -> Ingredient.of(ModItems.INFINIUM.get())
            );


    private static final int[] HEALTH_PER_SLOT = new int[]{13,15,16,11};
        private final String name;
        private final int durabilityMultiplier;
        private final int[] slotProtections;
        private final int enchantmentValue;
        private final SoundEvent sound;
        private final float toughness;
        private final float knockbackResistance;
        private final LazyLoadedValue<Ingredient> repairIngredient;

        ModArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_,
                          SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_){
            this.name = p_40474_;
            this.durabilityMultiplier = p_40475_;
            this.slotProtections = p_40476_;
            this.enchantmentValue = p_40477_;
            this.sound = p_40478_;
            this.toughness = p_40479_;
            this.knockbackResistance = p_40480_;
            this.repairIngredient = new LazyLoadedValue<>(p_40481_);
        }
        public int getDurabilityForSlot(EquipmentSlot pSlot) {
            return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
        }

        public int getDefenseForSlot(EquipmentSlot pSlot) {
            return this.slotProtections[pSlot.getIndex()];
        }

        public int getEnchantmentValue() {
            return this.enchantmentValue;
        }

        public SoundEvent getEquipSound() {
            return this.sound;
        }

        public Ingredient getRepairIngredient() {
            return this.repairIngredient.get();
        }

        public String getName() {
            return InfiniumEvo.MOD_ID + ":" + this.name;
        }

        public float getToughness() {
            return this.toughness;
        }

        public float getKnockbackResistance() {
            return this.knockbackResistance;
        }
}

