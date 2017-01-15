object facts{
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
    		val c :Long = factorial(b);
    		println(s"Factorial of the given number is : $c");
    	}
    	catch{
    		case _: Throwable => println("customer is underage or overage!!")
    	}
    	
	}

	def factorial(i : Int) : Long = {
		def fact(e : Int , accumulator : Long) : Long = {
			if(e<=1)
				accumulator
			else
				fact(e-1, e*accumulator)	
		}
		fact(i,1);
	}
}