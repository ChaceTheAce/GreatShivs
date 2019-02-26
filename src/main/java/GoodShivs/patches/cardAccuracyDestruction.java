package GoodShivs.patches;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.green.Accuracy;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.core.AbstractCreature;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import com.megacrit.cardcrawl.powers.AbstractPower;
import com.megacrit.cardcrawl.powers.AccuracyPower;

@SpirePatch(clz = Accuracy.class, method = "use")
public class cardAccuracyDestruction {
    public static void Replace(AccuracyPower __instance, AbstractPlayer p, AbstractMonster m)
    {
        System.out.println("I told you not to lmao");
    }

}
