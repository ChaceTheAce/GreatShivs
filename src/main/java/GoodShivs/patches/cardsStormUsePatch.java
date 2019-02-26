
package GoodShivs.patches;

import GoodShivs.powers.OpenWound;
import GoodShivs.cards.colorless.SaltTheWounds;
import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.actions.common.MakeTempCardInHandAction;;
import com.megacrit.cardcrawl.actions.unique.BladeFuryAction;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;

@SpirePatch(clz = BladeFuryAction.class, method = "update")
public class cardsStormUsePatch {
    @SpireInsertPatch(rloc=5)
    public static void Insert(BladeFuryAction __instance) {
        AbstractDungeon.actionManager.addToBottom(new MakeTempCardInHandAction(new SaltTheWounds()));
    }
}

