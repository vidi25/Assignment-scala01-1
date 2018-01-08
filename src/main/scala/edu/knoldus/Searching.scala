package edu.knoldus

class Searching {

  def bSearch(list:Array[Int], element:Int,low:Int, high:Int):Int = {
    val mid=(low + high)/2
    if(low > high)
      {
        return -1;
      }
    else
    {
      if(list(mid) == element) {
        return list(mid)
      }
      else if(list(mid) > element) {
        return bSearch(list, element, low, mid - 1)
      }
      else {
        return bSearch(list, element, mid + 1, high)
      }
    }

  }

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
   if( bSearch(array,elem,0,array.length - 1) == -1) {
     return false
   }
    true
  }

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    if(array.isEmpty) {
      return false
    }
    for(list_element <- array){
      if ( elem == list_element ) {
        return true
      }
    }
    false
  }


}
