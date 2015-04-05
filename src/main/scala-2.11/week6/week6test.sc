import forcomp.Anagrams._
import forcomp._

dictionaryPath.mkString("/")
getClass.getClassLoader.getResourceAsStream(dictionaryPath.mkString("/"))
val w = "abcd"

wordOccurrences("abcd")
val s= List( "abcd", "dba")
val c = List( ('b',1),('b',2))

def cumsum( ls: List[( Char, Int)]):Int = {
  var sum = 0
  ls.foreach( sum += _._2)
  sum
}

cumsum(c)

createPossibleNumOccurForChar( 'a',6 ).flatMap( w => w::List( ('b',2),('b',1)))
val sentence = List("a", "dog")
val l = combinations(sentenceOccurrences(sentence)).filter(occur => dictionaryByOccurrences.keySet.contains( occur ))
val occurrences =sentenceOccurrences(sentence)

val occur = l.tail.head
val remainOccur = subtract( occurrences, occur)
remainOccur== Nil
show(dictionaryByOccurrences.get(occur))
val Sentence = sentenceAnagramsFromOccur( remainOccur )
Sentence == List(Nil)





sentenceAnagrams(List("a","dog"))