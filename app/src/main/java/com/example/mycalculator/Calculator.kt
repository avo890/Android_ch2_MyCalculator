package com.example.mycalculator

class Calculator(private val operation: AbstractOperation)  {

//    fun addOperation(num1: Double, num2: Double) : Double = AddOperation().operation(num1, num2)
//
//    fun subtractOperation(num1: Double, num2: Double) = SubtractOperation().operation(num1, num2)
//
//    fun multiplyOperation(num1: Double, num2: Double) = MultiplyOperation().operation(num1, num2)
//
//    fun divideOperation(num1: Double, num2: Double) = DivideOperation().operation(num1, num2)

    fun operation(num1 : Double,num2 : Double) : Double {

        return operation.operation(num1, num2)
    }

}
