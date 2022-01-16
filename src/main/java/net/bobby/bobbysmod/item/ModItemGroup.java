package net.bobby.bobbysmod.item;

import net.bobby.bobbysmod.BobbyMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ItemGroup {
    public static final net.minecraft.item.ItemGroup MYTHRIL = FabricItemGroupBuilder.build(new Identifier(BobbyMod.MOD_ID, "mythril"),
            () -> new ItemStack(Items.MYTHRIL_INGOT));

    public static final net.minecraft.item.ItemGroup TOYS = FabricItemGroupBuilder.build(new Identifier(BobbyMod.MOD_ID, "toys"),
            () -> new ItemStack(Items.MYTHRIL_INGOT));

    public static final net.minecraft.item.ItemGroup TOOLS = FabricItemGroupBuilder.build(new Identifier(BobbyMod.MOD_ID, "tools"),
            () -> new ItemStack(Items.MYTHRIL_INGOT));

}
