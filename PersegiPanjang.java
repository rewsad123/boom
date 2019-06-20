package bangundatar;

public class PersegiPanjang implements BangunDatar{
    PersegiPanjang(){}

    @Override
    public double luas(int s1, int s2) {
        double luas = s1*s2;
        return luas;
    }

    @Override
    public double keliling(int s1, int s2) {
        double keliling = 2*(s1+s2);
        return keliling;
    }
}
