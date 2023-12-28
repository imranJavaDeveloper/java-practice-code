
public  class Literal {
    public static void main(String[] args) {
        int x = 0XFaa; // hexa decimal number

        int a = 10;  // decimal number
        int b = 0256; // octal number
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        // jvm always give the value in decimal number
        int j = 10;   // decimal number output 10
        int k = 010;  // octal number output 8
        int l = 0X100; // Hexe decimal number output 16
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);

        /* how assign byte value and short value in literal type right
         *  byte value like this = byte b=10;
         *  byte value like this = byte c=127;
         *  byte value like this = byte d= 128 error provide int require byte(because over the rang
         *
         * short value like this = short s=32767;  goring to out of the range
         * short value like this = short d=32768 error provide int require short
         */

        /* floating point literal by default double
         * float f=455.24;  error provide double require float(how i assign double value in float)
         * float g=455.54f;  this is correct
         * double d=455.45;  this is correct
         *  */
        double d = 456633.55D;
        double kal = 4555555555.54d;
        System.out.println(kal);
        System.out.println(d);
        double nf = 1.2e3;
        System.out.println(nf);
        char ch = 1978;
        System.out.println(ch);

        // String literal  any sequence of character trated as String literal

        String name="md imran alam";
        System.out.println(name);
        byte ab=45;
        System.out.println(ab);
        short sb=32767;
        System.out.println(sb);
       // boolean blo=0;             error boolean can not convert into int
       // System.out.println(blo);

        char cha=97;
//        System.out.println(cha);  System.out.printf("%c",cha);  both will give the answer a


      int  fb=(int)345.5f;
        System.out.println(fb);

        int xb=0b1111;
        System.out.println(xb);



    }
}
