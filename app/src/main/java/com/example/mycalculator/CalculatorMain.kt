package com.example.mycalculator

fun main() {

    var select : Int = 0
    var calc : Double = 0.0
    var operator : String = ""
    var num1 : Double = 0.0
    var num2 : Double = 0.0

    val add = AddOperation()
    val subtract = SubtractOperation()
    val multiply = MultiplyOperation()
    val divide = DivideOperation()

    val addOperator = Calculator(add)
    val subtractOperator = Calculator(subtract)
    val multiplyOperator = Calculator(multiply)
    val divideOperator = Calculator(divide)

    while(select != 3) {
        println("")
        println("원하는 계산을 선택하세요")
        println("[1] 새로 계산하기 [2] 이어서 계산하기 [3] 그만두기 ")
        select = readLine()!!.toInt()

        if(select == 1) {
            println("첫번째 수를 입력하세요.")
            num1 = readLine()!!.toDouble()
            println("수행할 연산자를 고르세요 : +  -  *  /")

        } else if (select == 2) {
            num1 = calc
            println("")
            println("첫번째 수는 $calc 입니다.")
            println("")
            println("추가로 수행할 연산자를 고르세요 : +  -  *  /")

        } else if (select ==3) {
            println("계산기를 종료합니다.")
            break
        }

        operator = readLine()!!

        println("두번째 수를 입력하세요.")
        num2 = readLine()!!.toDouble()

        when(operator) {
            "+" -> {
                calc =addOperator.operation(num1,num2)
            }

            "-" -> {
                calc = subtractOperator.operation(num1,num2)
            }

            "*" -> {
                calc = multiplyOperator.operation(num1,num2)
            }

            "/" -> {
                if(num2 == 0.0) {
                    println("0으로 나눠지지 않습니다.")
                } else {
                    calc =  divideOperator.operation(num1,num2)
                }
            }
        }

        println("${num1} ${operator} ${num2} =  ${calc} 입니다.")

    }
}
