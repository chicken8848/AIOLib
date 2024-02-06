#include <iostream>
#include <utility>
#include <vector>
namespace heap {
template <typename T>

class Heap {
private:
  std::vector<T> arr;

public:
  Heap(std::vector<T> &args) {
    arr = args;
    build_max_heap();
  };
  void max_heapify(int index, int heap_size) {
    int largest = index;
    int l = left_child_index(index);
    int r = right_child_index(index);
    if (l < heap_size && arr[l] > arr[largest]) {
      largest = l;
    }
    if (r < heap_size && arr[r] > arr[largest]) {
      largest = r;
    }
    if (largest != index) {
      std::swap(arr[index], arr[largest]);
      max_heapify(largest, heap_size);
    }
  }
  void insert(T k) {
    arr.push_back(k);
    int parent_i = arr.size() / 2;
    max_heapify(parent_i, arr.size());
  }
  T max() { return arr[0]; }
  T extract_max() {
    T max = arr[0];
    std::swap(arr[0], arr[arr.size() - 1]);
    arr.pop_back();
    max_heapify(0, arr.size());
    return max;
  }
  void build_max_heap() {
    int i_0 = arr.size() / 2;
    for (int j = i_0; j >= 0; j--) {
      max_heapify(j, arr.size());
    }
  }
  void heap_sort() {
    int heap_size = arr.size();
    build_max_heap();
    for (int i = arr.size() - 1; i >= 0; i--) {
      std::swap(arr[0], arr[i]);
      max_heapify(0, i);
    }
  }
  int max_child_index(int index) {
    int output = 0;
    int left_child_i = left_child_index(index);
    int right_child_i = right_child_index(index);
    if (arr[left_child_i] >= arr[right_child_i]) {
      int output = left_child_i;
    } else {
      int output = right_child_i;
    }
    return output;
  }
  int left_child_index(int index) { return 2 * index + 1; }
  int right_child_index(int index) { return 2 * index + 2; }
  void show() {
    for (const auto &i : arr) {
      std::cout << i << ",";
    }
  }
};

}; // namespace heap
