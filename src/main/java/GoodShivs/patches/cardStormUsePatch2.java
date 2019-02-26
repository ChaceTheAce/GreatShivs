package GoodShivs.patches;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.green.StormOfSteel;

@SpirePatch(clz = StormOfSteel.class, method = "use")
public class cardStormUsePatch2 {
    public static void Prefix(StormOfSteel __instance) {
        System.out.println("=============Triggered BladeFuryAction.update===========");
    }
}