package utsalgo2;
import java.util.Scanner;
public class matrik1 {
     public static void main(String[] args){
        int i,j,m,n;
        int matriks[][] = new int[10][10];
        int transpose[][] = new int[10][10];
        String x1 = "A";
        String x2 = "B";
        String x3 = "C";
        
        for (int a = 1; a <= 2; a++){
            Scanner scan = new Scanner(System.in);
            if (a == 1){
                String as = "A";
                System.out.print("Masukkan julmah baris matriks " + as + ": ");
                m = scan.nextInt();
                System.out.print("Masukkan jumlah kolom matriks " + as + ": ");
                n = scan.nextInt();
                System.out.println("Masukkan elemen matriks " + as + ": ");
                for(i=0; i<m; i++){
                    for(j=0; j<n; j++){
                        matriks[i][j] = scan.nextInt();
                    }
                }
                System.out.println("Hasil matriks " + as + ":");
                for(i=0; i<m; i++){
                    for(j=0; j<n; j++){
                        System.out.print(matriks[i][j] + "\t");
                    }
                    System.out.println();
                }

                for(i=0; i<m; i++){
                    for(j=0; j<n; j++){
                        transpose[j][i] = matriks[i][j];
                    }
                }

                System.out.println("Hasil transpose matriks " + as + ":");
                for(i=0; i<n; i++){
                    for(j=0; j<m; j++){
                        System.out.print(transpose[i][j] + "\t");
                    }
                    System.out.println();
                }
            }else if (a == 2){
                String as = "B";
                System.out.print("Masukkan julmah baris matriks " + as + ": ");
                m = scan.nextInt();
                System.out.print("Masukkan jumlah kolom matriks " + as + ": ");
                n = scan.nextInt();
                System.out.println("Masukkan elemen matriks " + as + ": ");
                for(i=0; i<m; i++){
                    for(j=0; j<n; j++){
                        matriks[i][j] = scan.nextInt();
                    }
                }
                System.out.println("Hasil matriks " + as +": ");
                for(i=0; i<m; i++){
                    for(j=0; j<n; j++){
                        System.out.print(matriks[i][j] + "\t");
                    }
                    System.out.println();
                }

                for(i=0; i<m; i++){
                    for(j=0; j<n; j++){
                        transpose[j][i] = matriks[i][j];
                    }
                }

                System.out.println("Hasil transpose matriks " + as + ":");
                for(i=0; i<n; i++){
                    for(j=0; j<m; j++){
                        System.out.print(transpose[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
        }
    
}
