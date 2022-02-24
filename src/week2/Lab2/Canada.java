package week2.Lab2;

import static week2.Lab2.Province.*;

public class Canada {
    private Province[] provinces;

    public Canada() {
        final int NumberProvinceCanada = 10;
        provinces = new Province[NumberProvinceCanada];
        provinces[0] = new Province(PROVINCE_AB, CAPITAL_AB, POPULATION_AB);
        provinces[1] = new Province(PROVINCE_BC, CAPITAL_BC, POPULATION_BC);
        provinces[2] = new Province(PROVINCE_MB, CAPITAL_MB, POPULATION_MB);
        provinces[3] = new Province(PROVINCE_NB, CAPITAL_NB, POPULATION_NB);
        provinces[4] = new Province(PROVINCE_NL, CAPITAL_NL, POPULATION_NL);
        provinces[5] = new Province(PROVINCE_NS, CAPITAL_NS, POPULATION_NS);
        provinces[6] = new Province(PROVINCE_ON, CAPITAL_ON, POPULATION_ON);
        provinces[7] = new Province(PROVINCE_PE, CAPITAL_PE, POPULATION_PE);
        provinces[8] = new Province(PROVINCE_QC, CAPITAL_QC, POPULATION_QC);
        provinces[9] = new Province(PROVINCE_SK, CAPITAL_SK, POPULATION_SK);
    }

    public void displayAllProvinces() {
        for (Province elm : provinces) {
            System.out.println(elm.getDetails());
        }
    }

    public int getNumOfProvincesBetween(int min_million, int max_million) {
        int ret = 0;
        final int million = 1000000;
        for (Province elm : provinces) {
            if (min_million * million <= elm.getPopulation() &&
                    elm.getPopulation() <= max_million * million) {
                ret++;
            }
        }
        return ret;
    }


}
