package Assignment4

object CaesarCipher extends App {
  //Alphabet definition
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  //encryption function
  def encrypt(c:Char,key:Int,alpha:String):Char=c match{
    case x if x.isLetter => alpha((alpha.indexOf(c.toUpper)+key)%alpha.length)
    case _ => ' '
  }
  //decryption function
  def decrypt(c:Char,key:Int,alpha:String):Char=c match{
    case x if x.isLetter => alpha((alpha.indexOf(c.toUpper)-key+26)%alpha.length)
    case _ => ' '
  }

  //to encrypt or decrypt the whole string
  val caesarC=(alg:(Char,Int,String)=>Char,s:String,key:Int,alpha:String)=>
    s.map(alg(_,key,alpha))

  //Get input
  println("Enter the secret message to encrypt : ")
  val input = scala.io.StdIn.readLine()
  println("Enter the key (shift) : ")
  val key = scala.io.StdIn.readLine().toInt

  //Encryption
  println("\nCipher code is : ")
  val cipherText = caesarC(encrypt, input, key, alphabet)
  println(cipherText+"\n")

  //Decryption
  println("The secret message is : ")
  println(caesarC(decrypt, cipherText, key, alphabet))

}
