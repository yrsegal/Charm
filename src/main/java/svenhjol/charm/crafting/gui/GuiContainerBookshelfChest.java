package svenhjol.charm.crafting.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import svenhjol.charm.Charm;
import svenhjol.meson.MesonGuiContainer;
import vazkii.quark.api.IChestButtonCallback;
import vazkii.quark.api.IItemSearchBar;
import net.minecraftforge.fml.common.Optional;

@Optional.InterfaceList({
    Optional.Interface(iface = "vazkii.quark.api.IChestButtonCallback", modid = "quark"),
    Optional.Interface(iface = "vazkii.quark.api.IItemSearchBar", modid = "quark")
})
public class GuiContainerBookshelfChest extends MesonGuiContainer implements IChestButtonCallback, IItemSearchBar
{
    public GuiContainerBookshelfChest(Container container, InventoryPlayer playerInv)
    {
        super("tile.charm:bookshelf_container.name", container, playerInv, new ResourceLocation(Charm.MOD_ID, "textures/gui/generic9.png"));
    }

    @Override
    public boolean onAddChestButton(GuiButton button, int buttonType)
    {
        return true;
    }

    @Override
    public void onSearchBarAdded(GuiTextField bar)
    {
        bar.y = getGuiTop() + 20;
    }
}