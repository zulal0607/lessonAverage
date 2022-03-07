import java.util.Scanner;
public class lessonAverage {

    public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);

         int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.println("mat notunuz :");
        mat = inp.nextInt();

        System.out.println("fizik notunuz :");
        fizik = inp.nextInt();

        System.out.println("kimya notunuz :");
        kimya = inp.nextInt();

        System.out.println("turkce notunuz :");
        turkce = inp.nextInt();

        System.out.println("tarih notunuz :");
        tarih = inp.nextInt();

        System.out.println("müzik notunuz :");
        muzik = inp.nextInt();

        int ort = (mat+fizik+ kimya+turkce+tarih+muzik)/6;
        System.out.println("ortalamanız : " + ort );

        String condition = (ort <60) ? "kaldın" : "geçtin";
        System.out.println( condition);

    }
}
