package GoodShivs;

import GoodShivs.cards.colorless.SaltTheWounds;
import GoodShivs.cards.green.Accuracy2;
import basemod.interfaces.*;
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import com.megacrit.cardcrawl.actions.common.MakeTempCardInHandAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.green.StormOfSteel;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.rooms.AbstractRoom;
import com.megacrit.cardcrawl.unlock.UnlockTracker;

import com.megacrit.cardcrawl.localization.PowerStrings;
import com.megacrit.cardcrawl.localization.CardStrings;
import basemod.BaseMod;


@SpireInitializer
public class GoodShivs implements
        EditCardsSubscriber,
        EditKeywordsSubscriber, EditStringsSubscriber {

    private static final String GOOD_SHIVS_ASSETS_FOLDER = "goodShivsResources/images";
    public static final String OPEN_WOUND = "powers/open_wound.png";
    public static final String SALT_THE_WOUNDS = "cards/salt_the_wounds.png";
    public static final String ACCURACY2 = "cards/accuracy2.png";

    public static final String makePath(String resource) {
        return GOOD_SHIVS_ASSETS_FOLDER + "/" + resource;
    }

    public GoodShivs(){
        BaseMod.subscribe(this);
    }

    public static void initialize() {
        new GoodShivs();
    }


    @Override
    public void receiveEditCards() {
        BaseMod.addCard(new SaltTheWounds());
        BaseMod.addCard(new Accuracy2());

        UnlockTracker.unlockCard(SaltTheWounds.ID);
        UnlockTracker.unlockCard(Accuracy2.ID);

//        BaseMod.removeCard("Accuracy", AbstractCard.CardColor.GREEN);

    }


//    @Override
//    public void receiveCardUsed(AbstractCard c){
//        if(c instanceof StormOfSteel) {
//            AbstractDungeon.actionManager.addToTop(new MakeTempCardInHandAction(new SaltTheWounds(), 1));
//
//        }
//    }

    // ================ /LOAD THE INFO/ ===================

    // this adds "ModName: " before the ID of any card/relic/power etc.
    // in order to avoid conflics if any other mod uses the same ID.
    public static String makeID(String idText) {
        return "GoodShivs: " + idText;
    }

    @Override
    public void receiveEditStrings() {
        BaseMod.loadCustomStringsFile(CardStrings.class,
                "goodShivsResources/localization/GoodShivs-Card-Strings.json");
        BaseMod.loadCustomStringsFile(PowerStrings.class,
                "goodShivsResources/localization/GoodShivs-Power-Strings.json");
    }

    @Override
    public void receiveEditKeywords() {
        final String[] wound_word = { "openwound", "openwounds" };
        BaseMod.addKeyword(wound_word, ("The next attack against an enemy with Open Wounds does extra damage per Open Wound"));
    }


}
