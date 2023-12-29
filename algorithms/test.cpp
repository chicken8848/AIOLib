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
  std::array<int, 6> arr = {9, 0, 8, 62, 5, 4};
  print_array(&arr);
  my_algos::insertion_sort(arr, 6);
  print_array(&arr);
}
