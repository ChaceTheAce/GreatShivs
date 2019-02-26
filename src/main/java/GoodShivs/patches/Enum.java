package GoodShivs.patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireEnum;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.DamageInfo;

public class Enum {
    @SpireEnum
    public static DamageInfo.DamageType SHIV_DAMAGE;
    @SpireEnum
    public static DamageInfo.DamageType SALT_DAMAGE;

    @SpireEnum
    public static AbstractCard.CardTags SHIV;
    @SpireEnum
    public static AbstractCard.CardTags SALT;
}
