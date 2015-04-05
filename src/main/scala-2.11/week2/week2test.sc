import week2.funsets.{FunSets, Main}

val test = Main
FunSets.singletonSet(1)(1)

val a = FunSets.union( FunSets.singletonSet(1), FunSets.singletonSet(2))
val b = FunSets.union( FunSets.singletonSet(2), FunSets.singletonSet(3))

FunSets.contains(a,4)
val c = FunSets.union(a,b)

FunSets.contains(c,3)

val d = FunSets.diff(a,b)

FunSets.toString(c)

FunSets.toString( FunSets.filter( c, (i:Int) => if(i == 2) true else false ))

FunSets.forall(c, (i:Int)=> if(i==5) false else true )

FunSets.exists(c, (i:Int)=> if(i==5) true else false )


FunSets.toString( FunSets.map( c, (i:Int) => i *i *i))




