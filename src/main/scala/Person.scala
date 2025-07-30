
import cryptic.Encrypted
import cryptic.syntax.*
import cryptic.serialization.StringSerializer.stringSerializer
import cryptic.crypto.Caesar.given
import cryptic.crypto.Caesar.Key

case class Person(name:String, email:Encrypted[String])

given key:Key = Key(2)

val martin = Person("martin", "zac@cyberzac".encrypted)

val bytes = martin.email.bytes