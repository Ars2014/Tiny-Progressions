package com.kashdeya.tinyprogressions.crafting;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ArmorRecipes {
	
	public static void init() {
		if (ConfigHandler.StoneArmor){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.stone_helmet), new Object[] {
					"sss",
					"s s",
						Character.valueOf('s'), "stone"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.stone_chestplate), new Object[] {
					"s s",
					"sss",
					"sss",
						Character.valueOf('s'), "stone"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.stone_leggings), new Object[] {
					"sss",
					"s s",
					"s s",
						Character.valueOf('s'), "stone"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.stone_boots), new Object[] {
					"s s",
					"s s",
						Character.valueOf('s'), "stone"
			});
		}
		
		if (ConfigHandler.obsidian_armor){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.obsidian_helmet), new Object[] {
					"sss",
					"s s",
						Character.valueOf('s'), "obsidian"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.obsidian_chestplate), new Object[] {
					"s s",
					"sss",
					"sss",
						Character.valueOf('s'), "obsidian"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.obsidian_leggings), new Object[] {
					"sss",
					"s s",
					"s s",
						Character.valueOf('s'), "obsidian"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.obsidian_boots), new Object[] {
					"s s",
					"s s",
						Character.valueOf('s'), "obsidian"
			});
		}
		
		if (ConfigHandler.FlintArmor){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.flint_helmet), new Object[] {
					"fff",
					"f f",
						Character.valueOf('f'), "flint"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.flint_chestplate), new Object[] {
					"f f",
					"fff",
					"fff",
						Character.valueOf('f'), "flint"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.flint_leggings), new Object[] {
					"fff",
					"f f",
					"f f",
						Character.valueOf('f'), "flint"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.flint_boots), new Object[] {
					"f f",
					"f f",
						Character.valueOf('f'), "flint"
			});
		}
		
		if (ConfigHandler.BoneArmor){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.bone_helmet), new Object[] {
					"bbb",
					"b b",
						Character.valueOf('b'), "bone"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.bone_chestplate), new Object[] {
					"b b",
					"bbb",
					"bbb",
						Character.valueOf('b'), "bone"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.bone_leggings), new Object[] {
					"bbb",
					"b b",
					"b b",
						Character.valueOf('b'), "bone"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.bone_boots), new Object[] {
					"b b",
					"b b",
						Character.valueOf('b'), "bone"
			});
		}
		
		if (ConfigHandler.WoodArmor){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.wooden_helmet), new Object[] {
					"lll",
					"l l",
						Character.valueOf('l'), Blocks.LOG
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.wooden_chestplate), new Object[] {
					"l l",
					"lll",
					"lll",
						Character.valueOf('l'), Blocks.LOG
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.wooden_leggings), new Object[] {
					"lll",
					"l l",
					"l l",
						Character.valueOf('l'), Blocks.LOG
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.wooden_boots), new Object[] {
					"l l",
					"l l",
						Character.valueOf('l'), Blocks.LOG
			});
		}
		
		if (ConfigHandler.lava_ore){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.lava_helmet), new Object[] {
					"lll",
					"l l",
						Character.valueOf('l'), TechItems.lava_crystal
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.lava_chestplate), new Object[] {
					"l l",
					"lll",
					"lll",
						Character.valueOf('l'), TechItems.lava_crystal
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.lava_leggings), new Object[] {
					"lll",
					"l l",
					"l l",
						Character.valueOf('l'), TechItems.lava_crystal
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.lava_boots), new Object[] {
					"l l",
					"l l",
						Character.valueOf('l'), TechItems.lava_crystal
			});
		}
		
		if (ConfigHandler.wither_armor){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.wither_helmet), new Object[] {
					"www",
					"w w",
						Character.valueOf('w'), TechItems.wither_rib
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.wither_chestplate), new Object[] {
					"w w",
					"www",
					"www",
						Character.valueOf('w'), TechItems.wither_rib
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.wither_leggings), new Object[] {
					"www",
					"w w",
					"w w",
						Character.valueOf('w'), TechItems.wither_rib
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.wither_boots), new Object[] {
					"w w",
					"w w",
						Character.valueOf('w'), TechItems.wither_rib
			});
		}
		
		if (ConfigHandler.dragon_armor){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.dragon_helmet), new Object[] {
					"ddd",
					"d d",
						Character.valueOf('d'), TechItems.dragon_scale
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.dragon_chestplate), new Object[] {
					"d d",
					"ddd",
					"ddd",
						Character.valueOf('d'), TechItems.dragon_scale
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.dragon_leggings), new Object[] {
					"ddd",
					"d d",
					"d d",
						Character.valueOf('d'), TechItems.dragon_scale
			});
			
		   	RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.dragon_boots), new Object[] {
					"d d",
					"d d",
						Character.valueOf('d'), TechItems.dragon_scale
			});
		}
		
		if (ConfigHandler.lapis_armor){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.lapis_ingot), new Object[] {
					"ddd",
					"ddd",
						Character.valueOf('d'), new ItemStack(Items.DYE, 1, 4)
			});
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.lapis_helmet), new Object[] {
					"ddd",
					"d d",
						Character.valueOf('d'), TechItems.lapis_ingot
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.lapis_chestplate), new Object[] {
					"d d",
					"ddd",
					"ddd",
						Character.valueOf('d'), TechItems.lapis_ingot
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.lapis_leggings), new Object[] {
					"ddd",
					"d d",
					"d d",
						Character.valueOf('d'), TechItems.lapis_ingot
			});
			
		   	RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.lapis_boots), new Object[] {
					"d d",
					"d d",
						Character.valueOf('d'), TechItems.lapis_ingot
			});
		}
		
		if (ConfigHandler.redstone_armor){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.redstone_ingot), new Object[] {
					"ddd",
					"ddd",
						Character.valueOf('d'), Items.REDSTONE
			});
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.redstone_helmet), new Object[] {
					"ddd",
					"d d",
						Character.valueOf('d'), TechItems.redstone_ingot
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.redstone_chestplate), new Object[] {
					"d d",
					"ddd",
					"ddd",
						Character.valueOf('d'), TechItems.redstone_ingot
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.redstone_leggings), new Object[] {
					"ddd",
					"d d",
					"d d",
						Character.valueOf('d'), TechItems.redstone_ingot
			});
			
		   	RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.redstone_boots), new Object[] {
					"d d",
					"d d",
						Character.valueOf('d'), TechItems.redstone_ingot
			});
		}
		
		if (ConfigHandler.quartz_armor){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.quartz_ingot), new Object[] {
					"ddd",
					"ddd",
						Character.valueOf('d'), Items.QUARTZ
			});
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.quartz_helmet), new Object[] {
					"ddd",
					"d d",
						Character.valueOf('d'), TechItems.quartz_ingot
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.quartz_chestplate), new Object[] {
					"d d",
					"ddd",
					"ddd",
						Character.valueOf('d'), TechItems.quartz_ingot
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.quartz_leggings), new Object[] {
					"ddd",
					"d d",
					"d d",
						Character.valueOf('d'), TechItems.quartz_ingot
			});
			
		   	RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.quartz_boots), new Object[] {
					"d d",
					"d d",
						Character.valueOf('d'), TechItems.quartz_ingot
			});
		}
	}

}