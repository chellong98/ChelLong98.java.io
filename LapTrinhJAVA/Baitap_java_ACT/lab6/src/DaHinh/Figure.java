/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaHinh;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Figure {

    Shape figure[] = new Shape[4];

    public Figure() {

    }

    public void veHinh() {
        Scanner sc = new Scanner(System.in);
        figure[0] = new Line();
        Line line = new Line(1, 2, 3, 4.4);
//        System.out.println("nhập LINE: ");
//        System.out.println("set góc quay: ");
//        line.setAngle(sc.nextInt());
//        System.out.println("set màu: ");
//        line.setcolor(sc.nextInt());
//        System.out.println("set độ dịch chuyển: ");
//        line.setPoint(sc.nextInt());
//        System.out.println("set độ dài: ");
//        line.setLength(sc.nextDouble());
        figure[0] = line;
        

        for (int i = 1; i < 3; i++) {
            System.out.println("nhập CIRCLE " + i + ':');
            figure[i] = new Circle();
            Circle circle = new Circle(4, 5, 6, 7.7);
            System.out.println("set góc quay: ");
            circle.setAngle(sc.nextInt());
            System.out.println("set màu: ");
            circle.setcolor(sc.nextInt());
            System.out.println("set độ dịch chuyển: ");
            circle.setPoint(sc.nextInt());
            sc.nextLine();
            System.out.println("set diện tích: ");
            circle.setArea(sc.nextDouble());
            figure[i] = circle;

        }
        figure[3] = new Composite();

        Composite composite = new Composite(1, 2, 3, 4);
        composite.add(new Line(1, 2, 3, 4.4));
        composite.add(new Line(4, 5, 6, 5.5));
        composite.add(new Line(7, 8, 9, 6.6));
        composite.add(new Circle(1, 2, 3, 7.7));
        figure[3] = composite;
    }

    public void display() {
        int count = 1;
        for (int i = 0; i < figure.length; i++) {
            if (figure[i] instanceof Line) {
                System.out.println("figure - LINE");
            } else if (figure[i] instanceof Circle) {

                System.out.println("figure - CIRCLE " + (count++));

            } else {
                System.out.println("figure - COMPOSITE");

            }
//            System.out.println("figure - CIRCLE");
            figure[i].draw();
            figure[i].rotate(figure[i].getAngle());
            figure[i].moveLeft(figure[i].getPoint());
            figure[i].setColor(figure[i].getColor());
            System.out.println();
        }
    }

    public void doiMau() {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập vào màu bạn muốn đổi: ");
        int color = sc.nextInt();
        for (int i = 0; i < figure.length; i++) {
            System.out.println("hình " + (i + 1));
            figure[i].setcolor(color);
            figure[i].setColor(figure[i].getColor());
        }
    }

    public void quayGoc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập góc bạn muốn qay: ");
        int angle = sc.nextInt();
        for (int i = 0; i < figure.length; i++) {
            System.out.println("hình " + (i + 1));

            figure[i].setAngle(angle);
            figure[i].rotate(figure[i].getAngle());
        }
    }

    
}
