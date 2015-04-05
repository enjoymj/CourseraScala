import patmat.Huffman
import patmat.Huffman._
val a = Huffman
val sampleTree = a.makeCodeTree(
  a.makeCodeTree(Leaf('x', 1), Leaf('e', 1)),
  Leaf('t', 2)
)

Huffman.leastFreqLeaf( Huffman.times( Huffman.string2Chars("hellllllo" )))

val test =List(('t', 2), ('e', 1), ('x', 3))
val test2 = Huffman.times( Huffman.string2Chars("hellllllo" ))
val t = test.filter(pair => pair._1 != leastFreqLeaf(test).char)
t.tail
def t1:Long= System.nanoTime()
encode(frenchCode)( decode(frenchCode , secret)).equals(secret)
def t2:Long= System.nanoTime()
t2 - t1

def t3 = System.nanoTime()
quickEncode(frenchCode)( decode(frenchCode , secret)).equals(secret)
def t4= System.nanoTime()
-(t4 - t3)

val tes: List[Bit] = List(0,0,0,1)



