package piefarmer.immunology.events;

import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.relauncher.Side;

import piefarmer.immunology.common.Immunology;
import piefarmer.immunology.disease.Disease;
import piefarmer.immunology.entity.EntityBadger;
import piefarmer.immunology.entity.EntityDiseaseHandler;
import piefarmer.immunology.item.ItemDecayingFood;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.src.ModLoader;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.world.ChunkDataEvent;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.event.sound.SoundLoadEvent;

public class EventHook {

	@ForgeSubscribe
	public void LivingEvent(LivingEvent event)
    {
		Side side = FMLCommonHandler.instance().getEffectiveSide();
		if (side == Side.CLIENT) {
			Disease.entityUpdateHook(event.entityLiving);
		}
		if(Immunology.loadedEntityList.size() > event.entityLiving.entityId)
		{
			EntityDiseaseHandler hand = (EntityDiseaseHandler) Immunology.loadedEntityList.get(event.entityLiving.entityId);
			if(hand != null)
			{
				hand.entityUpdate();
			}
		}
		else
		{
			while(event.entity.entityId >= Immunology.loadedEntityList.size())
			{
				Immunology.loadedEntityList.add(null);
			}
			Immunology.loadedEntityList.add(event.entityLiving.entityId, new EntityDiseaseHandler(event.entityLiving));
			EntityDiseaseHandler hand = (EntityDiseaseHandler) Immunology.loadedEntityList.get(event.entityLiving.entityId);
	        hand.readNBTData(event.entityLiving.getEntityData());
		}
    }
	@ForgeSubscribe
	public void EntityJoinWorldEvent(EntityJoinWorldEvent evt)
	{
		if(evt.entity instanceof EntityLiving)
		{
			if(evt.entity.entityId > Immunology.loadedEntityList.size())
			{
				while(evt.entity.entityId >= Immunology.loadedEntityList.size())
				{
					Immunology.loadedEntityList.add(null);
				}
			}
			Immunology.loadedEntityList.add(evt.entity.entityId, new EntityDiseaseHandler((EntityLiving)evt.entity));
		}
	}
	@ForgeSubscribe
	public void worldSaveEvent(WorldEvent.Save evt)
	{
		Iterator iter = Immunology.loadedEntityList.iterator();
		while(iter.hasNext())
		{
			EntityDiseaseHandler hand = (EntityDiseaseHandler)iter.next();
			if(hand != null)
			{
				hand.saveNBTData(hand.living.getEntityData());
			}
		}
	}
}
