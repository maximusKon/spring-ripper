package quoters

class TerminatorQuoter : Quoter {
    var message: String? = null

    override fun sayQuite() {
        println(message)
    }
}
