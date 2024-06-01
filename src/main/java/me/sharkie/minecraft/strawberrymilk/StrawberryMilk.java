package me.sharkie.minecraft.strawberrymilk;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

public class StrawberryMilk implements ModInitializer {
    public static final String MOD_ID = "strawberry-milk";

    @Override
    public void onInitialize() {
        PinkCowEntity.register();
        StrawberryMilkBucketItem.register();
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.addAfter(Items.MILK_BUCKET, StrawberryMilkBucketItem.ITEM);
        });
    }
}
