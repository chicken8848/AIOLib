#include "heap.h"
#include "my_algos.h"
#include <array>
#include <iostream>
template <typename T> void print_array(T a) {
  for (auto const &value : *a) {
    std::cout << value << ", ";
  }
  std::cout << std::endl;
}

int main() {
  std::vector<int> arr = {9, 0, 8, 62, 5, 4};
  print_array(&arr);
  heap::Heap<int> myHeap(arr);
  int j = myHeap.extract_max();
  std::cout << j << std::endl;
  myHeap.show();
}
