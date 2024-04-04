package confusingfool93.moltenobsidiantools.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.*;

public class ReinforcedArrowItem extends ArrowItem
{
    public ReinforcedArrowItem(Settings settings) {
        super(settings);
    }

    @Override
    protected void onEntityHit(LivingEntity entityHit, ArrowEntity arrow)
    {
        if (!entityHit.getWorld().isClient && entityHit instanceof PlayerEntity)
        {
            PlayerEntity player = (PlayerEntity) entityHit;
            ItemStack helmet = player.getEquippedStack(EquipmentSlot.HEAD);
            ItemStack chestplate = player.getEquippedStack(EquipmentSlot.CHEST);
            ItemStack leggings = player.getEquippedStack(EquipmentSlot.LEGS);
            ItemStack boots = player.getEquippedStack(EquipmentSlot.FEET);

            if (helmet.getItem() instanceof ArmorItem && ((ArmorItem) helmet.getItem()).getMaterial() == ArmorMaterials.DIAMOND &&
                    chestplate.getItem() instanceof ArmorItem && ((ArmorItem) chestplate.getItem()).getMaterial() == ArmorMaterials.DIAMOND &&
                    leggings.getItem() instanceof ArmorItem && ((ArmorItem) leggings.getItem()).getMaterial() == ArmorMaterials.DIAMOND &&
                    boots.getItem() instanceof ArmorItem && ((ArmorItem) boots.getItem()).getMaterial() == ArmorMaterials.DIAMOND) {
                // Damage only the armor's durability
                helmet.damage(1, player, p -> p.sendEquipmentBreakStatus(EquipmentSlot.HEAD));
                chestplate.damage(1, player, p -> p.sendEquipmentBreakStatus(EquipmentSlot.CHEST));
                leggings.damage(1, player, p -> p.sendEquipmentBreakStatus(EquipmentSlot.LEGS));
                boots.damage(1, player, p -> p.sendEquipmentBreakStatus(EquipmentSlot.FEET));
            } else {
                // Damage the player
                player.damage().arrow(arrow, arrow.getOwner()), 1.0f);
            }
        }
    }
}
