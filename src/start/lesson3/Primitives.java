package start.lesson3;

public class Primitives {
    public static void main(String[] args) {
        boolean answer = true;
        boolean answer2 = false;

        byte maxByte = 127; //1 бит
        byte minByte = -128;

        short minShort = 32_767; // 2 бита
        short maxShort = -32_768;

        int minInt = -2_147_483_648; //4 байта или 32 бита
        int maxInt = 2_147_483_647;

        long minLong = -9_223_372_036_854_775_808L; //8 байт или 64 бита
        long maxLong = 9_223_372_036_854_775_807L;

        double myBottle = 1.5; // 64 бита

        float cola = 0.33F; //32 бита

        char letter = 'a';
        System.out.println(letter);

    }
}
