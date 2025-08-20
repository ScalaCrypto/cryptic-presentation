 ### Provided Cryptos
 | Cipher        | Kind       | Package              |
 |---------------|------------|----------------------|
 | AES           | Symmetric  | cryptic-core         |
 | RSA           | Asymmetric | cryptic-core         |
 | EllipticCurve | Hybrid     | cryptic-bouncycastle |
 | RSA-AES       | Hybrid     | cryptic-core         |

Note:
We support AES and RSA

The EllipticCurve is asymmetric but has a hybrid mode.
EC adds a dependency on Bouncy Castle

The last RSA-AES is how we can make RSA a into hybrid crypto.

Let's talk about them in more detail &rarr;