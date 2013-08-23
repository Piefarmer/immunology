package piefarmer.immunology.disease;

import java.util.Random;

import piefarmer.immunology.common.Immunology;
import piefarmer.immunology.entity.EntityDiseaseHandler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EffectSpread extends DiseaseEffect {
	
	private World worldObj;
	public EffectSpread(int id, int stgAct, int stgEnd, String par1name) {
		super(id, stgAct, stgEnd, par1name);
	}
	public void performEffect(Disease disease, EntityLiving living){
		worldObj = living.worldObj;
		double par7 = 5.0D;
		if(worldObj != null && worldObj.isRemote)
		{
			for (int var12 = 0; var12 < worldObj.getLoadedEntityList().size(); ++var12)
			{
				if(worldObj.getLoadedEntityList().size() > var12)
				{
					Entity var13 = (Entity)worldObj.getLoadedEntityList().get(var12);
					double var14 = var13.getDistanceSq(living.posX, living.posY, living.posZ);
            
					if ((par7 < 0.0D || var14 < par7 * par7))
					{
							Random rand = new Random();
							int i = rand.nextInt(20000);
							if(var13 instanceof EntityLiving)
							{
								EntityLiving entityliving = (EntityLiving)var13;
								if(i <= 10 && entityliving.entityId != living.entityId)
								{
									if(disease.getName() == "Chicken Pox")
									{
										if(entityliving instanceof EntityChicken || entityliving instanceof EntityPlayer)
										{
											EntityDiseaseHandler hand = (EntityDiseaseHandler) Immunology.loadedEntityList.get(entityliving.entityId);
											hand.addDisease(Disease.getInstancebyName(disease));
											System.out.println(entityliving.getEntityName() + " has caught " + disease.getName() + " at " + 
													entityliving.posX + " "+ entityliving.posY + " " + entityliving.posZ + " by proxy of " + living.getEntityName());
										}
									}
									else
									{
										EntityDiseaseHandler hand = (EntityDiseaseHandler) Immunology.loadedEntityList.get(entityliving.entityId);
										if(hand != null)
										{
											hand.addDisease(Disease.getInstancebyName(disease));
											System.out.println(entityliving.getEntityName() + " has caught " + disease.getName() + " at " + 
												entityliving.posX + " "+ entityliving.posY + " " + entityliving.posZ + " by proxy of " + living.getEntityName());
										}
										else
										{
											while(entityliving.entityId >= Immunology.loadedEntityList.size())
											{
												Immunology.loadedEntityList.add(null);
											}
											Immunology.loadedEntityList.add(entityliving.entityId, new EntityDiseaseHandler(entityliving));
											EntityDiseaseHandler handler = (EntityDiseaseHandler) Immunology.loadedEntityList.get(entityliving.entityId);
									        handler.readNBTData(entityliving.getEntityData());
									        handler.addDisease(Disease.getInstancebyName(disease));
										}
									}
								}
							}
					}
				}
        
			}
		}
	}

}