package com.tm_47.moretools.world.gen;

import com.tm_47.moretools.More_Tools;
import com.tm_47.moretools.util.RegistryHandler;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = More_Tools.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class oreGeneration {

    @SubscribeEvent
    public static void onBiomeLoading(final BiomeLoadingEvent event) {
        if (event.getCategory() != Biome.Category.NETHER && event.getCategory() != Biome.Category.THEEND) {
                event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add( () ->
                                Feature.ORE.withConfiguration(
                                           new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                                                RegistryHandler.SUPER_EMERALD_ORE.get().getDefaultState(), 6)
                                )
                );
        }
    }

}
