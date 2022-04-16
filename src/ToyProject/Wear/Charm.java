package ToyProject.Wear;

import java.util.Random;

public class Charm extends Wear{

    public Charm(String name) {
        super(name);
    }

    @Override
    public void enchant() {
        Random random = new Random();
        int pos = ept.accessories_charm[getValue()];
        if (pos >= random.nextInt(100)) {
            value++;
        }
        else {
            value = 0;
        }
    }

    @Override
    void describe(int pM, int pB, int cnt, int success) {
        float n = cnt /(float) success;
        Integer makePrice = (int) n * pM;
        System.out.printf("평균적으로 %f번 시도해야합니다.%n", n);
        System.out.printf("기대 비용 %d%n", makePrice);
    }
}
