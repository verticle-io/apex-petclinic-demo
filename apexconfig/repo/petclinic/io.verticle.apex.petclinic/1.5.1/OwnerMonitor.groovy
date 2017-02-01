def before(){
}

def after(){

    def instance = context.getInstance()
    println("\n=============================================")
    println("Owner" + instance)
    println("new owner:" + arg1.getLastName() + ", " + arg1.getFirstName())
    println("=============================================\n")

    // send this to ES
    message.addField("firstname", arg1.getFirstName())
    message.addField("lastname", arg1.getLastName())

}
