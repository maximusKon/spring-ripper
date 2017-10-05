package quoters

import org.springframework.context.support.ClassPathXmlApplicationContext

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val applicationContext = ClassPathXmlApplicationContext("context.xml")
        applicationContext.getBean(TerminatorQuoter::class.java).sayQuite()
    }
}
