#include <iostream>
#include <utility>
#include <vector>

namespace bst {

class node {
private:
public:
};

template <typename T> class bst {
private:
  std::vector<node> arr;
  T root;

public:
  bst(std::vector<node> &args) {}
  void tree_insertion(T k) {
    T y = find_parent(k);
    k.parent = y;
    if (arr.root == NULL) {
      arr.root = k;
    } else if (k.key < y.key) {
      y.left = k;
    } else {
      y.right = k;
    }
  }
  T find_parent(T k) {
    T y;
    T z = root;
    while (z != NULL) {
      y = z;
      if (k < z) {
        z = z.left;
      } else {
        z = z.right;
      }
    }
  }
};

} // namespace bst
