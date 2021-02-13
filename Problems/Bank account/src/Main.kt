class BankAccount constructor(depositedC: Long, withdrawnC: Long) {
    var withdrawn = withdrawnC
    var deposited = depositedC
    var balance = deposited - withdrawn
}