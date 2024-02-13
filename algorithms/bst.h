#include <iostream>
#include <utility>
#include <vector>

namespace bst {

class node {};

template <class T> class bst {
private:
  std::vector<node> arr;
  node root;

public:
  bst(std::vector<node> &args) {}
  void tree_insertion(node k) {
    node y = find_parent(k);
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
    node y;
    node z = root;
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
