public class Task2 {
    public static void main(String[] args) {
        int[] price = new int[] {5, 100, 20, 66, 16};
        int discount = 50;
        int offset = 1;
        int readLength = 3;

        int[] newPrice = decryptData(price, discount, offset, readLength);

        for (int i : newPrice) System.out.print(i + " ");
    }

    public static int[] decryptData(int[] price, int discount, int offset, int readLength) {
        int[] newPrice = new int[readLength];

        int u = 0;
        for(int i = offset; i < offset + readLength; i++) {
            newPrice[u] = (int) (price[i] * ((float) discount / 100));
            u++;
        }

        return newPrice;
    }
}
