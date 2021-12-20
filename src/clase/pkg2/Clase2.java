/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg2;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DIEGO
 */
public class Clase2 {
    
    ArrayList<Double> listanumeros;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Clase2 milista = new Clase2();
        milista.listanumeros = new ArrayList<>();
        milista.leerOpcion();
    }
    
    private void leerOpcion(){
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("\n*--- MENU PRINCIPAL ---*");
            System.out.println("");
            System.out.println("[1] **AGREGAR");
            System.out.println("[2] **BUSCAR");
            System.out.println("[3] **MODIFICAR");
            System.out.println("[4] **ELIMINAR");
            System.out.println("[5] **INSERTAR");
            System.out.println("[6] **MOSTRAR");
            System.out.println("[7] **SALIR");
            System.out.println("*--- INGRESE UNA OPCION DEL 1 AL 7 ---*");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1:
                    ingresarvalor();
                    break;
                case 2:
                    buscarvalor();
                    break;
                case 3:
                    modificarvalor();
                    break;
                case 4:
                    eliminarvalor();
                    break;
                case 5:
                    insertarvalor();
                    break;
                case 6:
                    mostrarvalor();
                    break;  
            }
        }while(opcion !=7);
    }
    private void ingresarvalor(){
        Scanner teclado = new Scanner(System.in);
        double valor;
        System.out.println("INGRESAR UN VALOR");
        valor = teclado.nextDouble();
        listanumeros.add(valor);
    }
    private void buscarvalor(){
        Scanner teclado = new Scanner(System.in);
        double valor;
        int indice;
        System.out.println("BUSCAR UN VALOR");
        valor = teclado.nextDouble();
        indice = listanumeros.indexOf(valor);
        if(indice !=1){
            System.out.println("DATOS ENCONTRADOS"+ indice);
        }else{
            System.out.println("DATOS NO ENCONTRADOS"+ indice);
        }
    }
    private void modificarvalor(){
        Scanner teclado = new Scanner(System.in);
        double valor, nuevovalor;
        int indice;
        System.out.println("VALOR A MODIFICAR");
        valor = teclado.nextDouble();
        indice = listanumeros.indexOf(valor);
        if(indice != -1){
            System.out.println("NUEVO VALOR");
            nuevovalor = teclado.nextDouble();
            listanumeros.set(indice, nuevovalor);
        }else{
            System.out.println("DATOS NO ENCONTRADOS");
        }
    }
    private void eliminarvalor(){
        Scanner teclado = new Scanner(System.in);
        double valor;
        int indice;
        System.out.println("VALOR A ELIMINAR");
        valor = teclado.nextDouble();
        indice = listanumeros.indexOf(valor);
        if(indice != -1){
            listanumeros.remove(indice);
            System.out.println("DATOS ELIMINADOS");
        }else{
            System.out.println("DATOS NO ENCONTRADOS");
        }
    }
    private void insertarvalor(){
        Scanner teclado = new Scanner(System.in);
        double valor;
        int indice;
        System.out.println("INGRESAR UN VALOR");
        valor = teclado.nextDouble();
        System.out.println("POSICION DONDE SE DESEE INGRESAR");
        indice = teclado.nextInt();
        listanumeros.add(indice, valor);
    }
    private void mostrarvalor(){
        if(!listanumeros.isEmpty()){
            System.out.println("ELEMENTOS DE LA LISTA");
            for(int i=0; i<listanumeros.size(); i++){
                System.out.println(listanumeros.get(i));
            }
        }else{
            System.out.println("NO EXISTEN VALORES INGRESADOS");
        }
    }
}
