public class que1 {
    public static void main(String[] args) {
        int number = 3;

        switch (number) {

            case 1:
                System.out.println(" unary operators of java");
                int x = 5;
                int y=5;
                System.out.println(x++);
                System.out.println(++x);
                System.out.println(--x);
                System.out.println(x--);
                System.out.println(++x + x++);
                int min = (x<y) ? x:y;
        
                System.out.println(min);

                break;

            case 2:
              System.out.println("Shift operators of java");
              System.out.println(10<<2);
              System.out.println(10<<3);
              System.out.println(10<<2);
              System.out.println(10<<4);
                break;

            case 3:
            System.out.println("Data type in java");
            System.out.println("For an Integer : ");
        System.out.println("Size is : " + Integer.SIZE);

        int i1 = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;

        System.out.println("Max value is : " + i1);
        System.out.println("Min value is : " + i2);
        System.out.println("------------------------");

        //Byte
        System.out.println("For a Byte : ");
        System.out.println("Size is : " + Byte.SIZE);

        byte b1 = Byte.MAX_VALUE;
        byte b2 = Byte.MIN_VALUE;

        System.out.println("Max value is : " + b1);
        System.out.println("Min value is : " + b2);
        System.out.println("------------------------");

        //Short
        System.out.println("For a Short : ");
        System.out.println("Size is : " + Short.SIZE);

        short s1 = Short.MAX_VALUE;
        short s2 = Short.MIN_VALUE;

        System.out.println("Max value is : " + s1);
        System.out.println("Min value is : " + s2);
        System.out.println("------------------------");

        //Long
        System.out.println("For a Long : ");
        System.out.println("Size is : " + Long.SIZE);

        long l1 = Long.MAX_VALUE;
        long l2 = Long.MIN_VALUE;

        System.out.println("Max value is : " + l1);
        System.out.println("Min value is : " + l2);
        System.out.println("------------------------");


                break;

        }

    }
}