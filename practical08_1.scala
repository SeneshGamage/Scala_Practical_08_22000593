import scala.io.StdIn.readLine
object CaesarCipher {

  // Encryption function
  def encryptCaesar(plaintext: String, shift: Int): String = {
    plaintext.map { char =>
      if (char.isLetter) {
        val base = if (char.isLower) 'a' else 'A'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  // Decryption function
  def decryptCaesar(ciphertext: String, shift: Int): String = {
    ciphertext.map { char =>
      if (char.isLetter) {
        val base = if (char.isLower) 'a' else 'A'
        ((char - base - shift + 26) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  // Cipher function
  def caesarCipher(data: String, shift: Int, mode: String): String = {
    mode.toLowerCase match {
      case "encrypt" => encryptCaesar(data, shift)
      case "decrypt" => decryptCaesar(data, shift)
      case _ => throw new IllegalArgumentException("Mode should be either 'encrypt' or 'decrypt'")
    }
  }

  // Example usage
  def main(args: Array[String]): Unit = {
    println("Enter the text:")
    val plaintext = readLine()
    val shift = 1
    // val shift = readLine().toInt


    // Encrypt the plaintext
    val encrypted = caesarCipher(plaintext, shift, "encrypt")
    println(s"Encrypted: $encrypted")

    // Decrypt the ciphertext
    val decrypted = caesarCipher(encrypted, shift, "decrypt")
    println(s"Decrypted: $decrypted")
  }
}
