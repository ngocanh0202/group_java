import java.util.Scanner;

public class project {
    static void tinhtong(int a, int b){

    }
    static void tinhhieu(int a,int b){

    }
    static void tinhtich(int a,int b){

    }
    static float tinhthuong(int a, int b){
    	int b1 = 0;
		if(b==0) {
			do {
				System.out.println("Nhap lai b :");
				Scanner objSc = new Scanner(System.in);
				b1 = objSc.nextInt();
			}while(b1 == 0);
			return (float) (a*1.0/b1);
		}else
			return (float) ((a*1.0)/b);
	}

    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        System.out.println("Nhap a:");
        int a = sv.nextInt();
        System.out.println("Nhap b:");
        int b = sv.nextInt();
        System.out.println("Thuong hai so la: " + tinhthuong(a,b));
    }
}
