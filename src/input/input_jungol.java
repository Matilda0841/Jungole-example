package src.input;

import java.util.Scanner;

public class input_jungol {
    public static void main(String[] args) {
//        509
//        정수형 변수를 선언하고 -100을 대입하여 출력하는 프로그램을 작성하라.
        int num1 = -100;
        System.out.println(num1);
        System.out.println();

//        510
//        정수형 변수 2개를 선언하여 -1과 100을 대입한 후 아래와 같이 출력하는 프로그램을 작성하라.
        int num2 = -1;
        int num3 = 100;

        System.out.println(num2);
        System.out.println(num3);
        System.out.println();

//        511
//        두 개의 정수형 변수를 선언하고 값을 대입하여 아래와 같이 출력되는 프로그램을 작성하라.
//        55 - 10 = 45
//        2008 - 1999 = 9
        int num4 = 55-10;
        int num5 = 2008-1999;

        System.out.println("55 - 10 = "+num4);
        System.out.println("2008 - 1999 = "+num5);
        System.out.println();

//        512
//        추의 무게를 저장할 변수와 중력의 비율을 저장할 변수를 선언하고,
//        다음 두 값을 변수에 저장하여 곱셈 계산식을 출력하는 프로그램을 작성하라.
//        추의 무게 = 49, 중력의 비율 = 0.2683
        int num6 = 49;
        double num7 = 0.2683;

        System.out.printf("%d * %.6f = %.6f",num6,num7,num6*num7);
        System.out.println();

//        513
//        1야드(yd)는 91.44cm이고 1인치(in)는 2.54cm이다.
//        2.1야드와 10.5인치를 각각 cm로 변환하여 다음 형식에 맞추어 소수 첫째자리까지 출력하시오.
        float yd = 91.44f;
        float in = 2.54f;

        System.out.print(" 2.1yd = "+Math.round(2.1*yd*10)/10.0+"cm\n");
        System.out.print("10.5in =  "+Math.round(10.5*in*10)/10.0+"cm");
        System.out.println();

//        514
//        키를 입력받아 출력하는 프로그램을 작성하라.
//        (입력할때 "height = " 문장을 먼저 출력하고 키를 입력 받아야 합니다.)
//        height = 170
//        Your height is 170cm.
        Scanner sc = new Scanner(System.in);

        System.out.print("height = ");
        int num8 =sc.nextInt();
        System.out.printf("Your height is %dcm.", num8);
        System.out.println();

//       515
//       두 개의 정수를 입력 받아 곱과 몫을 출력하시오.
//       (먼저 입력 받는 수가 항상 크며 입력되는 두 정수는 1이상 500이하이다.)
//        16 5
//        16 * 5 = 80
//        16 / 5 = 3
        int num9 = sc.nextInt();
        int num10 = sc.nextInt();

        System.out.println(num9+" * "+num10+" = " +(num9*num10));
        System.out.println(num9+" / "+num10+" = " +(num9/num10));
        System.out.println();

//        516
//        실수 2개와 한 개의 문자를 입력 받아 출력하되 실수는 반올림하여
//        소수 둘째자리까지 출력하는 프로그램을작성하시오.
//        (C, C++, Java 의 경우 실수는 "double"로 선언하세요.)
//        12.2536
//        526.129535
//        A
//        12.25
//        526.13
//        A
        double num11 = sc.nextDouble();
        double num12 = sc.nextDouble();
        char chr1 = sc.next().charAt(0);

        System.out.printf("%.2f\n",num11);
        System.out.printf("%.2f\n",num12);
        System.out.println(chr1);
        System.out.println();

//        517
//        세 개의 실수를 입력 받아 반올림하여 소수 셋째 자리까지
//        출력하는 프로그램을 작성하시오.
//        1.2568
//        95.21438
//        526.851364
//        1.257
//        95.214
//        526.851
        double do1 = sc.nextDouble();
        double do2 = sc.nextDouble();
        double do3 = sc.nextDouble();

        System.out.printf("%.3f\n",do1);
        System.out.printf("%.3f\n",do2);
        System.out.printf("%.3f\n",do3);
        System.out.println();

//        106
//        세 개의 정수형 변수를 선언하고 각 변수에 10 20 30을 대입한 후 그 변수를
//        이용하여 출력 예와 같이 출력하는 프로그램을 작성하시오.
        int num13 = 10;
        int num14 = 20;
        int num15 = 30;

        System.out.println(num13+" + "+num14+" = "+num15);
        System.out.println();

//        107
//        실수형 변수를 2개 선언한 후 각각에 80.5 22.34를 대입한 후 두 수의 합을 구하여
//        각각의 숫자를 10칸씩 오른쪽에 맞추어 소수 둘째자리까지 출력하는 프로그램을 작성하시오.
        double do4 = 80.50;
        double do5 = 22.34;
        double sum = do4+do5;
        System.out.printf("%10.2f%10.2f%10.2f",do4,do5,sum);
        System.out.println();

//        108
//        정수형 변수 한 개를 선언하여 50을 대입하고 실수형 변수 한 개를 선언하여
//        100.12를 대입한 후 다음과 같이 출력되는 프로그램을 작성하시오.
//        (결과값은 소수점 이하에서 반올림)
        int num16 = 50;
        double do6 = 100.12;
        double multi = num16*do6;

        System.out.printf("%.2f * %d = %.0f", do6,num16,multi);
        System.out.println();

//        109
//        세 개의 정수를 입력받아 합을 출력하는 프로그램을 작성하시오.
//        (자기주도 C언어 10판에 맞게 수정하였습니다.)
//        20 50 100
//        sum = 170
        int num17 = sc.nextInt();
        int num18 = sc.nextInt();
        int num19 = sc.nextInt();
        System.out.println("sum = "+(num17+num18+num19));
        System.out.println();

//        110
//        실수의 yard(야드)를 입력받아 cm(센티미터)로 환산하여 입력값과 환산한
//        값을 출력 예와 같이 소수 둘째자리에서 반올림하여 첫째자리까지 출력하는 프로그램을 작성하시오. (단 1야드 = 91.44cm로 한다.)
//        입력은 "yard? "라고 먼저 출력하고, 실수를 입력받는다.
//        실수는 "double"로 한다.
        double yard = 91.44;
        System.out.print("yard? ");
        double do7 = sc.nextDouble();
        System.out.printf("%.1fyard = %.1fcm", do7,do7*yard);
    }
}
