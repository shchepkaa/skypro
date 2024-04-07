package studio.shchepkaa;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = SkyPro.MODID, version = SkyPro.VERSION)
public class SkyPro {
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());

        // Вот здесь вы можете добавить вызов меню
        Minecraft.getMinecraft().displayGuiScreen(new UpdateMenu());
    }
}
