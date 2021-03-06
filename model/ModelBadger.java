// Date: 03/07/2013 00:25:26
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package piefarmer.immunology.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelBadger extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Nose_middle;
    ModelRenderer Nose_Right;
    ModelRenderer Nose_Left;
    ModelRenderer Nose_tip;
    ModelRenderer Nose_Top;
    ModelRenderer Eye_right;
    ModelRenderer Eye_Left;
    ModelRenderer Ear_Right;
    ModelRenderer Ear_Left;
    ModelRenderer Body;
    ModelRenderer Upper_Body_Left;
    ModelRenderer Upper_Body_Right;
    ModelRenderer Lower_Body;
    ModelRenderer FL_Leg_Top;
    ModelRenderer FL_Leg_Bot;
    ModelRenderer FL_Foot;
    ModelRenderer FR_Leg_Top;
    ModelRenderer FR_Leg_Bot;
    ModelRenderer FR_Foot;
    ModelRenderer BR_Leg_Top;
    ModelRenderer BR_Leg_Bot;
    ModelRenderer BR_Foot;
    ModelRenderer BL_Leg_Top;
    ModelRenderer BL_Leg_Bot;
    ModelRenderer BL_Foot;
    ModelRenderer Tail_Top;
    ModelRenderer Tail_Bot;
  
  public ModelBadger()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(-3.5F, -2.5F, -4F, 7, 5, 4);
      Head.setRotationPoint(0F, 17F, -6F);
      Head.setTextureSize(128, 64);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Nose_middle = new ModelRenderer(this, 22, 0);
      Nose_middle.addBox(-1.5F, -1F, -10F, 3, 3, 6);
      Nose_middle.setRotationPoint(0F, 17F, -6F);
      Nose_middle.setTextureSize(128, 64);
      Nose_middle.mirror = true;
      setRotation(Nose_middle, 0F, 0F, 0F);
      Nose_Right = new ModelRenderer(this, 0, 10);
      Nose_Right.addBox(-4F, -1F, -9F, 2, 3, 7);
      Nose_Right.setRotationPoint(0F, 17F, -6F);
      Nose_Right.setTextureSize(128, 64);
      Nose_Right.mirror = true;
      setRotation(Nose_Right, 0F, -0.273182F, 0F);
      Nose_Left = new ModelRenderer(this, 0, 10);
      Nose_Left.addBox(1.9F, -1F, -9.3F, 2, 3, 7);
      Nose_Left.setRotationPoint(0F, 17F, -6F);
      Nose_Left.setTextureSize(128, 64);
      Nose_Left.mirror = true;
      setRotation(Nose_Left, 0F, 0.2617994F, 0F);
      Nose_tip = new ModelRenderer(this, 18, 9);
      Nose_tip.addBox(-1F, -0.5F, -11F, 2, 2, 1);
      Nose_tip.setRotationPoint(0F, 17F, -6F);
      Nose_tip.setTextureSize(128, 64);
      Nose_tip.mirror = true;
      setRotation(Nose_tip, 0F, 0F, 0F);
      Nose_Top = new ModelRenderer(this, 18, 12);
      Nose_Top.addBox(-1.5F, -2.6F, -9.7F, 3, 1, 6);
      Nose_Top.setRotationPoint(0F, 17F, -6F);
      Nose_Top.setTextureSize(128, 64);
      Nose_Top.mirror = true;
      setRotation(Nose_Top, 0.1631883F, 0F, 0F);
      Eye_right = new ModelRenderer(this, 24, 9);
      Eye_right.addBox(-2.5F, -2F, -5F, 1, 1, 1);
      Eye_right.setRotationPoint(0F, 17F, -6F);
      Eye_right.setTextureSize(128, 64);
      Eye_right.mirror = true;
      setRotation(Eye_right, 0F, 0F, 0F);
      Eye_Left = new ModelRenderer(this, 28, 9);
      Eye_Left.addBox(1.5F, -2F, -5F, 1, 1, 1);
      Eye_Left.setRotationPoint(0F, 17F, -6F);
      Eye_Left.setTextureSize(128, 64);
      Eye_Left.mirror = true;
      setRotation(Eye_Left, 0F, 0F, 0F);
      Ear_Right = new ModelRenderer(this, 32, 9);
      Ear_Right.addBox(-4F, -3F, -2F, 2, 2, 1);
      Ear_Right.setRotationPoint(0F, 17F, -6F);
      Ear_Right.setTextureSize(128, 64);
      Ear_Right.mirror = true;
      setRotation(Ear_Right, 0F, 0F, 0F);
      Ear_Left = new ModelRenderer(this, 38, 9);
      Ear_Left.addBox(2F, -3F, -2F, 2, 2, 1);
      Ear_Left.setRotationPoint(0F, 17F, -6F);
      Ear_Left.setTextureSize(128, 64);
      Ear_Left.mirror = true;
      setRotation(Ear_Left, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 20);
      Body.addBox(-3F, -3F, -7F, 6, 3, 14);
      Body.setRotationPoint(0F, 18F, 0F);
      Body.setTextureSize(128, 64);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Upper_Body_Left = new ModelRenderer(this, 44, 0);
      Upper_Body_Left.addBox(2.8F, -1.6F, -6F, 1, 3, 13);
      Upper_Body_Left.setRotationPoint(0F, 18F, 0F);
      Upper_Body_Left.setTextureSize(128, 64);
      Upper_Body_Left.mirror = true;
      setRotation(Upper_Body_Left, 0F, 0F, -0.3717861F);
      Upper_Body_Right = new ModelRenderer(this, 44, 0);
      Upper_Body_Right.addBox(-3.8F, -1.5F, -6F, 1, 3, 13);
      Upper_Body_Right.setRotationPoint(0F, 18F, 0F);
      Upper_Body_Right.setTextureSize(128, 64);
      Upper_Body_Right.mirror = true;
      setRotation(Upper_Body_Right, 0F, 0F, 0.37179F);
      Lower_Body = new ModelRenderer(this, 40, 16);
      Lower_Body.addBox(-4F, 0F, -7F, 8, 3, 14);
      Lower_Body.setRotationPoint(0F, 18F, 0F);
      Lower_Body.setTextureSize(128, 64);
      Lower_Body.mirror = true;
      setRotation(Lower_Body, 0F, 0F, 0F);
      FL_Leg_Top = new ModelRenderer(this, 72, 8);
      FL_Leg_Top.addBox(0.3F, -1F, -1.5F, 3, 4, 4);
      FL_Leg_Top.setRotationPoint(2F, 18F, -3.5F);
      FL_Leg_Top.setTextureSize(128, 64);
      FL_Leg_Top.mirror = true;
      setRotation(FL_Leg_Top, -0.1858931F, 0F, 0F);
      FL_Leg_Bot = new ModelRenderer(this, 72, 0);
      FL_Leg_Bot.addBox(1F, 1F, -0.5F, 2, 4, 3);
      FL_Leg_Bot.setRotationPoint(2F, 18F, -3.5F);
      FL_Leg_Bot.setTextureSize(128, 64);
      FL_Leg_Bot.mirror = true;
      setRotation(FL_Leg_Bot, -0.3346075F, 0F, 0F);
      FL_Foot = new ModelRenderer(this, 82, 0);
      FL_Foot.addBox(1F, 4F, -3F, 2, 2, 4);
      FL_Foot.setRotationPoint(2F, 18F, -3.5F);
      FL_Foot.setTextureSize(128, 64);
      FL_Foot.mirror = true;
      setRotation(FL_Foot, 0F, 0F, 0F);
      FR_Leg_Top = new ModelRenderer(this, 72, 8);
      FR_Leg_Top.addBox(-1.3F, -0.9F, -2F, 3, 4, 4);
      FR_Leg_Top.setRotationPoint(-4F, 18F, -4F);
      FR_Leg_Top.setTextureSize(128, 64);
      FR_Leg_Top.mirror = true;
      setRotation(FR_Leg_Top, -0.1858931F, 0F, 0F);
      FR_Leg_Bot = new ModelRenderer(this, 72, 0);
      FR_Leg_Bot.addBox(-1F, 1F, -1F, 2, 4, 3);
      FR_Leg_Bot.setRotationPoint(-4F, 18F, -4F);
      FR_Leg_Bot.setTextureSize(128, 64);
      FR_Leg_Bot.mirror = true;
      setRotation(FR_Leg_Bot, -0.3346075F, 0F, 0F);
      FR_Foot = new ModelRenderer(this, 82, 0);
      FR_Foot.addBox(-1F, 4F, -3.5F, 2, 2, 4);
      FR_Foot.setRotationPoint(-4F, 18F, -4F);
      FR_Foot.setTextureSize(128, 64);
      FR_Foot.mirror = true;
      setRotation(FR_Foot, 0F, 0F, 0F);
      BR_Leg_Top = new ModelRenderer(this, 86, 8);
      BR_Leg_Top.addBox(-2.3F, -1.9F, -2F, 3, 4, 4);
      BR_Leg_Top.setRotationPoint(-3F, 19F, 4F);
      BR_Leg_Top.setTextureSize(128, 64);
      BR_Leg_Top.mirror = true;
      setRotation(BR_Leg_Top, 0.4461433F, 0F, 0F);
      BR_Leg_Bot = new ModelRenderer(this, 84, 16);
      BR_Leg_Bot.addBox(-2F, 0F, -1F, 2, 4, 3);
      BR_Leg_Bot.setRotationPoint(-3F, 19F, 4F);
      BR_Leg_Bot.setTextureSize(128, 64);
      BR_Leg_Bot.mirror = true;
      setRotation(BR_Leg_Bot, -0.1115358F, 0F, 0F);
      BR_Foot = new ModelRenderer(this, 84, 27);
      BR_Foot.addBox(-2F, 3F, -2.4F, 2, 2, 4);
      BR_Foot.setRotationPoint(-3F, 19F, 4F);
      BR_Foot.setTextureSize(128, 64);
      BR_Foot.mirror = true;
      setRotation(BR_Foot, 0F, 0F, 0F);
      BL_Leg_Top = new ModelRenderer(this, 86, 8);
      BL_Leg_Top.addBox(-0.7F, -1.6F, -2.4F, 3, 4, 4);
      BL_Leg_Top.setRotationPoint(3F, 18.5F, 4F);
      BL_Leg_Top.setTextureSize(128, 64);
      BL_Leg_Top.mirror = true;
      setRotation(BL_Leg_Top, 0.4461433F, 0F, 0F);
      BL_Leg_Bot = new ModelRenderer(this, 84, 16);
      BL_Leg_Bot.addBox(0F, 0.5F, -1F, 2, 4, 3);
      BL_Leg_Bot.setRotationPoint(3F, 18.5F, 4F);
      BL_Leg_Bot.setTextureSize(128, 64);
      BL_Leg_Bot.mirror = true;
      setRotation(BL_Leg_Bot, -0.1115358F, 0F, 0F);
      BL_Foot = new ModelRenderer(this, 84, 27);
      BL_Foot.addBox(0F, 3.5F, -2.5F, 2, 2, 4);
      BL_Foot.setRotationPoint(3F, 18.5F, 4F);
      BL_Foot.setTextureSize(128, 64);
      BL_Foot.mirror = true;
      setRotation(BL_Foot, 0F, 0F, 0F);
      Tail_Top = new ModelRenderer(this, 58, 33);
      Tail_Top.addBox(-3F, 0F, -1.5F, 6, 5, 3);
      Tail_Top.setRotationPoint(0F, 16F, 6F);
      Tail_Top.setTextureSize(128, 64);
      Tail_Top.mirror = true;
      setRotation(Tail_Top, 0.7679449F, 0F, 0F);
      Tail_Bot = new ModelRenderer(this, 42, 33);
      Tail_Bot.addBox(-2F, -3.2F, 4F, 4, 3, 3);
      Tail_Bot.setRotationPoint(0F, 16F, 6F);
      Tail_Bot.setTextureSize(128, 64);
      Tail_Bot.mirror = true;
      setRotation(Tail_Bot, -1.189716F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    if (this.isChild)
    {
        float f6 = 2.0F;
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, 10.4F * f5, 1.0F * f5);
        GL11.glScalef(1.0F / 1.65F, 1.0F / 1.65F, 1.0F / 1.65F);
        Head.render(f5);
    	Nose_middle.render(f5);
    	Nose_Right.render(f5);
    	Nose_Left.render(f5);
    	Nose_tip.render(f5);
    	Nose_Top.render(f5);
    	Eye_right.render(f5);
    	Eye_Left.render(f5);
    	Ear_Right.render(f5);
    	Ear_Left.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
        GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
        Body.render(f5);
    	Upper_Body_Left.render(f5);
    	Upper_Body_Right.render(f5);
    	Lower_Body.render(f5);
    	FL_Leg_Top.render(f5);
	    FL_Leg_Bot.render(f5);
	    FL_Foot.render(f5);
	    FR_Leg_Top.render(f5);
	    FR_Leg_Bot.render(f5);
	    FR_Foot.render(f5);
	    BR_Leg_Top.render(f5);
	    BR_Leg_Bot.render(f5);
	    BR_Foot.render(f5);
	    BL_Leg_Top.render(f5);
	    BL_Leg_Bot.render(f5);
	    BL_Foot.render(f5);
	    Tail_Top.render(f5);
	    Tail_Bot.render(f5);
        GL11.glPopMatrix();
    }
    else
    {
    	Head.render(f5);
    	Nose_middle.render(f5);
    	Nose_Right.render(f5);
    	Nose_Left.render(f5);
    	Nose_tip.render(f5);
    	Nose_Top.render(f5);
    	Eye_right.render(f5);
    	Eye_Left.render(f5);
    	Ear_Right.render(f5);
    	Ear_Left.render(f5);
    	Body.render(f5);
    	Upper_Body_Left.render(f5);
    	Upper_Body_Right.render(f5);
    	Lower_Body.render(f5);
    	FL_Leg_Top.render(f5);
	    FL_Leg_Bot.render(f5);
	    FL_Foot.render(f5);
	    FR_Leg_Top.render(f5);
	    FR_Leg_Bot.render(f5);
	    FR_Foot.render(f5);
	    BR_Leg_Top.render(f5);
	    BR_Leg_Bot.render(f5);
	    BR_Foot.render(f5);
	    BL_Leg_Top.render(f5);
	    BL_Leg_Bot.render(f5);
	    BL_Foot.render(f5);
	    Tail_Top.render(f5);
	    Tail_Bot.render(f5);
    }
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
  {
   	super.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);
   	this.Ear_Right.rotateAngleY = par4 / (180F / (float)Math.PI);
   	this.Ear_Left.rotateAngleY = par4 / (180F / (float)Math.PI);
   	this.Eye_Left.rotateAngleY = par4 / (180F / (float)Math.PI);
   	this.Eye_right.rotateAngleY = par4 / (180F / (float)Math.PI);
   	this.Head.rotateAngleY = par4 / (180F / (float)Math.PI);
   	float noseright = par4 / (180F / (float)Math.PI);
    this.Nose_Right.rotateAngleY = noseright - (20.6F / (float)Math.PI);
    float noseleft = par4 / (180F / (float)Math.PI);
    this.Nose_Left.rotateAngleY = noseleft - (-20.6F / (float)Math.PI);
   	this.Nose_middle.rotateAngleY = par4 / (180F / (float)Math.PI);
   	this.Nose_tip.rotateAngleY = par4 / (180F / (float)Math.PI);
   	this.Nose_Top.rotateAngleY = par4 / (180F / (float)Math.PI);
   	
   	this.Tail_Top.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 0.3F * par2;
   	this.Tail_Bot.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 0.3F * par2;
   	this.Body.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 0.3F * par2;
   	this.Lower_Body.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 0.3F * par2;
   	float upperleft = MathHelper.cos(par1 * 0.6662F) * 0.3F * par2;
   	this.Upper_Body_Left.rotateAngleZ = upperleft - (-70.2F / (float)Math.PI);
   	float upperright = MathHelper.cos(par1 * 0.6662F) * 0.3F * par2;
   	this.Upper_Body_Right.rotateAngleZ = upperright - (70.2F / (float)Math.PI);
   	
   	
   	this.FL_Leg_Top.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
   	this.FL_Leg_Bot.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
   	this.FL_Foot.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
   	this.BR_Leg_Top.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
   	this.BR_Leg_Bot.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
   	this.BR_Foot.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
   	
    this.BL_Leg_Top.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    this.BL_Leg_Bot.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    this.BL_Foot.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    this.FR_Leg_Top.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    this.FR_Leg_Bot.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    this.FR_Foot.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
  }

}
