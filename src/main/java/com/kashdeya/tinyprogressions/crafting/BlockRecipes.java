package com.kashdeya.tinyprogressions.crafting;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.properties.EnumDustColor;
import com.kashdeya.tinyprogressions.properties.EnumGlowstoneColor;
import com.kashdeya.tinyprogressions.properties.EnumLampColor;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRecipes {
	
	public static void init() {
		// Stone Torch
		if (ConfigHandler.StoneTorch) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.stone_stick, 4), new Object[] {
					"c",
					"c",
						Character.valueOf('c'), "cobblestone"
			});
		}
		
		// Growth Crystals
		if (ConfigHandler.BlockGrowth) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.growth_block), new Object[] {
					"ibi",
					"ded",
					"ibi",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('b'), "blockBone",
						Character.valueOf('d'), "blockGlassDirty",
						Character.valueOf('e'), Blocks.SEA_LANTERN
			});
		}
		if (ConfigHandler.BlockGrowthUpgrade && ConfigHandler.WateringCanUpgrade && ConfigHandler.BlockGrowth && ConfigHandler.NetherStarBlock) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.growth_upgrade), new Object[] {
					"cwc",
					"ses",
					"cnc",
						Character.valueOf('c'), "blockReinforcedObsidian",
						Character.valueOf('w'), TechItems.watering_can_upgrade,
						Character.valueOf('s'), Items.END_CRYSTAL,
						Character.valueOf('e'), TechBlocks.growth_block,
						Character.valueOf('n'), TechBlocks.netherstar_block
			});
		}
		if (ConfigHandler.BlockGrowthUpgradeTwo && ConfigHandler.BlockGrowthUpgrade) {
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechBlocks.growth_upgrade_two), new Object[] {
					TechBlocks.growth_upgrade, Blocks.DRAGON_EGG
			});
		}
		
		// Cobble Generators
		if (ConfigHandler.Cobblegen) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.cobblegen_block), new Object[] {
					"ccc",
					"wgl",
					"ccc",
						Character.valueOf('c'), "cobblestone",
						Character.valueOf('w'), Items.WATER_BUCKET,
						Character.valueOf('l'), Items.LAVA_BUCKET,
						Character.valueOf('g'), "blockGlass"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.cobblegen_block), new Object[] {
					"ccc",
					"lgw",
					"ccc",
						Character.valueOf('c'), "cobblestone",
						Character.valueOf('w'), Items.WATER_BUCKET,
						Character.valueOf('l'), Items.LAVA_BUCKET,
						Character.valueOf('g'), "blockGlass"
			});
		}
		if (ConfigHandler.IronCobblegen && ConfigHandler.Cobblegen) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.iron_cobblegen_block), new Object[] {
					"iii",
					"igi",
					"iii",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('g'), TechBlocks.cobblegen_block
			});
		}
		if (ConfigHandler.DiamondCobblegen && ConfigHandler.IronCobblegen) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.diamond_cobblegen_block), new Object[] {
					"ddd",
					"did",
					"ddd",
						Character.valueOf('d'), "gemDiamond",
						Character.valueOf('i'), TechBlocks.iron_cobblegen_block
			});
		}
		if (ConfigHandler.BlazeCobblegen && ConfigHandler.DiamondCobblegen) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.blaze_cobblegen_block), new Object[] {
					"bbb",
					"bdb",
					"bbb",
						Character.valueOf('b'), Items.BLAZE_ROD,
						Character.valueOf('d'), TechBlocks.diamond_cobblegen_block
			});
		}
		if (ConfigHandler.EmeraldCobblegen && ConfigHandler.BlazeCobblegen) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.emerald_cobblegen_block), new Object[] {
					"eee",
					"ebe",
					"eee",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('b'), TechBlocks.blaze_cobblegen_block
			});
		}

		// Stone Torch
		if (ConfigHandler.StoneTorch) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.stone_torch, 4), new Object[] {
					"c",
					"s",
						Character.valueOf('c'), new ItemStack(Items.COAL,1,0),
						Character.valueOf('s'), "stickStone"
			});
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.stone_torch, 4), new Object[] {
					"c",
					"s",
						Character.valueOf('c'), new ItemStack(Items.COAL,1,1),
						Character.valueOf('s'), "stickStone"
			});
		}
		
		// Reinforced Blocks
		if (ConfigHandler.ReinforcedGlass) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.reinforced_glass, 4), new Object[] {
					"ogo",
					"gog",
					"ogo",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('g'), "blockGlassDirty"
			});
		}
		if (ConfigHandler.ReinforcedObsidian) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.reinforced_obsidian, 4), new Object[] {
					"ioi",
					"oio",
					"ioi",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('i'), Blocks.IRON_BARS
			});
		}
		
		// Dirty Glass
		if (ConfigHandler.DirtyGlass) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.dirty_glass, 4), new Object[] {
					"sgs",
					"gsg",
					"sgs",
						Character.valueOf('g'), "blockGlass",
						Character.valueOf('s'), Blocks.SOUL_SAND
			});
		}

		// Compressed Blocks
		if (ConfigHandler.FleshBlock) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.flesh_block), new Object[] {
					"rrr",
					"rrr",
					"rrr",
						Character.valueOf('r'), Items.ROTTEN_FLESH
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH, 9), new Object[] {
					TechBlocks.flesh_block
			});
		}
		if (ConfigHandler.BoneBlock) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.bone_block), new Object[] {
					"bbb",
					"bbb",
					"bbb",
						Character.valueOf('b'), "bone"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(Items.BONE, 9), new Object[] {
					TechBlocks.bone_block
			});
		}
		if (ConfigHandler.NetherStarBlock) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.netherstar_block), new Object[] {
					"nnn",
					"nnn",
					"nnn",
						Character.valueOf('n'), Items.NETHER_STAR
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(Items.NETHER_STAR, 9), new Object[] {
					TechBlocks.netherstar_block
			});
		}
		if (ConfigHandler.FlintBlock) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.flint_block), new Object[] {
					"fff",
					"fff",
					"fff",
						Character.valueOf('f'), "flint"
			});
					
			RecipeRegistry.addShapelessRecipe(new ItemStack(Items.FLINT, 9), new Object[] {
					TechBlocks.flint_block
			});
		}
		if (ConfigHandler.CharcoalBlock) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.charcoal_block), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), new ItemStack(Items.COAL, 1, 1)
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(Items.COAL, 9, 1), new Object[] {
					TechBlocks.charcoal_block
			});
		}
		
		// Vanilla Bricks
		if (ConfigHandler.DioriteBrick) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.diorite_brick, 4), new Object[] {
					"ss",
					"ss",
						Character.valueOf('s'), "stoneDioritePolished"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 4, 4), new Object[] {
					TechBlocks.diorite_brick
			});
		}
		if (ConfigHandler.GraniteBrick) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.granite_brick, 4), new Object[] {
					"ss",
					"ss",
						Character.valueOf('s'), "stoneGranitePolished"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 4, 2), new Object[] {
					TechBlocks.granite_brick
			});
		}
		if (ConfigHandler.AndesiteBrick) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.andesite_brick, 4), new Object[] {
					"ss",
					"ss",
						Character.valueOf('s'), "stoneAndesitePolished"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 4, 6), new Object[] {
					TechBlocks.andesite_brick
			});
		}

		// Smooth EndStone
		if (ConfigHandler.SmoothEndStone) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.smooth_endstone, 4), new Object[] {
					"ee",
					"ee",
						Character.valueOf('e'), Blocks.END_STONE
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(Blocks.END_BRICKS, 4), new Object[] {
					"ee",
					"ee",
						Character.valueOf('e'), "smoothEndstone"
			});
		}
		
		// Hardened Stone
		if (ConfigHandler.hardened_stone) {
			GameRegistry.addSmelting(new ItemStack(Blocks.STONE, 1, 0), new ItemStack(TechBlocks.hardened_stone), 1.0F);
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_bricks), new Object[] {
		            "ss",
		            "ss",
		                Character.valueOf('s'), TechBlocks.hardened_stone
		    });
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_smallbricks), new Object[] {
		            "ss",
		            "ss",
		                Character.valueOf('s'), TechBlocks.hardened_stone_bricks
		    });
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_stairs, 4), new Object[] {
			        "  s",
			        " ss",
			        "sss",
			            Character.valueOf('s'), TechBlocks.hardened_stone
			});
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_bricks_stairs, 4), new Object[] {
                    "  s",
                    " ss",
                    "sss",
                        Character.valueOf('s'), TechBlocks.hardened_stone_bricks
            });
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_smallbricks_stairs, 4), new Object[] {
                    "  s",
                    " ss",
                    "sss",
                        Character.valueOf('s'), TechBlocks.hardened_stone_smallbricks
            });
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_slab_half, 6), new Object[] {
			  "sss",
			      Character.valueOf('s'), TechBlocks.hardened_stone
			});
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_bricks_slab_half, 6), new Object[] {
		              "sss",
		                  Character.valueOf('s'), TechBlocks.hardened_stone_bricks
		            });
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_smallbricks_slab_half, 6), new Object[] {
		              "sss",
		                  Character.valueOf('s'), TechBlocks.hardened_stone_smallbricks
		            });
		}
		
		// Floaty Block
		if (ConfigHandler.angel_block) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.fmf_block), new Object[] {
		            "ifi",
		            "fif",
		            "ifi",
		                Character.valueOf('i'), "ingotIron",
		                Character.valueOf('f'), "feather"
		    });
		}
		
		// Glowstone Dust
		if (ConfigHandler.ColorGlowstone){
			for(int i = 0; i < EnumGlowstoneColor.values().length; i++)
			{
				RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.colored_glowstone, 1, i), new Object[] {
						"dd",
						"dd",
							Character.valueOf('d'), EnumDustColor.values()[i].getOredict()
				});
			}
		}
		
		// Lamps
		if (ConfigHandler.ColorLamps){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.lamp), new Object[] {
					"dt",
						Character.valueOf('d'), "blockGlassColorless",
						Character.valueOf('t'), "torch"
			});
			
			for(int i = 0; i < EnumLampColor.values().length; i++)
			{
				RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.colored_lamp, 1, i), new Object[] {
						"dt",
							Character.valueOf('d'), new ItemStack(Blocks.STAINED_GLASS, 1, i),
							Character.valueOf('t'), "torch"
				});
			}
		}
	}
}