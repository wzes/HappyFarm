package com.haveacupofjava.happyfarm.field;

import com.haveacupofjava.happyfarm.creature.AbstractCreature;
import com.haveacupofjava.happyfarm.visitor.AbstractFieldVisitor;

import java.io.Serializable;

/**
  * Class AbstractField
  * Abstract Field
  * @author Yiqun Lin
  */
public abstract class AbstractField extends AbstractFieldComponent implements Serializable {

    protected AbstractFieldDecorator decorator;

    // TODO
    /*
     * a container for creature
     */
    public void resetDecoratorHead(AbstractFieldDecorator decorator) {
        this.decorator = decorator;
    }

    public AbstractFieldComponent getDecoratorHead() {
        if (this.decorator == null) {
            return this;
        }

        return this.decorator;
    }

    public void showField() {
        this.decorator.show();
    }

    @Override
    public abstract void show();

    /**
     * Accepts the visitor
     * @param visitor The visitor
     */
    public abstract void acceptVisitor(AbstractFieldVisitor visitor);

    /**
     * Returns true if the creature type matches this field
     * @param clazz The class of the creature
     * @return True if the creature type matches this field
     */
    public abstract boolean isCreatureMatch(Class clazz);

    /**
     * Returns the capacity of this field
     * @return The capacity of this field
     */
    public abstract int getCapacity();

    /**
     * Returns the number of the creature in this field
     * @return The number of the creature in this field
     */
    public abstract int creatureCount();

}
