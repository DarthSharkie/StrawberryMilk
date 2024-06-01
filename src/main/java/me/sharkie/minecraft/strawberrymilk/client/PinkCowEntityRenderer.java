package me.sharkie.minecraft.strawberrymilk.client;

import me.sharkie.minecraft.strawberrymilk.PinkCowEntity;
import me.sharkie.minecraft.strawberrymilk.StrawberryMilk;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.CowEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class PinkCowEntityRenderer extends MobEntityRenderer<PinkCowEntity, CowEntityModel<PinkCowEntity>> {

    static final EntityModelLayer MAIN_LAYER = new EntityModelLayer(new Identifier(StrawberryMilk.MOD_ID, PinkCowEntity.NAME), "main");

    private static final Identifier TEXTURE = new Identifier(StrawberryMilk.MOD_ID, "textures/entity/pink_cow.png");
    private static final float SHADOW_RADIUS = 0.7F;

    public PinkCowEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new CowEntityModel<>(context.getPart(MAIN_LAYER)), SHADOW_RADIUS);
    }

    @Override
    public Identifier getTexture(PinkCowEntity entity) {
        return TEXTURE;
    }
}
