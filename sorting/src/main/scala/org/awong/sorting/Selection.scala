package org.awong.sorting


object Selection {
  def sort[T](xs: Array[T])(implicit ordering: Ordering[T]): Array[T] = {
    import ordering._
    val array = xs
    for (i <- 0 until array.length) {
      var min = i
      for (j <- i until array.length) {
        if (array(j) < array(min))
          min = j
      }
      swap(array, i, min)
    }
    array
  }
}