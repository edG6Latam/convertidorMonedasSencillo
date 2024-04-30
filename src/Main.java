import monedas.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dolar dolar= new Dolar("USA","Dolar");
        Yuan yuan= new Yuan("China","Yuan");
        Rublo rublo= new Rublo("Rusia","Rublo");
        Lempira lempira= new Lempira("Honduras","Lempira");
        Scanner scan = new Scanner(System.in);
        double cantidadCambiar;
        double resultado;

                System.out.println("************Viembenido convertidor de monedas************");
        System.out.println("""
                cual es su moneda
                1- lempira
                2- rublo
                3- dolar
                4- yuan
                5- salir
                """);
        int MiMoneda= scan.nextInt();
        int contador=0;
        if(MiMoneda==5){
            contador=5;
            System.out.println("programa finalizado");
        }
        if(MiMoneda>=6||MiMoneda<=0){
            System.out.println("opcion no valida saliste del programa");
            contador=5;
        }
        while(contador!=5){
            System.out.println("***********************");
            System.out.println("""
                    Seleccione a que moneda desea convertir
                    1- Honduras lempira
                    2- USA dolar
                    3- Rusia rublo
                    4- China yuan
                    5- salir
                    """);

            int opcion= scan.nextInt();

            switch (MiMoneda){
                case 1:
                    switch (opcion){
                        case 1:
                            System.out.println("ingrese la cantidad que desea cambiar");
                            cantidadCambiar= scan.nextDouble();
                            resultado= cantidadCambiar*1;
                            System.out.println("su total es "+resultado+ " lempiras");
                            break;
                        case 2:
                            System.out.println("ingrese la cantidad que desea cambiar");
                            cantidadCambiar= scan.nextDouble();
                            resultado= lempira.convertir(lempira.getLempiraADolar(),cantidadCambiar);
                            System.out.println("su total es de "+resultado+ " dolares");
                            break;
                        case 3:
                            System.out.println("ingrese la cantidad que desea cambiar");
                            cantidadCambiar= scan.nextDouble();
                            resultado= lempira.convertir(lempira.getLempiraARublo(),cantidadCambiar);
                            System.out.println("su total es de "+resultado+ " rublo");
                            break;
                        case 4:
                            System.out.println("ingrese la cantidad que desea cambiar");
                            cantidadCambiar= scan.nextDouble();
                            resultado= lempira.convertir(lempira.getLempiraAYuan(),cantidadCambiar);
                            System.out.println("su total es de "+resultado+ " yuan");
                            break;
                        case 5:
                            contador=5;
                            System.out.println("saliste del programa");
                            break;
                        default:
                            System.out.println("opcion no valida");
                            break;
                    }
                    break;
                case 2:
                    switch (opcion){
                        case 1:
                            System.out.println("ingrese la cantidad que desea cambiar");
                            cantidadCambiar= scan.nextDouble();
                            resultado= rublo.getRubloALempira()*cantidadCambiar;
                            System.out.println("su total es "+resultado+ " lempira");
                            break;
                        case 2:
                            System.out.println("ingrese la cantidad que desea cambiar");
                            cantidadCambiar= scan.nextDouble();
                            resultado= rublo.convertir(rublo.getRubloADolar(), cantidadCambiar);
                            System.out.println("su total es de "+resultado+ " dolares");
                            break;
                        case 3:
                            System.out.println("ingrese la cantidad que desea cambiar");
                            cantidadCambiar= scan.nextDouble();
                            resultado= cantidadCambiar*1;
                            System.out.println("su total es de "+resultado+ " rublo");
                            break;
                        case 4:
                            System.out.println("ingrese la cantidad que desea cambiar");
                            cantidadCambiar= scan.nextDouble();
                            resultado= rublo.convertir(rublo.getRubloAYuan(), cantidadCambiar);
                            System.out.println("su total es de "+resultado+ " yuan");
                            break;
                        case 5:
                            contador=5;
                            System.out.println("saliste del programa");
                            break;
                        default:
                            System.out.println("opcion no valida");
                            break;
                    }
                    break;
                case 3:
                    switch (opcion){
                        case 1:
                            System.out.println("ingrese la cantidad que desea cambiar");
                            cantidadCambiar= scan.nextDouble();
                            resultado= dolar.convertir(dolar.getDolarALempira(), cantidadCambiar);
                            System.out.println("su total es "+resultado+ " lempiras");
                            break;
                        case 2:
                            System.out.println("ingrese la cantidad que desea cambiar");
                            cantidadCambiar= scan.nextDouble();
                            resultado= cantidadCambiar*1;
                            System.out.println("su total es de "+resultado+ " dolares");
                            break;
                        case 3:
                            System.out.println("ingrese la cantidad que desea cambiar");
                            cantidadCambiar= scan.nextDouble();
                            resultado= dolar.convertir(dolar.getDolarARublo(), cantidadCambiar);
                            System.out.println("su total es de "+resultado+ " rublo");
                            break;
                        case 4:
                            System.out.println("ingrese la cantidad que desea cambiar");
                            cantidadCambiar= scan.nextDouble();
                            resultado= dolar.convertir(dolar.getDolarAYuan(), cantidadCambiar);
                            System.out.println("su total es de "+resultado+ " yuan");
                            break;
                        case 5:
                            contador=5;
                            System.out.println("saliste del programa");
                            break;
                        default:
                            System.out.println("opcion no valida");
                            break;
                    }
                    break;
                case 4:
                    switch (opcion){
                        case 1:
                            System.out.println("ingrese la cantidad que desea cambiar");
                            cantidadCambiar= scan.nextDouble();
                            resultado= yuan.convertir(yuan.getYuanALempira(), cantidadCambiar);
                            System.out.println("su total es "+resultado+ " lempiras");
                            break;
                        case 2:
                            System.out.println("ingrese la cantidad que desea cambiar");
                            cantidadCambiar= scan.nextDouble();
                            resultado= yuan.convertir(yuan.getYuanADolar(), cantidadCambiar);
                            System.out.println("su total es de "+resultado+ " dolares");
                            break;
                        case 3:
                            System.out.println("ingrese la cantidad que desea cambiar");
                            cantidadCambiar= scan.nextDouble();
                            resultado= yuan.convertir(yuan.getYuanARublo(),cantidadCambiar);
                            System.out.println("su total es de "+resultado+ " rublo");
                            break;
                        case 4:
                            System.out.println("ingrese la cantidad que desea cambiar");
                            cantidadCambiar= scan.nextDouble();
                            resultado= cantidadCambiar*1;
                            System.out.println("su total es de "+resultado+ " yuan");
                            break;
                        case 5:
                            contador=5;
                            System.out.println("saliste del programa");
                            break;
                        default:
                            System.out.println("opcion no valida");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("numero 5");
                    break;
                default:
                    System.out.println("no es una opcion valida");
            }

        }

    }
}