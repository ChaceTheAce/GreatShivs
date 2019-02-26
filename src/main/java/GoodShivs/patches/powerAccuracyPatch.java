package GoodShivs.patches;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.core.AbstractCreature;
import com.megacrit.cardcrawl.powers.AbstractPower;
import com.megacrit.cardcrawl.powers.AccuracyPower;

@SpirePatch(clz = AccuracyPower.class, method = SpirePatch.CONSTRUCTOR)
public class powerAccuracyPatch {
    public static void Postfix(AccuracyPower __instance, AbstractCreature owner, int amt)
    {
        __instance.name = AccuracyPower.NAME;
        __instance.ID = "Accuracy";

        __instance.owner = owner;
        __instance.amount = -1;

        __instance.description= (AccuracyPower.DESCRIPTIONS[0]);
    }

}
