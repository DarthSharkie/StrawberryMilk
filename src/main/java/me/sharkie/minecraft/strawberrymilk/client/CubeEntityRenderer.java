package me.sharkie.minecraft.strawberrymilk.client;

import me.sharkie.minecraft.strawberrymilk.CubeEntity;
import me.sharkie.minecraft.strawberrymilk.StrawberryMilk;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class CubeEntityRenderer extends MobEntityRenderer<CubeEntity, CubeEntityModel> {

    static final EntityModelLayer MODEL_CUBE_LAYER = new EntityModelLayer(new Identifier(StrawberryMilk.MOD_ID, CubeEntity.NAME), "main");

    public CubeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new CubeEntityModel(context.getPart(MODEL_CUBE_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(CubeEntity entity) {
        return new Identifier(StrawberryMilk.MOD_ID, "textures/entity/cube/cube.png");
    }
}
