package Model

open class Persona {
    var nombre : String = ""
    var edad : Int = 0
    var cedula : Int = 0
    var sexo : String = ""
    var peso : Float = 0.0f
    var altura : Float =0.0f

        get() {
            return field
        }
        set(value) {
            field = value
        }

    //Varaibles para los pesos
     var pesoNormal = 0
    var bajoPesoI = -1
    var sobrePesoI = 1
    //------------
    //Variable para edad
    var mayorEdad = true
    var menorEdad = false
    //-------------------

    //Varaible para sexo
    var sexoporDefecto = "hombre"

    //•	Un constructor por defecto.
    constructor() {
        var nombre : String = ""
        var edad : Int = 0
        var cedula : Int = 0
        var sexo : String = ""
        var peso : Float = 0.0f
        var altura : Float =0.0f
    }

  //•	Un constructor con el nombre, edad y sexo, el resto por defecto.

    constructor(nombre: String, edad : Int, sexo : String){
        this.nombre = ""
        this.edad = 0
        this.sexo = ""
    }


// •	Un constructor con todos los atributos como parámetro
    constructor(nombre_p: String, edad_p: Int, cedula_p: Int, sexo_p: String, peso_p: Float, altura_p: Float) {
        this.nombre = nombre_p
        this.edad = edad_p
        this.cedula = cedula_p
        this.sexo = sexo_p
        this.peso = peso_p
        this.altura = altura_p
    }





}