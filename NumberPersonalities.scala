/**
  * Created by Tom on 13/04/2017.
  */
class NumberPersonalities {

  object NumberPersonalities {
    val limit = 100;

    def main(args: Array[String]): Unit = {
      for (i <- limit) {
        println(i + " ")
        if (isPrime(i)) {
          print("p, ")
        } else {
          print("c, ")
        }
        if (isHappy(i)) {
          print("h, ")
        } else {
          print("u, ")
        }
        if (isDeficient(i)) {
          print("d, ")
        }
        if (isHonest(i)) {
          print("ht, ")
        } else {
          print("dis, ")
        }
        if (isPerfect(i)) {
          print("per")
        }
        if (isPronic(i)) {
          print("pr, ")
        }
        if (isSmug(i)) {
          print("sm, ")
        }
        if (isSquare(i)) {
          print("s, ")
        }
        if (isTriangular(i)) {
          print("t, ")
        }
      }
    }

    def isPrime(n: Int): Boolean = {
      for (i <- n - 1) {
        if (n % i == 0) {
          return false;
        } else {
          return true;
        }
      }

    }

    def isHappy(n: Int): Boolean = {
      var x = n
      while (x != 0) {
        x = x * x
        x = x + x
      }
      return true
    }

    def isTriangular(n: Int): Boolean = {
      var z = 1
      var x = n
      while (x > 0) {
        x = x - z
        z += 1
        if (x == 0) {
          return true
        }
      }
      return false
    }


    def isSquare(n: Int): Boolean = {
      var z = 2
      var x = n
      while (x > 0) {
        x = x - z
        z += 1
        if (x == 0) {
          return true
        }
      }
      return false
    }

    def isSmug(n: Int): Boolean = {
      var z = 1
      var x = n
      var y = 1
      while (x > z) {
        z = z * z
        x = x - z
        y += 1
        z = y
        if (x == 0) {
          return true;
        }
      }
      return false;
    }


    def isHonest(n: Int): Boolean = {
      var k = 1
      var j = n
      while (k < n) {
        if (j/k == k && k*k != n) {
          return false
        }
        k += 1
      }
     return true
    }

    def isPronic(n: Int): Boolean = {
      var k = 1
      while (k < n) {
        k = k * (k + 1)
        if (k == n) {
          return true;
        }
      }
      return false;
    }

    def isDeficient(n: Int): Boolean = {
      if (n < sumOfPositiveDivisorsof(n)) {
        return true
      } else {
        return false
      }
    }

    def isPerfect(n: Int): Boolean = {
      if (n == sumOfPositiveDivisorsof(n)) {
        return true
      } else {
        return false
      }
    }

    def isAbundant(n: Int): Boolean = {
      if (n < sumOfPositiveDivisorsof(n)) {
      return true
    } else {
      return false
    }
    }

    def sumOfPositiveDivisorsof(n: Int): Int = {
      var k = 1
      var back = 0
      while (k <= n/2) {
        if (n % k == 0) {
          back += k
        }
        k += 1
      }
      return back
    }


  }

}