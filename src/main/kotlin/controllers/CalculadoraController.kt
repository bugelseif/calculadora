package first.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/calculadora")
class CalculadoraController {

    @GetMapping("/somar")
    fun soma(valor1: Int, valor2: Int): Int{
        return valor1 + valor2
    }
    @GetMapping("/subtrair")
    fun subtracao(valor1: Int, valor2: Int): Int{
        return valor1 - valor2
    }
    @GetMapping("/multiplicar")
    fun multiplicacao(valor1: Int, valor2: Int): Int{
        return valor1 * valor2
    }
    @GetMapping("/dividir")
    fun divisao(valor1: Int, valor2: Int): Int{
        if (valor2 >= 0){
            return valor1 / valor2
        }
        return 0
    }
}