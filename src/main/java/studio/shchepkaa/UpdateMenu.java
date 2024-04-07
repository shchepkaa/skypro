package studio.shchepkaa;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class UpdateMenu extends GuiScreen {

    private final Minecraft mc;

    public UpdateMenu() {
        this.mc = Minecraft.getMinecraft();
    }

    @Override
    public void initGui() {
        super.initGui();
        // Добавляем кнопку для обновления мода
        this.buttonList.add(new GuiButton(0, this.width / 2 - 100, this.height / 2 + 60, "Обновить"));
        // Добавляем кнопку для отмены обновления
        this.buttonList.add(new GuiButton(1, this.width / 2 - 100, this.height / 2 + 80, "Обновить позже"));
        // Добавляем кнопку для возврата в главное меню
        this.buttonList.add(new GuiButton(2, this.width / 2 - 100, this.height / 2 + 100, "Главное меню"));
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        switch (button.id) {
            case 0:
                // Здесь вы можете добавить код для обновления мода
                mc.displayGuiScreen(null); // Закрываем меню
                break;
            case 1:
            case 2:
                mc.displayGuiScreen(null); // Просто закрываем меню, не выполняя никаких действий
                break;
            default:
                break;
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        super.drawScreen(mouseX, mouseY, partialTicks);
        // Отрисовываем текст, спрашивающий пользователя о необходимости обновления мода
    }
}
