import week3.objsets._

val a = false
val set1 = new Empty
val set2 = set1.incl(new Tweet("a", "a body", 20))
val set3 = set2.incl(new Tweet("b", "b body", 20))
val c = new Tweet("c", "c body", 7)
val d = new Tweet("d", "d body", 9)
val set4c = set3.incl(c)
val set4d = set3.incl(d)
val set5 = set4c.incl(d)
def asSet(tweets: TweetSet): Set[Tweet] = {
  var res = Set[Tweet]()
  tweets.foreach(res += _)
  res
}

def size(set: TweetSet): Int = asSet(set).size
val tw = new Tweet("a","a body",20)
tw.user
set2.filterAcc(tw => tw.user == "a",new Empty)
size(set2.filter(tw => tw.user == "a"))
size( GoogleVsApple.googleTweets)
size( GoogleVsApple.appleTweets)
size( GoogleVsApple.googleTweets.union( GoogleVsApple.appleTweets))
val test =  GoogleVsApple.googleTweets.union( GoogleVsApple.appleTweets)
GoogleVsApple.trending
GoogleVsApple.trending foreach println

