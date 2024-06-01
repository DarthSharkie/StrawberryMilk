package me.sharkie.minecraft.strawberrymilk.client;

import me.sharkie.minecraft.strawberrymilk.PinkCowEntity;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.CowEntityModel;

public class StrawberryMilkClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Pink Cow
        EntityRendererRegistry.register(PinkCowEntity.TYPE, PinkCowEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(PinkCowEntityRenderer.MAIN_LAYER, CowEntityModel::getTexturedModelData);
    }
}
