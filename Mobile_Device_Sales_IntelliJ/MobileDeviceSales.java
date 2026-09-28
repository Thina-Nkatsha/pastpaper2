public class MobileDeviceSales
{
    public static void main(String[] args)
    {
        // Two dimensional array containing mobile device sales
        int[][] sales =
        {
            {30, 15, 35}, // IPhone 7
            {20, 25, 30}, // Samsung S8
            {25, 11, 32}  // Huawei Mate 10
        };

        // Display the mobile device sales report
        System.out.println("MOBILE DEVICE SALES REPORT");
        System.out.println("*******************************");
        System.out.println("                 JAN   FEB   MAR   TOTAL");
        System.out.println("IPhone 7         " + sales[0][0] + "    " + sales[0][1] + "    " + sales[0][2] + "     " + (sales[0][0] + sales[0][1] + sales[0][2]));
        System.out.println("Samsung S8       " + sales[1][0] + "    " + sales[1][1] + "    " + sales[1][2] + "     " + (sales[1][0] + sales[1][1] + sales[1][2]));
        System.out.println("Huawei Mate 10   " + sales[2][0] + "    " + sales[2][1] + "    " + sales[2][2] + "     " + (sales[2][0] + sales[2][1] + sales[2][2]));

        // Calculate monthly totals
        int januaryTotal = sales[0][0] + sales[1][0] + sales[2][0];
        int februaryTotal = sales[0][1] + sales[1][1] + sales[2][1];
        int marchTotal = sales[0][2] + sales[1][2] + sales[2][2];

        System.out.println("MONTHLY TOTAL     " + januaryTotal + "    " + februaryTotal + "    " + marchTotal);
    }
}
