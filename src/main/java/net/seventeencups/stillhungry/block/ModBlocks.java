package net.seventeencups.stillhungry.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.seventeencups.stillhungry.StillHungry;
import net.seventeencups.stillhungry.reference.Strings;

/**
* Still-Hungry
*
* ModBlocks
*
* @author 17cupsofcoffee
* @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
*
*/

public class ModBlocks {

    public static Block hedge;
    public static Block roseHedge;
    public static Block daffodilHedge;
    public static Block riceBlock;
    public static Block strawberryBlock;
    public static Block stoveBlock;
    public static Block stoveBlockBurning;
    public static Block brewingBarrel;
    //public static Block bananaBlock;
    public static Block grapeBlock;

    public static void init() {
        hedge = new BlockHedge().setHardness(0.25f)
                .setStepSound(Block.soundTypeGrass)
                .setBlockName("hedge")
                .setCreativeTab(StillHungry.tabStillHungry);

        roseHedge = new BlockHedge()
                .setHardness(0.25f)
                .setStepSound(Block.soundTypeGrass)
                .setBlockName("roseHedge")
                .setCreativeTab(StillHungry.tabStillHungry);

        daffodilHedge = new BlockHedge()
                .setHardness(0.25f)
                .setStepSound(Block.soundTypeGrass)
                .setBlockName("daffodilHedge")
                .setCreativeTab(StillHungry.tabStillHungry);

        riceBlock = new BlockRice()
                .setHardness(0.0f)
                .setStepSound(Block.soundTypeGrass)
                .setBlockName("riceBlock");

        strawberryBlock = new BlockStrawberry()
                .setHardness(0.0f)
                .setStepSound(Block.soundTypeGrass)
                .setBlockName("strawberryBlock");

        stoveBlock = new BlockStove(false);

        stoveBlockBurning = new BlockStove(true)
                .setLightLevel(0.875F)
                .setCreativeTab(null);

        brewingBarrel = new BlockBarrel()
                .setCreativeTab(StillHungry.tabStillHungry)
                .setBlockName("brewingBarrel");

        grapeBlock = new BlockGrape()
                .setHardness(0.0f)
                .setStepSound(Block.soundTypeGrass)
                .setBlockName("grapeBlock");

        GameRegistry.registerBlock(hedge, Strings.HEDGE_NAME);
        GameRegistry.registerBlock(roseHedge, Strings.ROSEHEDGE_NAME);
        GameRegistry.registerBlock(daffodilHedge, Strings.DAFFODILHEDGE_NAME);

        GameRegistry.registerBlock(riceBlock, Strings.RICEBLOCK_NAME);
        GameRegistry.registerBlock(strawberryBlock, Strings.STRAWBERRYBLOCK_NAME);

        GameRegistry.registerBlock(stoveBlock, Strings.STOVEBLOCK_NAME);
        GameRegistry.registerBlock(stoveBlockBurning, Strings.STOVEBLOCKBURNING_NAME);

        GameRegistry.registerBlock(brewingBarrel, Strings.BREWINGBARREL_NAME);

        GameRegistry.registerBlock(grapeBlock, Strings.GRAPEBLOCK_NAME);

        initBlockRecipes();

        initLanguages();
    }

    private static void initBlockRecipes() {
        ItemStack hedgeStack = new ItemStack(hedge);
        ItemStack leavesStack = new ItemStack(Blocks.leaves, 1, -1);

        GameRegistry.addRecipe(new ItemStack(stoveBlock), "iii", "s s", "sss",
                'i', new ItemStack(Items.iron_ingot), 's', new ItemStack(Blocks.stone));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(brewingBarrel), "www", "iii", "www",
                'w', "plankWood", 'i', new ItemStack(Items.iron_ingot)));

        GameRegistry.addRecipe(hedgeStack, "ll", "ll", 'l', leavesStack);
        GameRegistry.addShapelessRecipe(new ItemStack(roseHedge), hedgeStack, new ItemStack(Blocks.red_flower));
        GameRegistry.addShapelessRecipe(new ItemStack(daffodilHedge), hedgeStack, new ItemStack(Blocks.yellow_flower));
    }

    private static void initLanguages() {
//        LanguageRegistry.addName(hedge, "Hedge");
//        MinecraftForge.setBlockHarvestLevel(hedge, "axe", 0);
//
//        LanguageRegistry.addName(roseHedge, "Flowered Hedge");
//        MinecraftForge.setBlockHarvestLevel(roseHedge, "axe", 0);
//
//        LanguageRegistry.addName(daffodilHedge, "Flowered Hedge");
//        MinecraftForge.setBlockHarvestLevel(daffodilHedge, "axe", 0);
//
//        LanguageRegistry.addName(riceBlock, "Rice");
//
//        LanguageRegistry.addName(strawberryBlock, "Strawberry");
//
//        LanguageRegistry.addName(stoveBlock, "Stove");
//
//        LanguageRegistry.addName(brewingBarrel, "Barrel");
//
//        //LanguageRegistry.addName(bananaBlock, "Banana Bunch");
//
//        LanguageRegistry.addName(grapeBlock, "Grape Vine");
    }
}
