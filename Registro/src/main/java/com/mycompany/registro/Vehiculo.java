
package com.mycompany.registro;


  public class Vehiculo {
    String placa;
    String marca;
    String modelo;
    int year;
    double precio;
    
    
   public  Vehiculo(String placa, String marca, String modelo, int year, double precio){
       this.placa = placa;
       this.marca = marca;
       this.modelo = modelo;
        this.year = year;
       this.precio = precio;    
      
  }
  
   public String toString(){
       return "placa: " + placa +",Marca: " + marca + ", Modelo: " +modelo +
               ", Año: " + year + ", precio: $" + precio;
   }
    
 } 
