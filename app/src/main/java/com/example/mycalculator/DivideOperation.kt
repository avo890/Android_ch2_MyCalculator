package com.example.mycalculator

class DivideOperation : AbstractOperation() {

    override fun operation(num1: Double, num2: Double): Double {
        return num1 / num2
    }
}