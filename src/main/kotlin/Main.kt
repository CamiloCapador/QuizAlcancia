fun main(args: Array<String>) {

    //Juan Camilo Garzon Capador
    //700935

    println("Quiz Alcancia\n")

    var opc = 1
    var cont20 = 0
    var cont50 = 0
    var cont100 = 0
    var cont200 = 0
    var cont500 = 0
    var total = 0

    while (opc != 5){
        println("""
            
        1- Guardar moneda
        2- Consultar monedas por denominación
        3- Consultar dinero ahorrado
        4- romper alcancia 
               
        Que desea hacer:       
    """.trimIndent())

        opc = readln().toInt()

        when (opc){
            1->{
                println("""
                    
                    Que moneda desea guardar en la alcancia
                    1- $20 pesos
                    2- $50 pesos
                    3- $100 pesos
                    4- $200 pesos
                    5- $500 pesos
                    
                    Digita tu opción: 
                """.trimIndent())

                var moneda = readln().toInt()

                if (moneda == 1){
                    cont20 += 1
                    println("\nSe agrego una moneda de $20 pesos")
                } else if (moneda == 2){
                    cont50 += 1
                    println("\nSe agrego una moneda de $50 pesos")
                } else if (moneda == 3) {
                    cont100 += 1
                    println("\nSe agrego una moneda de $100 pesos")
                } else if (moneda == 4) {
                    cont200 += 1
                    println("\nSe agrego una moneda de $200 pesos")
                } else if (moneda == 5) {
                    cont500 += 1
                    println("\nSe agrego una moneda de $500 pesos")
                } else {
                    println("\nopcion invalida")
                }
            }
            2->{
                println("""
                    
                    Tiene $cont20 monedas de ${'$'}20 pesos
                    Tiene $cont50 monedas de ${'$'}50 pesos
                    Tiene $cont100 monedas de ${'$'}100 pesos
                    Tiene $cont200 monedas de ${'$'}200 pesos
                    Tiene $cont500 monedas de ${'$'}500 pesos
                """.trimIndent())
            }
            3->{
                total = ((20*cont20)+(50*cont50)+(100*cont100)+(200*cont200)+(500*cont500))
                println("\nSu dinero ahorrado es $$total pesos")
            }
            4->{
                 var total = 0
                println("\nSu alcancia se vacio, tienes $$total pesos")
                break
            }
        }
    }
}