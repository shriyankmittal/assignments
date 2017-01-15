object factorial{
	def main(args : Array[String]){
		if (args.length != 1) {
    		Console.err.println("no arguments provided")
    		System.exit(1)
		}
		val a : Int = args(0).toInt;
		var b : Int = 0;
    	b = a;
    	try{
    		if(b>100 || b<1){
    			throw new Exception("Failure");
    		}
    		val c :Long = facts(b);
    		println(s"Factorial of the given number is : $c");
    	}
    	catch{
    		case _: Throwable => println("customer is underage or overage!!")
    	}
    	
	}

	def facts(b : Int) : Long = {
		var i : Int = 0;
		var fact : Long = 1;
		for(i <- 1 to b){
    		fact *=  i ;
    	}
    	return fact;
	}
}