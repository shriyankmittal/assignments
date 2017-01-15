import com.innovaccer._
object Hello
{
def main(args:Array[String])
{
println("Enter the requisite strings")
val x = readLine()
val a = new InnoString(x)
val b = new InnoString(readLine())
println(a+b)
println(a.isPalin())
}
}
