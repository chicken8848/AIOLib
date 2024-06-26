module Point (Point (..)) where

data Point = Point
  { x :: Integer,
    y :: Integer
  }
  deriving (Show)

instance Eq Point where
  (Point x1 y1) == (Point x2 y2) = x1 == x2 && y1 == y2
  _ /= _ = False
