module EllipticPoint (EllipticPoint (x, y)) where

data EllipticPoint = EllipticPoint
  { x :: Integer,
    y :: Integer
  }
  deriving (Show)

instance Eq EllipticPoint where
  (EllipticPoint x1 y1) == (EllipticPoint x2 y2) = x1 == x2 && y1 == y2
  _ /= _ = False
