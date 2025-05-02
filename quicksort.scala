object Hello {
    import scala.collection.mutable.ArrayBuffer
  
    def quicksortAnArray(buffer: ArrayBuffer[Int]): ArrayBuffer[Int] = {
        if(buffer.length <= 1){
            return buffer
        }
        else {
            val smallerThanPivot = ArrayBuffer[Int]()
            val biggerThanPivot = ArrayBuffer[Int]()
            var pivot = buffer(0)
            for ( i <- buffer.indices) {
                if(i != 0) {
                    if (buffer(i) >= pivot){
                        biggerThanPivot += buffer(i)
                    }
                    else {
                        smallerThanPivot += buffer(i)
                    }
                }
            }
            val biggerSorted = quicksortAnArray(biggerThanPivot)
            val smallerSorted = quicksortAnArray(smallerThanPivot)
    
            return smallerSorted ++= ArrayBuffer(pivot) ++= biggerSorted   
        }
  
    }
  
    def main(args: Array[String]): Unit = {
        val testArray = ArrayBuffer(4,5,21,3,4,5,234,23,4,22,3443,4,3,6,7,9)
        val sortedArray = quicksortAnArray(testArray)
        print(sortedArray)
    }
}