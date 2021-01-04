package Cat

class Cat(val name: String, val height: Int) {

    public fun miaow(count : Int) {
        for (i in 0..count)
            println("miaow")
    }

    fun play() {
        println("$name is playing, he is $height inches tall")
    }

}
