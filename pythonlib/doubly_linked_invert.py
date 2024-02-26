from random import randint

class linked_obj:
    def __init__(self, key):
        self.key = key
        self.next = None
        self.prev = None

    def __str__(self):
        return self.key


def doubly_linked_invert(x, y):
    v = x.next
    z = y.next
    w = v.next
    while x.next is not None:
        if y.key > x.key:
            y.next = x
            x.prev = y
            v.next = y
            y.prev = v
            x = v
            y = z 
            w = w.next
            z = z.next
        else:

