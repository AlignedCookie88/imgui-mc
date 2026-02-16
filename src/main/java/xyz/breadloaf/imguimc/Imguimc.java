package xyz.breadloaf.imguimc;

import imgui.ImGui;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xyz.breadloaf.imguimc.debug.DebugRenderable;
import xyz.breadloaf.imguimc.interfaces.Renderable;
import java.util.ArrayList;


@Environment(EnvType.CLIENT)
public class Imguimc implements ClientModInitializer {
    public static final String MODID = "imgui-mc";
    public static final Logger LOGGER = LogManager.getLogger(MODID);
    public static final Minecraft MINECRAFT = Minecraft.getInstance();
    public static ArrayList<Renderable> renderstack = new ArrayList<>();

    public static ArrayList<Renderable> toRemove = new ArrayList<>();

    @Override
    public void onInitializeClient() {
        if ("true".equals(System.getProperty("imgui-mc.debug"))) {
            LOGGER.info("In development environment, pushing debug renderable.");
            pushRenderable(new DebugRenderable());
        }
    }

    public static Renderable pushRenderable(Renderable renderable) {
        renderstack.add(renderable);
        return renderable;
    }

    public static Renderable pullRenderable(Renderable renderable) {
        renderstack.remove(renderable);
        return renderable;
    }

    public static Renderable pullRenderableAfterRender(Renderable renderable) {
        toRemove.add(renderable);
        return renderable;
    }

    /**
     * Check whether game keyboard inputs are being cancelled.
     */
    public static boolean shouldCancelGameKeyboardInputs() {
        return ImGui.isAnyItemActive() || ImGui.isAnyItemFocused();
    }

    public static int getDockId() {
        return ImGui.getID("imgui-mc dockspace");
    }
}
