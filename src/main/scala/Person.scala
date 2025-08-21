
import cryptic.{*, given}
import cryptic.crypto.Caesar.given
import cryptic.crypto.Caesar.Key

case class Person(id:Long, email:Encrypted[String])

given key:Key = Key(2)

val martin = Person(17, "martin@scalacrypto.org".encrypted)

val bytes = martin.email.bytes