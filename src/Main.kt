fun main(){
    print("Enter first number : ")
    var userinput1= readLine()!!.toInt()
    fun n1(num1 : Int) {
       println(num1)
    }
    n1(userinput1)

    print("Enter operator : ")
    var userinput2 =readLine()!!.toString()
    fun op (ope: String){
        println(ope)
    }
    print(userinput1)
    op(userinput2)

    print("Enter second number : ")
    var userinput3= readLine()!!.toInt()
    fun n2(num2 : Int) {
        if(num2==0){
           println("you can not / 0 ")
        }else
        println(num2)
    }

    fun  sum (nn1:Int , oop : String , nn2: Int){
        when (oop) {
            "+" -> {

                print( nn1+nn2)
            }
            "-" -> {
                print(nn1-nn2)
            }
            "*" -> {
                print(nn1*nn2)

            }
            "/" -> {
                print(nn1/nn2)

            }
        }


    }
    print(userinput1)
    print(userinput2)
    n2(userinput3)
    print("=")
    sum(userinput1,userinput2,userinput3)

}