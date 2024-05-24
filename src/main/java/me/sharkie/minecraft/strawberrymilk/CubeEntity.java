package me.sharkie.minecraft.strawberrymilk;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class CubeEntity extends PathAwareEntity {
    public static final String NAME = "cube-entity";
    public static final Identifier ID = new Identifier(StrawberryMilk.MOD_ID, NAME);

    public static EntityType<CubeEntity> TYPE;

    public static void register() {
        TYPE = Registry.register(Registries.ENTITY_TYPE,
                                 ID,
                                 EntityType.Builder.create(CubeEntity::new, SpawnGroup.CREATURE).setDimensions(1.0f, 1.0f).build());
        FabricDefaultAttributeRegistry.register(TYPE, createEntityAttributes());
    }

    public static DefaultAttributeContainer createEntityAttributes() {
        return CubeEntity.createMobAttributes().build();
    }

    protected CubeEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
}
