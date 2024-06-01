package me.sharkie.minecraft.strawberrymilk;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class PinkCowEntity extends CowEntity {
    public static final String NAME = "pink-cow-entity";
    public static final Identifier ID = Identifier.of(StrawberryMilk.MOD_ID, NAME);

    public static EntityType<PinkCowEntity> TYPE;

    public static void register() {
        TYPE = Registry.register(Registries.ENTITY_TYPE,
                                 ID,
                                 EntityType.Builder.create(PinkCowEntity::new, SpawnGroup.CREATURE)
                                                   .setDimensions(0.9F, 1.4F)
                                                   .maxTrackingRange(10)
                                                   .build());
        FabricDefaultAttributeRegistry.register(TYPE, createPinkCowAttributes());
    }

    private static DefaultAttributeContainer createPinkCowAttributes() {
        // TODO: Modify attributes if necessary
        return CowEntity.createCowAttributes().build();
    }

    public PinkCowEntity(EntityType<? extends CowEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        // TODO: Consider a goal that has it try to find Sweetberries or Strawberries (once added)
        super.initGoals();
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack stackInHand = player.getStackInHand(hand);
        if (stackInHand.isOf(Items.BUCKET) && !this.isBaby()) {
            player.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
            ItemStack strawberryMilkBucket = ItemUsage.exchangeStack(stackInHand, player, StrawberryMilkBucketItem.ITEM.getDefaultStack());
            player.setStackInHand(hand, strawberryMilkBucket);
            return ActionResult.success(this.getWorld().isClient);
        } else {
            return super.interactMob(player, hand);
        }
    }

    @Nullable
    @Override
    public CowEntity createChild(ServerWorld serverWorld, PassiveEntity passiveEntity) {
        return PinkCowEntity.TYPE.create(serverWorld);
    }
}
