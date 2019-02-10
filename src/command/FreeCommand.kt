package command

class FreeCommand(private val receiver: Receiver): Command {

    override fun execute() {
        receiver.performFree()
    }
}