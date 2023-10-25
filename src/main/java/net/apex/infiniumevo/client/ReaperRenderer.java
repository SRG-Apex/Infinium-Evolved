package net.apex.infiniumevo.client;

import net.apex.infiniumevo.entity.ReaperEntity;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;


    public class ReaperRenderer extends HumanoidMobRenderer<ReaperEntity, HumanoidModel<ReaperEntity>> {
        public ReaperRenderer(EntityRendererProvider.Context context) {
            super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
            this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
        }

        @Override
        public ResourceLocation getTextureLocation(ReaperEntity entity) {
            return new ResourceLocation("infiniumevo:textures/entities/reaper_texture.png");
        }
    }


