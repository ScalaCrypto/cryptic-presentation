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

The last crypto, RSA-AES, will show use RSA as a hybrid crypto.
It is also the default crypto in the cryptic library.

Let's talk about them in more detail &rarr;