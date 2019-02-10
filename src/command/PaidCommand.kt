package command

class PaidCommand(private val receiver: Receiver): Command {

    override fun execute() {
        receiver.performPaid()
    }
}