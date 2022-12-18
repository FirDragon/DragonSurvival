package by.dragonsurvivalteam.dragonsurvival.magic.abilities.ForestDragon.innate;

import by.dragonsurvivalteam.dragonsurvival.DragonSurvivalMod;
import by.dragonsurvivalteam.dragonsurvival.common.dragon_types.AbstractDragonType;
import by.dragonsurvivalteam.dragonsurvival.common.dragon_types.DragonTypes;
import by.dragonsurvivalteam.dragonsurvival.magic.common.RegisterDragonAbility;
import by.dragonsurvivalteam.dragonsurvival.magic.common.innate.DragonClawsAbility;
import net.minecraft.resources.ResourceLocation;

@RegisterDragonAbility
public class ForestClawAbility extends DragonClawsAbility{
	@Override
	public String getName(){
		return "forest_claws_and_teeth";
	}

	@Override
	public AbstractDragonType getDragonType(){
		return DragonTypes.FOREST;
	}

	@Override
	public ResourceLocation[] getSkillTextures(){
		return new ResourceLocation[]{new ResourceLocation(DragonSurvivalMod.MODID, "textures/skills/forest/forest_claws_and_teeth_0.png"),
		                              new ResourceLocation(DragonSurvivalMod.MODID, "textures/skills/forest/forest_claws_and_teeth_1.png"),
		                              new ResourceLocation(DragonSurvivalMod.MODID, "textures/skills/forest/forest_claws_and_teeth_2.png"),
		                              new ResourceLocation(DragonSurvivalMod.MODID, "textures/skills/forest/forest_claws_and_teeth_3.png"),
		                              new ResourceLocation(DragonSurvivalMod.MODID, "textures/skills/forest/forest_claws_and_teeth_4.png"),
		                              new ResourceLocation(DragonSurvivalMod.MODID, "textures/skills/forest/forest_claws_and_teeth_5.png"),
		                              new ResourceLocation(DragonSurvivalMod.MODID, "textures/skills/forest/forest_claws_and_teeth_6.png")};
	}
}