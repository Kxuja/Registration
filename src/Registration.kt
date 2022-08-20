import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

class Registration:RegistrationInterface {
    var scanner = Scanner(System.`in`)
  val randomValues={Random.nextInt(5,1000)}
    var list:ArrayList<Registration> = ArrayList()
    var count = 0
    data class Registration(var name:String, var year:Int, var phoneNumber:Int ,var kod:Int, var password:Int, var count:Int){
    }

    override fun sigIn() {
        print("Enter name => ")
        val name = scanner.next()
        print("Enter age => ")
        val year = scanner.nextInt()
        println("Enter phone Number =>")
        val phoneNumber=scanner.nextInt()
        println("Your kod =>")
        val ran = Random.nextInt(0, 10000)
        println(ran)
        println("Input kod =>")
        val code=scanner.nextInt()
        if (code==ran){
        print("Enter password => ")
        val password = scanner.nextInt()
        println()
        count++
        list.add(Registration(name, year,phoneNumber,ran, password,count))
            println("Success!!~")
    }else{
            println("Error")
        }
    }

    override fun signUp() {
        print("Enter name: ")
        val name = scanner.next()

        print("Enter password: ")
        val password = scanner.nextInt()
        for (i in list){
            if (password==i.password&&name.equals(i.name)){
                println("succes")
            }
            else {
                println("name or password error")
            }
            println()
        }



    }

    override fun list() {
        if (list.isEmpty()){
            println("IsEmpty :(")
        }else{
        list.forEach { registration ->
            println( " Name: "+ registration.name )
            println("Year: "+ registration.year )
            println("Phone Number: "+registration.phoneNumber)
            println("Index: "+ registration.count )
            println("Password "+"xxxxx")
            println()
        }
    }
    }

    override fun search() {
        println("Enter name =>")
        val searchName=scanner.next()
        val search: Registration?=list.find { it.name==searchName }
        println(search)
    }

    override fun remove() {
        try {


            print("Enter name: ")
            val name = scanner.next()

            print("Enter password: ")
            val password = scanner.nextInt()
            list.forEach { registration -> if (password==registration.password&&name.equals(registration.name)){

                list.removeIf { r-> name.equals(r.name) }
                println("succes")
            }


             }}catch (e:Exception){
            println()
        }



    }

    override fun update() {
        try {


            print("Enter name: ")
            val name = scanner.next()
            print("Enter password: ")
            val password = scanner.nextInt()
            list.forEach { registration ->
                if (password==registration.password&&name.equals(registration.name)){
                    print("Enter new name: ")
                    var names = scanner.next()
                    print("Enter new age: ")
                    val year = scanner.nextInt()
                    println("Enter phone Number =>")
                    val phoneNumber=scanner.nextInt()
                    println("Your kod =>")
                    val ran = Random.nextInt(0, 10000)
                    println(ran)
                    println("Input kod =>")
                    val code=scanner.nextInt()
                    if (code==ran){
                        print("Enter new password: ")
                        val newPasswords = scanner.nextInt()
                        println("Enter index ")
                        val c  = scanner.nextInt()
                        list.add(c,Registration(name, year,phoneNumber,ran, newPasswords,c))
                        list.removeIf{r-> name.equals(r.name)}
                        println("succes")

                        println()



                    }

                }

                println()
            }}catch (e:Exception){
            println("name or password error")
        }}
}