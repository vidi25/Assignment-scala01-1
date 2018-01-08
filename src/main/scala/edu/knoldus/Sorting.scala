package edu.knoldus

class Sorting {

  def insertionSort(array: Array[Int]): Array[Int] = {
    val arrayLength:Int = array.length
    for(i <- 1 until arrayLength)
    {
      val temp:Int = array(i)
      var j:Int = i - 1
      while(j >= 0 && array(j) > temp)
      {
        array(j + 1) = array(j)
        j = j - 1
      }
      array(j + 1) = temp

    }
    array
  }


  def selectionSort(array: Array[Int]): Array[Int] = {
    val arrayLength:Int = array.length;
    var min:Int = 0
    for(i <- 0 until arrayLength - 1)
    {
      min = i
      for(j <- i + 1 until arrayLength)
      {
        if(array(j) < array(min))
          min = j
        val temp:Int = array(min)
        array(min) = array(i)
        array(i) = temp

      }

    }
    array
  }

  def bubbleSort(array: Array[Int]): Array[Int] = {
    val arrayLength:Int = array.length;
    for(i <- 0 until arrayLength - 1)
    {
      for(j <- 0 until arrayLength - i - 1)
      {
        if( array(j) > array(j + 1))
        {
          val temp:Int = array(j)
          array(j) = array(j + 1)
          array(j + 1) = temp
        }
      }
    }
    array
  }

}
