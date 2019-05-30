import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int х;
        System.out.println("Введите левое значение диапазона x:");
        int a = sc.nextInt();
        System.out.println("Спасибо, вы ввели число:" +a);
        System.out.println("Введите правое значение диапазона x:");
        int b = sc.nextInt();
        System.out.println("Спасибо, вы ввели число:" +b);
        System.out.println("Введите левое значение диапазона y:");
        int k = sc.nextInt();
        System.out.println("Спасибо, вы ввели число:" +k);
        System.out.println("Введите правое значение диапазона y:");
        int m = sc.nextInt();
        System.out.println("Спасибо, вы ввели число:" +m);
        int count;
        System.out.println("Введите левое значение диапазона r(r>0):");
        boolean f = false; int c=0;
        while (f==false) {
            c = sc.nextInt();
            if (c < 0) {
                System.out.println("Пожалуйста введите корректное число");
            } else {f=true;}
        }
        System.out.println("Спасибо, вы ввели число:" +c);
        System.out.println("Введите правое значение диапазона r:");
        int d = sc.nextInt();
        System.out.println("Спасибо, вы ввели число:" +d);
        System.out.println("Введите количество кругов: ");
        count = sc.nextInt();
        int [][] circles = new int[count][3];
        for(int i=0;i<count;i++) {
            circles[i][0] =(int) (Math.random() * (b - a)) + a;//x
            circles[i][1] =(int) (Math.random() * (m - k)) + k;//y
            circles[i][2] =(int) (Math.random() * (d - c)) + c;//r
        }
        for(int i=0; i<count;i++)
        {
            System.out.print("(");
                for(int j=0; j<3; j++)
                {
                    System.out.print(circles[i][j]+", ");
                }
            System.out.println(")");
        }
        int x_max=-9999999, x_min=9999999, y_max=-9999999, y_min=9999999;
        for(int i=0;i<count; i++)
        {
            if(circles[i][0] + circles[i][2]>x_max){ x_max=circles[i][0] + circles[i][2];}
            if(circles[i][0] - circles[i][2]<x_min){ x_min=circles[i][0] - circles[i][2];}
            if(circles[i][1] + circles[i][2]>y_max){ y_max=circles[i][1] + circles[i][2];}
            if(circles[i][1] - circles[i][2]<y_min){ y_min=circles[i][1] - circles[i][2];}
        }
        int weight,hight;
        weight = Math.abs(x_max - x_min) ;
        hight =  Math.abs(y_max - y_min);
        System.out.println("Длина прямоугольника, описывающего окружности: " + weight);
        System.out.println("Высота прямоугольника, описывающего окружности: " + hight);
    }
}
