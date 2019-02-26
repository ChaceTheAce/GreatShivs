package GoodShivs.powers;

import com.megacrit.cardcrawl.actions.common.ReducePowerAction;
import com.megacrit.cardcrawl.actions.utility.UseCardAction;
import com.megacrit.cardcrawl.cards.DamageInfo;
import com.megacrit.cardcrawl.cards.DamageInfo.DamageType;
import GoodShivs.patches.Enum;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.localization.PowerStrings;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import com.badlogic.gdx.graphics.Texture;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.core.*;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.powers.*;
import com.megacrit.cardcrawl.actions.utility.QueueCardAction;


import GoodShivs.GoodShivs;
import GoodShivs.powers.*;

public class OpenWound extends AbstractPower {
    public AbstractCreature source;

    public static final String POWER_ID = GoodShivs.makeID("OpenWound");
    private static final PowerStrings powerStrings = CardCrawlGame.languagePack.getPowerStrings(POWER_ID);
    public static final String NAME = powerStrings.NAME;
    public static final String[] DESCRIPTIONS = powerStrings.DESCRIPTIONS;
    public static final String IMG = GoodShivs.makePath(GoodShivs.OPEN_WOUND);
    public static Float BONUS_PERCENT = 25f;
    public static final Float ACC_BONUS = 25f;
    public static final Float BASE_BONUS = 25f;

    public OpenWound(final AbstractCreature owner,
                     final int amount) {
        this.name = NAME;
        this.ID = POWER_ID;
        this.owner = owner;
        this.amount = amount;
        this.updateDescription();
        this.type = PowerType.DEBUFF;
        this.isTurnBased = false;
        this.img = new Texture(IMG);
    }

    @Override
    public void updateDescription() {
        if(!this.owner.isPlayer && AbstractDungeon.player.hasPower("Accuracy")) {
            BONUS_PERCENT = BASE_BONUS + ACC_BONUS;
        }
        this.description = DESCRIPTIONS[0] +
                this.amount * Math.round(BONUS_PERCENT) +
                DESCRIPTIONS[1];
    }

    @Override
    public void onUseCard(AbstractCard card, UseCardAction action) {

        if(card.type == AbstractCard.CardType.ATTACK && !card.hasTag(Enum.SHIV ) && !card.hasTag(Enum.SALT)) {
            if (action.target == this.owner || card.target == AbstractCard.CardTarget.ALL_ENEMY) {
                AbstractDungeon.actionManager.addToBottom(
                        new ReducePowerAction(this.owner, this.owner, this.ID, this.amount));
            }
        }
    }

    @Override
    public float atDamageReceive(float damage, DamageInfo.DamageType type) {
        if (type != Enum.SHIV_DAMAGE) {
            if (type != Enum.SALT_DAMAGE) {
                damage = damage * (1 + this.amount * BONUS_PERCENT / 100);
            }
            else { damage = 2 * (this.amount); }
        }
        return damage;
    }
}
