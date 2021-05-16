/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CRISTINA LATORRE PRIETO latorreprietoc@gmail.com
 *
 * @version 21.07
 */
public class Empleado {

                 /**
                 *nombre del empleado
                 */
		 private String nombre;  
                   /**
                 *apellido del empleado
                 */ 
		 private String apellido;
                     /**
                 *edad del empleado
                 */  
		 private int edad;  
                   /**
                 *salario del empleado
                 */
		 private double salario;   

		 /**
                  * Suma un plus de 83 euros al salario del empleado si el empleado tiene mas de 37 años
                  * 
                  *@param sueldoPlus -cantidad en euros que se suma al salario
                  *@return<ul>
                  *<li> true: se suma el plus al sueldo </li>
                  *<li> false : no se suma el plus al sueldo</li>
                  *</ul>
                  *
                  */
		 public boolean plus(double sueldoPlus) {     
		 boolean aumento = false;      
		 if (edad > 40 && compruebaNombre()) {            
		 salario += sueldoPlus;            
		 aumento = true;        
		 }        
		 return aumento;    
		 }   

		 //Metodos privados   
		 private boolean compruebaNombre() {       
		 if (nombre.equals("")) {           
		 return false;        
		 }       
		 return true;   
	 }    
		 
		 /**
                  *Constructyor por defecto 
                  */
		 public Empleado() {       
		   this("", "", 0, 0);   
		 }   
                 /**
                  *Constructor con 4 parametros
                  *
                  *@param nombre -nombre del empleado
                  *@param apellido - apellido del empleado
                  *@param edad -edad del empleado
                  *@param salario -salario del empleado
                  */
		 public Empleado(String nombre, String apellido, int edad, double salario) {        
		 this.nombre = nombre;        
		 this.apellido = apellido;       
		 this.edad = edad;       
		 this.salario = salario;    }
		 
		 
		 }
		 
		 
	
	

