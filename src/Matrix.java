import java.util.Random;

public class Matrix {
    public Matrix(int sor, int oszlop) {
        this.sor = sor;
        this.oszlop = oszlop;
        this.m = new  int[sor][oszlop];
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++) {
                m[i][j] = rnd.nextInt(199)-99;
            }
        }
    }

    public int getSor() {
        return sor;
    }

    public void setSor(int sor) {
        this.sor = sor;
    }

    public int getOszlop() {
        return oszlop;
    }

    public void setOszlop(int oszlop) {
        this.oszlop =oszlop;
    }
    public int[][] getM() {
        return m;
    }

    public void setM(int[][] m) {
        this.m = m;
    }
    
    private int sor;
    private int oszlop;
    private int [][] m ;
    static Random rnd= new Random();

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                s+= String.format("%3d",m[i][j]);
            }
            s+=System.lineSeparator();
        }
        return s ;
    }

    public int matrixSum(){
        int osszeg = 0;
        for (int[] matrixsor : m) {
            for (int szam: matrixsor
                 ) {
                osszeg+=szam;
            }
        }
        return osszeg;
    }
    public int pozitivDarab(){
      int darab = 0;
      for (int[] matrixsor : m){
          for (int szam:matrixsor
               ) {
              if (szam>0){
                  darab+=szam;
              }
          }}
      return darab;
    }

    public int maxErtek(){
        int legnagyobb = m[0][0];
        for (int[] matrixsor : m){
            for (int szam:matrixsor
            ) {
                if (szam> legnagyobb){
                    legnagyobb = szam;
                }
            }}
        return legnagyobb;
    }

    public boolean negyzete(){
        for (int[] matrixsor: m
             ) {

        }
    }
}
