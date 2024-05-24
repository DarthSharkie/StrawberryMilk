package me.sharkie.minecraft.strawberrymilk.client;

import me.sharkie.minecraft.strawberrymilk.CubeEntity;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class StrawberryMilkClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(CubeEntity.TYPE, CubeEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(CubeEntityRenderer.MODEL_CUBE_LAYER, CubeEntityModel::getTexturedModelData);
    }
}
