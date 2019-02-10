package command

fun main() {
    val receiver = Receiver()
    val invoker = Invoke()

    val freeCommand = FreeCommand(receiver)
    val paidCommand = PaidCommand(receiver)

    invoker.executeCommand(freeCommand)
    invoker.executeCommand(paidCommand)
}