package week0.day1;

public class operator {
    public static void main(String[] args) {
        /*
         * comparison= it gives output as boolean (t/f)
         * logical operators = and ,or ,nor
         * if(a>b && a>10)
         * if(!(a>b && a>10))- ! it reverses the output.
         * arthematic operator
         * x-=3; x=x-3
         * x+=3;x=x+3
         * homework = bitwise operator-&,/,^,>>,<<
         * 
         *      
         */
        int sum = 0;
        for (int i = 1; i <= 25; i++) {
            sum += i;
            System.out.print(sum + ", ");
        }

        int i = 5;
        while (i < 15) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }

}