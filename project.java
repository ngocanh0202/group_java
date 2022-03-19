import java.util.Scanner;

public class project {
    static int tinhtong(int a, int b){

    }
    static int tinhhieu(int a,int b){

    }
    static int tinhtich(int a,int b){

    }
    static float tinhthuong(int a, int b){//<- thêm ngoặc

    }

    public static void main(String[] args) {
        int a,b;
		char chon,y;
		do {
			Scanner objSc = new Scanner(System.in);
			System.out.println("Nhap so a :");
			a = objSc.nextInt();
			System.out.println("Nhap so b :");
			b = objSc.nextInt();
			System.out.println("Hay nhap phep tinh (+,-,*,/)");
			chon = (char) System.in.read();
			switch(chon) {
			case '+':System.out.println("Tong hai so la :"+tinhtong(a,b));
					break;
			case '-':System .out.println("Hieu hai so la :"+tinhhieu(a,b));
					break;
			case '*':System.out.println("Tich hai so la "+tinhtich(a,b));
					break;
			case '/':System.out.println("Thuong hai so la "+tinhthuong(a,b));
					break;
			default :System.out.println("Khong dung hay nhap lai nhe :");
					break;
			}
			System.in.skip(chon);
			System.out.println("Tiep tuc khong yes or no(y/n):");
			y = (char)System.in.read();
			
			
		}while(y=='Y'||y=='y');
    }
}
