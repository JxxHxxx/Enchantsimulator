package ToyProject;

import ToyProject.Member.Member;
import ToyProject.Wear.Glove;
import ToyProject.Wear.Weapon;
public class app {
    public static void main(String[] args) {
        Member m1 = new Member();
        Weapon weapon = new Weapon();
        weapon.setName("설원의 전곤 방패");
        Glove glove = new Glove();
        glove.setName("브로크의 장갑");


        m1.setWeapon(weapon);
        m1.setGlove(glove);
        m1.getWeapon().makeOrBuy(9, 10, 2100);
        m1.getGlove().makeOrBuy(7, 10, 2100);


    }
}
