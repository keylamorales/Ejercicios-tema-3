public class miCoche {
    public static void main(String[] args)  {
        Coche  miCoche = new Coche();
        miCoche.setPuertas();
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b) {
        return a + b;
    }
}

class Coche {
    public int puertas = 4;

    public void setPuertas() {
        this.puertas++;
    }
}