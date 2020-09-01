fun main () {
    val panjang = "20"
    val lebar = 12.6
    val tinggi = 10
    val volume: Double

    val p =(panjang.toDouble())
    val l =(lebar.toDouble())
    val t =(tinggi.toDouble())
    volume = (p * l * t)
    print("Volume dari balok yang mempunyai Panjang $p, Lebar $l, dan Tinggi $t, ini adalah :" + volume.toFloat())
}