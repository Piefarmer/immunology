package piefarmer.immunology.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;

public class GuiButtonExpand extends GuiButton{
	
	private boolean isExpanded = false;
	public static final ResourceLocation RESOURCE_BUTTON = new ResourceLocation("immunology:textures/gui/DiagnosticTableGUI.png");
	private static TextureManager textureManager;
	public GuiButtonExpand(int par1, int par2, int par3)
    {
        super(par1, par2, par3, 11, 12, "");
    }
    public void drawButton(Minecraft par1Minecraft, int par2, int par3)
    {
        if (this.drawButton)
        {
            boolean var4 = par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height;
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            Minecraft mc = par1Minecraft;
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            int var5 = 176;
            int var6 = 0;
            textureManager = par1Minecraft.func_110434_K();
            textureManager.func_110577_a(RESOURCE_BUTTON);
            if (var4)
            {
                var5 += 11;
            }
            if(isExpanded)
            {
            	var6 += 12;
            }

            this.drawTexturedModalRect(this.xPosition, this.yPosition, var5, var6, 11, 12);
        }
    }
    public void setExpaned(boolean par1)
    {
    	this.isExpanded = par1;
    }

}
