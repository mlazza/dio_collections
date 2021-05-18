package com.mlazza.diocollections

import java.math.BigDecimal

//CRIAMOS EXTENSOES DE FUNCOES DE UM TIPO JA EXISTENTE-ARRAY
fun Array<BigDecimal>.somatoria() = this.reduce {
    acc, valor -> acc + valor
}

fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()