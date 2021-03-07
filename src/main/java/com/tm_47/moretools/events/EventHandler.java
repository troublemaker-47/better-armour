package com.tm_47.moretools.events;

import com.tm_47.moretools.More_Tools;
import com.tm_47.moretools.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = More_Tools.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class EventHandler {
    @SubscribeEvent
    public static void OnSwordClick (PlayerInteractEvent.RightClickItem event){
        LivingEntity player = event.getEntityLiving();
        if (player.getHeldItemMainhand().getItem() == RegistryHandler.EMERALD_SWORD.get()){
//            player.getLookVec().scale(2.0F).add(player.getPositionVec());
            player.moveForced(player.getLookVec().scale(6.0F).add(player.getPositionVec()));

        }
    }
}