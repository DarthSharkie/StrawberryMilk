package me.sharkie.minecraft.strawberrymilk;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.MilkBucketItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class StrawberryMilkBucketItem extends MilkBucketItem {
    public static final String NAME = "strawberry_milk_bucket";
    public static final Identifier ID = Identifier.of(StrawberryMilk.MOD_ID, NAME);

    public static Item ITEM;

    public static void register() {
        ITEM = Registry.register(Registries.ITEM, ID, new StrawberryMilkBucketItem(new Settings().recipeRemainder(Items.BUCKET).maxCount(1)));
    }

    public StrawberryMilkBucketItem(Settings settings) {
        super(settings);
    }
}
