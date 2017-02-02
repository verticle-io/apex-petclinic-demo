import java.util.Date

def before(){
  println("Crash detected!")
  message.addField("crashtime", new Date())
}

def after(){    
}
