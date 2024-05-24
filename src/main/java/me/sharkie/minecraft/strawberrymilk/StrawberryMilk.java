package me.sharkie.minecraft.strawberrymilk;

import net.fabricmc.api.ModInitializer;

public class StrawberryMilk implements ModInitializer {
    public static final String MOD_ID = "strawberry-milk";

    @Override
    public void onInitialize() {
        CubeEntity.register();
    }
}
