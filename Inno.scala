class InnoString(val st : String){
	//private variable
	private var s : String = st;
	//concatenation function
	def conca ={
		s = s.concat(st);
	}
	// overloaded + operator
	def +(that : InnoString)=
		new InnoString(this.st.concat(that.st))
	// overloaded == operator	
	def ==(that : InnoString) : Boolean =
		return (this.st.equals(that.st))
	// isplaindrome function
	def isPalin : Boolean ={
		s = s.toLowerCase();
		val rs : String = s.reverse;
		if(rs == s)
			return (true);
		else
			return (false);
	}
	// return the string
	override def toString  = s;
}

object Inno{
	def main(args : Array[String]){
		var a = new InnoString("aaa");
		var b = new InnoString("Girl");
		//print the value of a using the toString
		println(a);
		//print the value of b using the toString
		println(b);
		//concatenate using + overloaded operator
		println(a + b);	
		//check for comparison using ==
		println(a==b);	
		//check for the palindrome
		println(a.isPalin);
		// for concatenation
		b.conca;		
		println(b);
	}
}
