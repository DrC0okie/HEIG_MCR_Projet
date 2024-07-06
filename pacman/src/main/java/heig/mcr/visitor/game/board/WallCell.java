package heig.mcr.visitor.game.board;

import heig.mcr.visitor.board.Cell;
import heig.mcr.visitor.board.Entity;
import heig.mcr.visitor.window.sprite.DefaultSprite;
import heig.mcr.visitor.window.sprite.Sprite;

public class WallCell extends Cell {

    @Override
    public boolean isWalkableBy(Entity _any) {
        return false;
    }

    @Override
    public Sprite getSprite() {
        return new DefaultSprite();
    }
}