package org.nti.loanmanagement

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LoanManagementApplication

fun main(args: Array<String>) {
    runApplication<LoanManagementApplication>(*args)
}
