package com.haveacupofjava.happyfarm.room;

/**
 * @author Create by xuantang
 * @date on 10/29/17
 */
public class BrushDecoratorRoom extends AbstractRoom {

    private AbstractRoom abstractRoom;

    public BrushDecoratorRoom(AbstractRoom abstractRoom){
        this.abstractRoom = abstractRoom;
    }

    /**
     * Brush the room
     */
    @Override
    public void show() {
        super.show();
        brush();
    }

    /**
     * Brush the room
     */
    private void brush(){
        System.out.println("Brush the room");
    }

    @Override
    public void clean(String action) {
        super.clean(action);
    }
}
