package Controller

import Model.Persona

import kotlin.math.pow

class PersonaController(nombre_p: String, edad_p: Int, cedula_p: Int, sexo_p: String, peso_p: Float, altura_p: Float) :
    Persona(nombre_p, edad_p, cedula_p, sexo_p, peso_p, altura_p) {


       fun calcularIMC(p : Float) { //Metodo para calcular el peso
            val pesoIdeal : Float

         pesoIdeal = p / (altura.pow(2))
             if (p == pesoIdeal){
               println(" Su estadistica para peso normal indica: " + pesoNormal)//
            }else if (pesoIdeal > p ){
               println(" Su estadistica para bajo peso indica: " + bajoPesoI)//bajoPesoI = -1
            } else {
                println(" Su estadistica para sobre peso indica: " + sobrePesoI)//sobrePesoI = 1
             }

       } //Termina el metodo para calcular peso

    fun esMayorDeEdad(edad_C : Int){//Metodo para saber si es mayor de edad
         edad_C
        if(edad_C >= 18){
            println("Su resultado para mayor de edad es: " + mayorEdad) //Cambiar en caso de error
        }else {
            println("Su resultado para mayor de edad es: " + menorEdad)
        }
    }//Final de metodo de edad

    fun comprobarSexo(sexo_p:String) { //Metodo para saber el sexo de la persona

        if (sexo_p == "hombre" || sexo_p == "mujer"){
            println("su Sexo es: " + sexo_p)
        } else{
            sexoporDefecto
            println("su Sexo establecido es: " + sexoporDefecto)

        }
    }//Final de metodo de sexoPersona

 fun toString( nombre:  String, edad : Int, sexo : String, peso : Float, altura : Float) {

     println("Persona(nombre= '$nombre', " +
             " "+
                "edad= $edad, " +
             " "+
                "sexo= '$sexo', " +
             " "+
                "peso= $peso, " +
             " "+
                "altura= $altura, ")
    }




}