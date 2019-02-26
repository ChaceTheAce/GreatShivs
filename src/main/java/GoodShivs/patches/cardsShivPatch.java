package GoodShivs.patches;

import GoodShivs.patches.Enum;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.colorless.Shiv;

@SpirePatch(clz = Shiv.class, method = SpirePatch.CONSTRUCTOR)
public class cardsShivPatch {
    public static void Postfix(Shiv __instance) {
        __instance.baseDamage = 3;
        __instance.tags.add(Enum.SHIV);
        //__instance.damageTypeForTurn = Enum.SHIV_DAMAGE;

    }
}
