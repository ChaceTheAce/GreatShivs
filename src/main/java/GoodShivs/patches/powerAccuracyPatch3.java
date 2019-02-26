package GoodShivs.patches;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.core.AbstractCreature;
import com.megacrit.cardcrawl.powers.AbstractPower;
import com.megacrit.cardcrawl.powers.AccuracyPower;

@SpirePatch(clz = AccuracyPower.class, method = "updateExistingShivs")
public class powerAccuracyPatch3 {
    public static void Replace(AccuracyPower __instance)
    {
        System.out.println("Nice try guy");
    }

}
