public class Main {

    public static void main(String[] args) {
        String palabra1 = "PABLOPABLITOCLAVOUNCLAVITO";
        String palabra2 = "COMOQUIERESQUETEQUIERASIQUIENQUIEROQUEMEQUIERANOMEQUIERECOMOQUIEROQUEMEQUIERA";

        int a = cuentapalabra(palabra1);
        int b = cuentapalabra(palabra2);
        System.out.println("La cantidad de caracteres de la palabra es " + a);
        System.out.println("La cantidad de caracteres de la palabra es " + b);

        cuentaCaracter(palabra1,a);
        System.out.println("\n =============== SEGUNDA PALABRA ============= ");
        cuentaCaracter(palabra2,b);

    }

    public static int cuentapalabra(String palabra)
    {
        char[] caracteres = palabra.toCharArray();
        int contador = 0;
        for (int i = 0; i < caracteres.length; i++) {
            contador++;
        }

        return contador;
    }

    public  static void cuentaCaracter(String palabra, int total)
    {
        char[] caracteres = palabra.toCharArray();
        for(int i=0; i<caracteres.length; i++){

            char letraActual = caracteres[i];
            int contador = 0;
            //int comprueba = 0;

            for (int j =0; j<caracteres.length; j++){
                if (caracteres[j] == letraActual)
                    contador++;
            }
            System.out.println("La cantidad de " + caracteres[i] + " es " + contador+"/"+total);
           //comprueba += contador;
        }

    }
}