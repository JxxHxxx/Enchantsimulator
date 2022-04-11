package ToyProject;

public class EnchantPercentageTable {

    private static final EnchantPercentageTable instance = new EnchantPercentageTable();

    public static EnchantPercentageTable getInstance() {
        return instance;
    }
    private EnchantPercentageTable() {

    }
    public int[] weapon = new int[] {100, 100, 100, 100, 100, 51, 28, 18, 13, 10, 9, 9, 9, 9, 9, 9, 8, 8, 8, 8};
    public int[] armor = new int[] {100, 100, 100, 100, 100, 42, 26, 18, 13, 10, 10, 10, 9, 9, 9, 9, 9, 9, 8 ,8};
    public int[] accessories = new int[] {100, 74, 40, 29, 23, 19, 15, 13, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8};
}