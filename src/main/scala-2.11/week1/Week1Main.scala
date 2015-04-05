package week1

object Week1Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

    println(balance("(if (zero? x) max (/ 1 x))".toList))
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =  if( c == 0 || r == c  ) 1 else if( c > 0 && c < r ) pascal(c, r-1) + pascal(c-1, r-1) else throw new Exception("no in the triangle")

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanceWithNum( chars: List[Char], signatrue: Int ): Int = {
      if( chars.isEmpty && signatrue == 0) 0
      else if( chars.isEmpty) -1
      else if( chars.head == '(' ) balanceWithNum( chars.tail, signatrue+1)
      else if( chars.head == ')' && signatrue > 0) balanceWithNum( chars.tail, signatrue-1)
      else if( chars.head == ')' && signatrue <= 0 ) -1
      else balanceWithNum(chars.tail, signatrue)
    }

    if(  balanceWithNum( chars,0 ) == 0 ) true else false
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if( money <= 0 || coins.isEmpty) 0
      else if( coins.tail.isEmpty) {
        if(money % coins.head == 0) 1
        else 0
    }
    else if( money < coins.head) countChange(money, coins.tail)
      else if ( money == coins.head ) countChange(money, coins.tail) + 1
      else countChange( money - coins.head, coins) + countChange(money, coins.tail)

  }
}
