fun main () {

    var lamaParkir = Int
    var biayaParkir = Float

    //rule biaya parkir

    val tarifDasar = 1.0
    val tarifBerikutnya = 0.5
    val newTarifPerhari = 15

    if (lamaParkir <= 5) {
        biayaParkir = (tarifDasar * lamaParkir)
    } else if ((lamaParkir > 5) && (lamaParkir < 24)) {
        biayaParkir = (5 + (tarifBerikutnya * lamaParkir))
    } else if (lamaParkir > 24){
        biayaParkir = (newTarifPerhari + (lamaParkir * tarifBerikutnya))
    }

    println("Lama Parkir: $lamaParkir")
    println("Biaya Parkir: $biayaParkir")
}