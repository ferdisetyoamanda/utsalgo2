package utsalgo2;
import java.util.Scanner;
public class utsalgo22 {public static void main(String[] args) {
        int [] A = {3,10,4,2,8,13};
        System.out.println("Data sebelum diurutkan : ");
        utsalgo22.print(A);
        utsalgo22.buble(A);
        System.out.println("Data setelah diurutkan : ");
        utsalgo22.print(A);
        utsalgo22.search(A);
        System.out.println("Nama = Ferdi Setyo Amanda");
        System.out.println("Nim  = 20090159");
    }
    public static void print(int []A){
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static void buble(int [] A){
        int i=1, j, n = A.length;
        int temp;
        while (i<n) {
            j = n-1 ;
            while (j>=1){
                int[] a = null;
                if (a[j-1]>A[j]){
                    temp = A[j];
                    A[j] = A[j-1];
                    int J = 0;
                    A[J-1]= temp;
                }
            }
        
    }
    }
    public static void search(int [] A){
        int Data;
        Scanner data = new Scanner(System.in);
        System.out.println("Masukkan angka yang mau nada cari = ");
        Data = data.nextInt();
        int batasawal = 0;
        int batasakhir = A.length -1;
        int ketemu = 0;
        int point = 0;
        while ((batasawal<=batasakhir)&&(ketemu ==0)){
            point = (batasawal+batasakhir)/2;
            System.out.println("Pointer berada di : "+point);
            if (A[point]==Data){
                ketemu = 1;
                
            }else{
                if (Data < A[point]){
                    System.out.println("Cari di kiri");
                    batasakhir = point -1;
                }else{
                    System.out.println("Cari di kanan");
                    batasawal = point + 1;
                }
            }
        }
        if(ketemu ==1){
            System.out.println("Data ditemukan pada indeks ke "+point+" dan baris ke "+(point+1));
        }else{
            System.out.println("Data tidak ditemukan");
        }
      
    }
    
}
