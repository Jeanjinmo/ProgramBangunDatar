//Chapter 3 topic 3 General & Data Structurere in Kotlin


fun main() {
    println("Bangun Datar")

    println(
        """
        Hitung luas apa? (pilih angka)
        1. Persegi Panjang
        2. Lingkaran
        3. segitiga
    """.trimIndent()
    )
    print("Pilih : ")
    val pilihanArray = arrayOf(1, 2, 3)
    val pilihan = readLine()!!.toInt()

    if (pilihanArray.contains(pilihan)) {
        if (pilihan == 1) {
            print("Masukkan Panjang : ")
            val input1: String? = readLine()
            print("Masukkan Lebar : ")
            val input2: String? = readLine()
            println("Persegi Panjang : " + PersegiPanjang(input1!!.toDouble(), input2!!.toDouble()))

        } else if (pilihan == 2) {
            print("Masukkan Jari Jari : ")
            val input1: String? = readLine()
            println("Nilai phi : 3.14 ")
            println("Luas Lingkaran : " + Lingkaran(input1!!.toDouble()))
        } else if (pilihan == 3) {
            print("Masukkan Alas : ")
            val input1: Double = readLine()!!.toDouble()
            print("Masukkan Tinggi : ")
            val input2: Double = readLine()!!.toDouble()
            println("Luas Segitiga : " + Segitiga(input1, input2))
        }
    } else
        println("Inputan yang dimasukkan tidak sesuai pilihan")
}


fun PersegiPanjang(panjang: Double, lebar: Double): Double {
    return panjang * lebar
}

fun Lingkaran(jariJari: Double, phi: Double = 3.14): Double {
    return phi * jariJari * jariJari
}

fun Segitiga(alas: Double, tinggi: Double): Double {
    return (alas * tinggi) / 2
}