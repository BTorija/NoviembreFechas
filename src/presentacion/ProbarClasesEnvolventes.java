package presentacion;

public class ProbarClasesEnvolventes {
    public static void main(String[] args) {
        //Tipos primitivos-> Convertirlos a objetos
        //Boxing-> de un primitivo a una clase envolvente
        int i =5;
        Integer iEnvolvente=i;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        String numero="5";
        System.out.println(Integer.parseInt(numero));

        float sueldo=1_500.50f;
        Float sEnvolvente=sueldo;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.parseFloat("1500.5"));
        System.out.println("Valor maximo de Character-> "+Character.MAX_VALUE);
        System.out.println("Valor minimo de Character-> "+Character.MIN_VALUE);


        char letra='a';
        Character lEnvolvente=letra;
        System.out.println("Caracter envolvente-> " +lEnvolvente);

        //UNBOXING
        int i2=iEnvolvente;
        System.out.println("Clase envolvente convertida a primitivo->"+i2);
        char letra2=lEnvolvente;
        System.out.println("Char envolvente convertido a primitivo-> "+letra2);

    }

}
