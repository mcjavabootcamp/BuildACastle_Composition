package com.company;

public class Castle { // this is our blueprint
    private Gold gold;
    private MagnaCarta magnaCarta;
    private Princess princess;

    public Castle(){
        gold = new Gold();
        magnaCarta = new MagnaCarta();
        princess = new Princess();

    }

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }

    public MagnaCarta getMagnaCarta() {
        return magnaCarta;
    }

    public void setMagnaCarta(MagnaCarta magnaCarta) {
        this.magnaCarta = magnaCarta;
    }

    public Princess getPrincess() {
        return princess;
    }

    public void setPrincess(Princess princess) {
        this.princess = princess;
    }

    public void callTheCalvary(){

    }

    public void bringHorse(){

    };

    public void bringShield(){

    };

    public void bringMoreWeapon(){

    };

}
