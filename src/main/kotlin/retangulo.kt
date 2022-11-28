class retangulo(val altura: Int, val largura: Int){
    val isQuadrado
        get() = altura == largura
}

fun main(){
    val Retangulo: retangulo = retangulo(altura = 1, largura = 10)
    println(Retangulo.isQuadrado)
}

