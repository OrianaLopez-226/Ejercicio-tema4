public class Main {
    public static void main(String[] args) {
        //Condicional IF
        int numeroif = -25;
        if (numeroif > 0) {
            System.out.println("El número es positivo");
        }
        else if (numeroif <0){
            System.out.println ("El número es negativo");
        }
        else if (numeroif==0){
            System.out.println("El número es 0");
        }
        //Condicional WHILE
        int numerowhile = -4;
        while (numerowhile < 3){
            System.out.println (numerowhile); {
                numerowhile = numerowhile + 1;
            }
        }
        //Condicional DO WHILE
        do {
            System.out.println (numerowhile);
            numerowhile = numerowhile + 1;
        }while (numerowhile < 3);
        //Condicional for
        for (int numeroFor=0; numeroFor<=3; numeroFor++){
            System.out.println(numeroFor);
        }
        //SWITCH
        var estacion = "VERANO";
        switch (estacion){
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estación");
        }

    }
}