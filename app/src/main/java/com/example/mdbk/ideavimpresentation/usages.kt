package com.example.mdbk.ideavimpresentation

import kotlin.concurrent.fixedRateTimer

fun usages() {

    ".".hello("")
    validateVacations(Person())
    validateVacationsSecondTime(Person())

    ClassForJumpNavigation().let {
       it.firstFunc()
    }

    ClassForNavigation().let {
       it.firstFunc()
    }
}


