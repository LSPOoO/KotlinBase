package com.kotlin.example

//模拟用户登陆，Lambda表达式
//函数引用
fun main(){
//    loginAction("linshipeng", "lsp929488", ::handleLoginResult)

    //action的类型是函数类型(Int, Int) -> Int
    val action = action(3)
    //actionResult的类型是Int
    val actionResult = action(10, 20)
    println(actionResult)
}

//action函数的返回类型是：函数类型(Int, Int) -> Int
private fun action(actionType : Int) : (Int, Int) -> Int{
    when(actionType) {
        //执行加法
        1 -> return {numberA : Int, numberB : Int ->
            numberA + numberB
        }
        //执行减法
        2 -> return {numberA : Int, numberB : Int ->
            numberA - numberB
        }
        //执行乘法
        3 -> return {numberA : Int, numberB : Int ->
            numberA * numberB
        }
        else -> return {numberA : Int, numberB : Int ->
            numberA + numberB
        }
    }
}

private fun handleLoginResult(message: String, code: String){
    println("登陆返回信息：${message}-${code}")
}

private inline fun loginAction(account : String, password : String, callBack : (String, String) -> Unit){
    if (account.isEmpty() || password.isEmpty()) {
        callBack("登陆账号或密码不可为空...", "000001");
        return
    }
    if (account.count() < 6 || password.count() < 6) {
        callBack("登陆账号或密码不符合要求...", "000002");
        return
    }
    val loginResult = loginService(account, password);
    if (!loginResult){
        callBack("登陆失败，账号或密码不匹配...", "000003");
        return
    }
    callBack("登陆成功...", "000000");
}

private fun loginService(account : String, password : String): Boolean {
    return account == "linshipeng" && password == "lsp929488"
}