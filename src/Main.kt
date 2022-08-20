import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val registration = Registration()
    while (true){



        println("1-> Sign in")
        println("2-> Sign up")
        println("3-> List of users")
        println("4-> Remove")
        println("5-> Update")
        println("6-> Search")
        val n = scanner.nextInt()
        when(n){
            1->{
                registration.sigIn()
            }
            2->{
                registration.signUp()
            }
            3->{
                registration.list()
            }
            4->{
                registration.remove()
            }
            5->{
                registration.update()
            }
            6->{
                registration.search()
            }
        }

    }
}