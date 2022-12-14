package main.player.cards.environment;

import fileio.CardInput;
import main.game.Table;

public final class Firestorm extends Environment {

    public Firestorm(final CardInput card) {
        super(card);
    }

    @Override
    public void castSpecialAbility(final int affectedRow) {
        for (int i = 0; i < Table.getInstance().getNumberOfColumns(); i++) {
            if (Table.getInstance().getCardMatrix()[affectedRow][i] != null) {
                int cardHealth = Table.getInstance().getCardMatrix()[affectedRow][i].getHealth();
                Table.getInstance().getCardMatrix()[affectedRow][i].setHealth(cardHealth - 1);
            }
        }
    }
}
