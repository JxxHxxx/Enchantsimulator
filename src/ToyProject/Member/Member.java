package ToyProject.Member;

import ToyProject.Wear.Glove;
import ToyProject.Wear.Weapon;

public class Member {
    private String id = "";
    private Integer level = 1;

    // 착용 장비
    private Glove glove;
    private Weapon weapon;

    public Glove getGlove() {
        return glove;
    }

    public void setGlove(Glove glove) {
        this.glove = glove;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
