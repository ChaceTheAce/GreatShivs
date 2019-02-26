package GoodShivs.patches;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.core.AbstractCreature;
import com.megacrit.cardcrawl.powers.AbstractPower;
import com.megacrit.cardcrawl.powers.AccuracyPower;

@SpirePatch(clz = AccuracyPower.class, method = "onDrawOrDiscard")
public class powerAccuracyPatch2 {
    public static void Replace(AccuracyPower __instance)
    {
        System.out.println("Nice try guy");
    }

}
