

package com.mycompany.precedenciadeoperadores;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
int Numero;
//entrada de datos//
System.out.println("Dame el Numero");
Numero=dato.nextInt();
//salida de datos//
System.out.println(retornaedad(Numero));
}
public static String retornaedad(int Numero){
//declaracion de variables 
int m;
//procesamiento de datos
if(Numero<=10){
return "Es una cifra";
}
if(Numero<=100){
return "Es de 2 cifras";
}
if(Numero<=1000){
return "Es de 3 cifras";
}
if(Numero<=10000){
return "Es de 4 cifras";
}
if(Numero<=100000){
return "Es de 5 cifras";
}
if(Numero<=0){
return "No existe numero menor a 0";
}
else{
return "No es un Numero";
}
}
}