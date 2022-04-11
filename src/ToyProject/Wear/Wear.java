package ToyProject.Wear;

import ToyProject.EnchantPercentageTable;

import java.util.Random;

public class Wear implements Enchantable{
    private String name = "";
    protected Integer value = 0;

    EnchantPercentageTable ept = EnchantPercentageTable.getInstance();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public void enchant() {
        Random random = new Random();

        // pos = probability of success
        int pos = ept.armor[getValue()];

        // 성공확률보다 작은 수가 나온다면 강화는 성공해야함 , 실패시 수치 초기화
        if (pos >= random.nextInt(100)) {
            value++;
        }
        else {
            value = 0;
        }
    }

    public void makeOrBuy(int target, int pM, int pB) {
        int cnt = 1, success = 0;
        while (success != 100) {
            enchant();
            if (getValue() == 0) {
                cnt++;
            }
            if (getValue() == target) {
                success++;
                value = 0;
            }
        }
        describe(pM, pB, cnt, success);
    }

    private void describe(int pM, int pB, int cnt, int success) {
        float n = cnt /(float) success;
        int makePrice = (int) n * pM;
        System.out.println(String.format("평균적으로 %f번 시도해야합니다.", n));

        if (pB < makePrice) {
            System.out.println(String.format("경매장에서 사는게 %d 다이아 이득입니다.", makePrice - pB));
        } else {
            System.out.println(String.format("직접 만드는게 %d 다이아 이득입니다.", pB - makePrice));

        }
    }
}
