package piefarmer.immunology.disease;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

public class EffectFever extends DiseaseEffect{
	
	World worldObj = null;
	public EffectFever(int id, int stgAct, int stgEnd, String name) {
		super(id, stgAct, stgEnd, name);
	}
	public void performEffect(Disease disease, EntityLivingBase living)
	{
		
	}

}
