package command

class Invoke {

    fun executeCommand(cmd: Command) {
        cmd.execute()
    }
}