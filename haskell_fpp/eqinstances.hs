module EqInstanceExer where

data TisAnInteger
  = TisAn Integer

instance Eq TisAnInteger where
  TisAn int == TisAn int' = int == int'

data TwoIntegers
  = Two Integer Integer

instance Eq TwoIntegers where
  (Two int1 int2) == (Two int1' int2') = int1 == int1' && int2 == int2'

data StringOrInt
  = TisAnInt Int
  | TisAString String

instance Eq StringOrInt where
  (==) (TisAnInt int) (TisAnInt int') = int == int'
  (==) (TisAString str) (TisAString str') = str == str'
  (==) _ _ = False

data Pair a
  = Pair a a

instance (Eq a) => Eq (Pair a) where
  (Pair a1 a2) == (Pair a1' a2') = (a1 == a1') && (a2 == a2')

data Tuple a b
  = Tuple a b

instance (Eq a, Eq b) => Eq (Tuple a b) where
  (Tuple a b) == (Tuple a' b') = (a == a') && (b == b')

data Which a
  = ThisOne a
  | ThatOne a

instance (Eq a) => Eq (Which a) where
  (ThisOne a1) == (ThisOne a2) = a1 == a2
  (ThatOne a1) == (ThatOne a2) = a1 == a2
  _ == _ = False

data EitherOr a b
  = Hello a
  | Goodbye b

instance (Eq a, Eq b) => Eq (EitherOr a b) where
  (Hello a1) == (Hello a2) = a1 == a2
  (Goodbye a1) == (Goodbye a2) = a1 == a2
  _ == _ = False
