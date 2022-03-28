package View

import Controller.PersonaController
import Model.Persona

class PersonaView : Persona(){
 val person1 = Persona()
 val person2 = Persona(nombre,edad,cedula,sexo,80.3f,1.49f)
 val person3 = Persona("Maria",22, 207870975,"mujer", 85.3f, 1.78f )
 val personC = PersonaController(person1.nombre, person1.edad, person1.cedula, person1.sexo, person1.peso, person1.altura)

    //Capturar y mostrar la informacion que se pide en el metodo

  fun llamarPersonas(){

      println("Ingrese su nombre: ")
      val nombres : String = readLine()?.toString() as String
      person1.nombre = nombres
      //
      println("Ingrese su edad: ")
      val edad : Int = readLine()?.toInt() as Int
      person1.edad = edad
      //
      println("Ingrese su sexo: ")
      val sexos : String = readLine()?.toString() as String
      person1.sexo = sexos
      //
      println("Ingrese su peso: ")
      val pesos : Float =   readLine()?.toFloat() as Float
      person1.peso = pesos
      //
      println("Ingrese su altura: ")
      //
      val alturas : Float= readLine()?.toFloat() as Float
      person1.altura = alturas

      personC.toString(nombres, edad , sexos, pesos, alturas)//Imprime informacion

      personC.calcularIMC(pesos)
      personC.esMayorDeEdad(edad)
      personC.comprobarSexo(sexos)
      println("----------------------------------------------------------------------")
      //objeto 2
      println("----------------------------------------------------------------------")
      println("Ingrese su nombre: ")
      val nombres2 : String = readLine()?.toString() as String
      person2.nombre = nombres2
      //
      println("Ingrese su edad: ")
      val edad2 : Int = readLine()?.toInt() as Int
      person2.edad = edad2
      //
      println("Ingrese su sexo: ")
      val sexos2 : String = readLine()?.toString() as String
      person2.sexo = sexos2

      personC.toString(nombres2, edad2 , sexos2, 80.3f, 1.49f)//Imprime informacion

      personC.calcularIMC(80.3f)
      personC.esMayorDeEdad(edad2)
      personC.comprobarSexo(sexos2)
      //objeto 3
      println("----------------------------------------------------------------------")
      personC.toString(person3.nombre,person3.edad,person3.sexo,person3.peso,person3.altura)
      personC.calcularIMC(person3.peso)
      personC.esMayorDeEdad(person3.edad)
      personC.comprobarSexo(person3.sexo)


  }

  }


