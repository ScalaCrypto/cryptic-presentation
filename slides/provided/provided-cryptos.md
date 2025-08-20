 ### Provided Cryptos
 | Cipher        | Kind       | Package              |
 |---------------|------------|----------------------|
 | AES           | Symmetric  | cryptic-core         |
 | RSA           | Asymmetric | cryptic-core         |
 | EllipticCurve | Hybrid     | cryptic-bouncycastle |
 | RSA-AES       | Hybrid     | cryptic-core         |

Note:
We support AES and RSA as a symmetric and asymmetric
crypto

The EllipticCurve is asymmetric but have a hybrid mode.
EC adds a dependency on Bouncy Castle

The last RSA-AES is how we make RSA a hybrid crypto.

Let's talk about them in more detail &rarr;