package com.ktcoders.music


object Main {
    @JvmStatic
    fun main(args: Array<String>) {

        sum(2, 3, 4, 5, 6, 7 , 50)

    }

    fun sum(vararg x: Int) {
        println("${x.sum()}")
    }



}