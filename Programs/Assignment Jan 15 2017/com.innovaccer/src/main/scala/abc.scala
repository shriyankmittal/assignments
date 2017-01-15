package com.innovaccer
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
