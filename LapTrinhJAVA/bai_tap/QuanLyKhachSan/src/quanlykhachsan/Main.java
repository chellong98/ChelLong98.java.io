/*
 Đề :
   Đdoó 
- Với mỗi hộ dân, có các thuộc tính:
+ Suố thành viên trong hộ ( số người)
+ Số nhà của hộ dân đó. ( Số nhà được gắn cho mỗi hộ dân)
+ Thông tin về mỗi cá nhân trong hộ gia đình.
- Với mỗi cá nhân, người ta quản lý các thông tin như: họ và tên, ngày  sinh, nghề nghiệp.
1. Hãy xây dựng lớp Nguoi để quản lý thông tin về mỗi cá nhân.
2. Xây dựng lớp KhuPho để quản lý thông tin về các hộ gia đình.
3. Viết các phương thức nhập, hiển thị thông tin cho mỗi cá nhân.
4. Cài đặt chương trình thực hiện các công việc sau:
- Nhập vào một dãy gồm n hộ dân (n - nhập từ bàn phím).
- Hiển thị ra màn hình thông tin về các hộ trong khu phố năm nay có người mừng thượng thọ (80 tuổi)
 */
package quanlykhachsan;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat Khởi tạo n khu phố Trong mỗi khu phố sẽ có m hộ dân
 * trong mỗi hộ dân có p người đâu? chỉ có 1 khu phố trong d
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập vào số nhà của khu phố: ");
        int numberHouse = sc.nextInt();

        HoDan hodan[] = new HoDan[numberHouse];

        //sc.nextLine()
        for (int j = 0; j < numberHouse; j++) {
           
            System.out.println("nhập vào số nhà của nhà thứ " + (j + 1) + ": ");
            int sonha = sc.nextInt();
            System.out.println("nhập vào số người trong nhà thứ " + (j + 1) + ": ");
            int numberNguoi = sc.nextInt();
            sc.nextLine();
            hodan[j] = new HoDan(); //tạo ra từng đói tượng sau mỗi vòng lặp
            hodan[j].setSoNha(sonha);
            hodan[j].setAmount(numberNguoi);
            for (int k = 0; k < numberNguoi; k++) {
                System.out.println("nhập vào người thứ " + k + ": ");
                System.out.println("nhập vào họ tên: ");
                String name = sc.nextLine();
                System.out.println("nhập vào năm sinh: ");
                int date = sc.nextInt();
                sc.nextLine();
                System.out.println("nhập vào công việc: ");
                String job = sc.nextLine();// lặp
                System.out.println();
                //sc.nextLine();
                Nguoi ng = new Nguoi(name, date, job);
                hodan[j].setNguoi(ng);
            }
        }

        //kps[i] = kp;ngoặc
        System.out.println("hiển thị thông tin các hộ dân: ");
        for (int i = 0; i < hodan.length; i++) {
            System.out.println("những người trong nhà số " + hodan[i].getSoNha()); //hay :)))
            for (int j = 0; j < hodan[i].getAmount(); j++) {
                System.out.println(hodan[i].getNguoi(j)); //in ra từng người
            }
            System.out.println("----------------------------");
        }
    }
}
